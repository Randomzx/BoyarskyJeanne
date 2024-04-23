package booknew;

public class April22 {
}

final class Home {
    String name;
    int rooms;
//INSERT CONSTRUCTOR HERE
}

/*
which options, when inserted will define valid overloaded constructors for the class Home? (Choose 3 options.)
a Home() {} (ANS)
b Float Home() {}
c protected Home(int rooms) {} (ANS)
d final Home() {}
e private Home(long name) {} (ANS)
f float Home(int rooms, String name) {}
g static Home() {}
 */

// Given the following code, which of the following statements are true?
class MyExam {
    void question() {
        try {
            question();
        } catch (StackOverflowError e) {
            System.out.println("caught");
        }
    }
    public static void main(String args[]) {
        new MyExam().question();
    }
}

/*
a The code will print caught.
    [Correct]. The control will be transferred to the exception handler for StackOverflowError when it’s encountered.
b The code won’t print caught.
c The code would print caught if StackOverflowError were a runtime exception.
    [Correct]. Exception handlers execute when the corresponding checked or runtime exceptions are thrown.
d The code would print caught if StackOverflowError were a checked exception.
    [Correct]. Exception handlers execute when the corresponding checked or runtime exceptions are thrown.
e The code would print caught if question() throws the exception NullPointer-Exception.
    [incorrect]. An exception handler for the class StackOverflow can’t handle exceptions of the class
    NullPointerException because NullPointerException is not a superclass of StackOverflowError.
 */




// you must first define the annotation type. The syntax for doing this is:
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}

// The annotation type definition looks similar to an interface definition where the keyword interface
// is preceded by the at sign (@) (@ = AT, as in annotation type). Annotation types are a form of interface,
// which will be covered in a later lesson. For the moment, you do not need to understand interfaces.

//The body of the previous annotation definition contains annotation type element declarations,
// which look a lot like methods. Note that they can define optional default values.

//After the annotation type is defined, you can use annotations of that type, with the values filled in, like this:
@ClassPreamble (
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"}
)
 class Generation3List extends Generation2List {

// class code goes here

}