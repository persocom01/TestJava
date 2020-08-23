// In java, a class is a blueprint from which objects are created.

public class _02_ObjectTest {

  int userAge;
  char letter = 'A';

  static String name = "Milo";

  // A constructor is a special method that has the same name as the class.
  public _02_ObjectTest(String name) {
    System.out.println("Hello " +  name);
  }

  public void setAge(int age) {
    userAge = age;
  }

  public int getAge() {
    System.out.println("Your age is " + userAge);
    return userAge;
  }

  public static void main(String []args) {
    // Create class object.
    _02_ObjectTest objTest = new _02_ObjectTest(name);
    // Call method.
    objTest.setAge(25);
    objTest.getAge();
    // Retrieve instance variable.
    System.out.println("char value is " + objTest.letter);
  }
}
