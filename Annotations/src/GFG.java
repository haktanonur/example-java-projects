// Java Program Illustrating The @Deprecated Annotation
// Using deprecated variable name

// Main class
public class GFG {

    // @deprecated number1 will be replaced by
    // newnum field
    @Deprecated
    // Declaring and initializing integer variables
            int number = 100;
    // New field
    final int newnumber = 100;

    // Main
    public static void main(String a[])
    {
        // Creating an object for the class
        GFG obj = new GFG();

        // Printing the number
        System.out.println(obj.number);
    }
}