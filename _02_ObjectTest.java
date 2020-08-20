// Demonstrates objects.

public class _02_ObjectTest {
  // There are 3 types of variables:
  // Local, which are variables defined inside methods.
  // Instance, which are variables defined inside classes but outside methods.
  // Class, which are like instance variables but have the static keyword. When
  // passing variables to a method, only Class variables are allowed.
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

  // A constructor is a method that has the same name as the class. Every class
  // has a constructor, but if not explicitly defined, a default constructor is
  // used.
  // This constructor has one argument, name.
  public _02_ObjectTest(String name) {
    System.out.println("Hello " +  name);
  }

  public void setAge(int age) {
    // Local variables take precedence over instance variables. If userAge were
    // age instead, the value of the instance variable will not be set.
    userAge = age;
  }

  public int getAge() {
    System.out.println("Your age is " + userAge);
    return userAge;
  }

  public static void main(String []args) {
    // Create class object.
    _02_ObjectTest myObj = new _02_ObjectTest(name);
    // Call method.
    myObj.setAge(25);
    myObj.getAge();
    // Retrieve instance variable.
    System.out.println("byteMax value is " + myObj.byteMax);
  }
}
