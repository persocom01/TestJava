// Demonstrates java datatypes.
public class _01_ClassTest {
  // There are 8 primitive (basic) data types in java. Online documentation can
  // be found here:
  // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
  byte byteMax = 127;
  short shortMax = 32767;
  int userAge;
  // The main difference between byte -> long is the maximum and minimum
  // supported numbers. The smallest, byte supports -128 to 127.
  long registrationNumber;
  float weight;
  // Double supports more numbers than float.
  double doubleWeight;
  // A char is a single character. It can be a letter, number, or one of the
  // unicode escape sequences like '\u0000'. char is in single quotes '' while
  // String is in double quotes "". They are not interchangable.
  char type = '\u0000';
  boolean isFat = true;
  // A class variable. Without static, it will not be accepted by a method.
  static String name = "Milo";
  // Method names are in camelCase, with the first letter in lower case.
  // Java program processing starts with the main method, which is neccessary in
  // every program.
  public static void main(String []args) {
    System.out.println("Hello World");
  }
}
