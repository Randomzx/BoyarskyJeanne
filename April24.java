package booknew.BoyarskyJeanne;

import java.util.ArrayList;
import java.util.List;


/*
 page 38-39
 page 42
 page 44
 page 55-56
 page 59
 */
public class April24 {
}


/*
The finalize() method gets called if the garbage collector tries to collect the object. If the garbage collector
doesn’t run, the method doesn’t get called. If the garbage collector fails to collect the object
and tries to run it again later, the method doesn’t get called a second time.
*/
class Finalizer {
    protected void finalize() {
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {

        // this call produces no output when we run it
        // program exits before there is any need to run the garbage collector.
        // While f is eligible for garbage collection, Java has better things to do than take out the trash constantly.
        Finalizer f = new Finalizer();
    }
}

// finalize() is only run when the object is eligible for garbage collection.
// The problem here is that by the end of the method, the object is no longer eligible for garbage
// collection because a static variable is referring to it and static variables stay in scope until
// the program ends. Java is smart enough to realize this and aborts the attempt to throw out
// the object. If later on in the program objects is set to null can try to remove the object from memory
// Java remembers already running finalize() on this object and will not do so again.
// The lesson is that the finalize() call could run zero or one time.
class Finalizer0 {
    private static List
            objects = new ArrayList();

    protected void finalize0() {
        objects.add(this); // no longer eligible for garbage collection
    }
}

// What is the output of the following program?
class WaterBottle {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}
// ans: Empty = false, Brand = null
// Boolean fields initialize to false and references initialize to null, so empty is false and brand is null. Brand = null is output


// Given the following classes, what is the maximum number of imports that can be remove and have the code still compile?
/*
package aquarium; public class Water { }
package aquarium;
import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;
public class Tank {
public void print(Water water) {
System.
out.println(water); }
}
 */

// ans: 4
// The first two imports can be removed because java.lang is automatically imported.
// The second two imports can be removed because Tank and Water are in the same package, making the correct answer 4.
// If Tank and Water were in different packages, one of these two imports could be removed. In that case, the answer would be option 3.

// Numeric Promotion Rules
//1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
//2. If one of the values is integral and the other is floating-point,
    // Java will automatically promote the integral value to the floating-point value’s data type.
// 3. Smaller data types, namely byte, short, and char, are first promoted to int any time
    //they’re used with a Java binary arithmetic operator, even if neither of the operands is int.
//4. After all promotion has occurred and the operands have the same data type,
    // the resulting value will have the same data type as its promoted operands

// One common practice in a certification exam, albeit less common in the real world, is to
// apply multiple increment or decrement operators to a single variable on the same line:
class incredecr{
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

}
// x is modified three times on the same line
// Each time it is modified, as the expression moves from left to right,
//the value of x changes, with different values being assigned to the variable.
// x = 2, y = 7