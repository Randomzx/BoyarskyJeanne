package booknew.BoyarskyJeanne;

/*
page 60
page 90
*/

public class April25 {
}

// Overflow and Underflow
// The expressions in the previous example now compile, although there’s a cost. The sec-
//ond value, 1,921,222, is too large to be stored as a short, so numeric overflow occurs
//and it becomes 20,678. Overflow is when a number is so large that it will no longer fit
//within the data type, so the system “wraps around” to the next lowest value and counts
//up from there. There’s also an analogous underflow, when the number is too low to fit in
//the data type.

// Complex operators are really just glorified forms of the simple assignment
//operator, with a built-in arithmetic or logical operation that applies the left- and right-hand
//sides of the statement and stores the resulting value in a variable in the left-hand side of the
//statement.


// relational operators, which compare two expressions and return a
//boolean value. The first four relational operators are applied to numeric
//primitive data types only. If the two numeric operands are not of the same data type, the
//smaller one is promoted in the manner as previously discussed.


// The logical operators, (&), (|), and (^), may be applied to both numeric and boolean data
//types. When they’re applied to boolean data types, they’re referred to as logical operators.
//Alternatively, when they’re applied to numeric data types, they’re referred to as bitwise
//operators, as they perform bitwise comparisons of the bits that compose the number.


// conditional operators, && and ||, are often referred to as
//short-circuit operators. The short-circuit operators are nearly identical to the logical
// operators, & and |, respectively, except that the right-hand side of the expression may never be
//evaluated if the final result can be determined by the left-hand side of the expression.
/*
For example, consider the following statement:
boolean x = true || (y < 4);
Referring to the truth tables, the value x can only be false if both sides of the expression
are false. Since we know the left-hand side is true, there’s no need to evaluate the right-hand
side, since no value of y will ever make the value of x anything other than true.
*/

// The conditional operator, ? :, otherwise known as the ternary operator, is the only operator
//that takes three operands and is of the form:
    // booleanExpression ? expression1 : expression2
//The first operand must be a boolean expression, and the second and third can be any
//expression that returns a value. The ternary operation is really a condensed form of an if-
//then-else statement that returns a value.

// As of Java 7, only one of the right-hand expressions of the ternary operator will be evalu-
//ated at runtime. In a manner similar to the short-circuit operators, if one of the two right-
//hand expressions in a ternary operator performs a side effect, then it may not be applied
//at runtime.

// Compile-time Constant Values
// The values in each [case] statement must be compile-time constant values of the same data
//type as the [switch] value. This means you can use only literals, enum constants, or final
// constant variables of the same data type. By final constant, we mean that the variable
//must be marked with the final modifier and initialized with a literal value in the same
//expression in which it is declared

// for-each statment
// The for-each loop declaration is composed of an initialization section and an object to
//be iterated over. The right-hand side of the for-each loop statement must be a built-in Java
//array or an object whose class implements java.lang.Iterable, which includes most of
//the Java Collections framework. The left-hand side of the for-each loop must include a
//declaration for an instance of a variable, whose type matches the type of a member of the
//array or collection in the right-hand side of the statement. On each iteration of the loop, the
//named variable on the left-hand side of the statement is assigned a new value from the array
//or collection on the right-hand side of the state

// Adding Optional Labels
// A label is an optional pointer to the head of a statement that allows the application flow to jump to it or break from it.
// It is a single word that is proceeded by a colon (:).

// The break Statement
// a break statement transfers the flow
//of control out to the enclosing statement. The same holds true for break statements that
//appear inside of while, do-while, and for loops, as it will end the loop early