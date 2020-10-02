// Demonstrates a basic java program.
// Class names can only begin with a letter, a currency ($) or _.
// Java is case sensitive. By convention, class names are written in CamelCase
// with the first letter in caps. The name of the file should also match the
// name of the class, including the case.
// Java also has a list of keywords that cannot be used as names for classes,
// variables etc. The list can be found here:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html

// Classes can have modifiers, which are classified into access and non access
// modifiers.
// Access modifiers: default, public, protected, private.
// Non access modifiers: final, abstract, strictfp.
// Classes cannot be protected, because they are by default protected, and can
// only be accessed by classes within the same package. There can only be one
// public class per .java file.
public class _01_ClassTest {
  // Method names are in camelCase, with the first letter in lower case.
  // Java program processing starts with the main method, which is neccessary in
  // every program.
  public static void main(String []args) {
    System.out.println("Hello World");
  }
}
