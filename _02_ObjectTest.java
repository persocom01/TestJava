// In java, a class is a blueprint from which objects are created.

public class _02_ObjectTest {
  // There are 3 types of variables:
  // Local, which are variables defined inside methods.
  // Instance, which are variables defined inside classes but outside methods.
  // Class, which are like instance variables but have the static keyword. When
  // passing variables to a method, only Class variables are allowed.
  int userAge;
  char letter = 'A';
  // A class variable. Without static, it will not be accepted by a method.
  static String name = "Milo";

  // A constructor is a special method that has the same name as the class.
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
    System.out.println("char value is " + myObj.letter);
  }
}
