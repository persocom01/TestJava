// Demonstrates constructors.
class _03a_ConTest {
  int x;

  // A constructor is a special method that has the same name as the class.
  // Every class has a constructor. If one is not explicitly defined, a default
  // constructor is used. As constructors are used to initiate the object, it
  // cannot return anything.
  // Constructors can optionally accept arguments.
  public _03a_ConTest(int num) {
    x = num;
  }
}

class _03_ConstructorTest {
  public static void main(String args[]) {
    _03a_ConTest c1 = new _03a_ConTest(100);
    _03a_ConTest c2 = new _03a_ConTest(200);
    System.out.println("1st number: "+ c1.x + "\n2nd number: " + c2.x);
  }
}
