// Demonstrates various modifiers.
// Modifiers can be divided into two types:
// access modifiers - default, private, public, protected
// non access modifiers

class AccessVariables {
  // By default, access is available to other classes in the same package.
  int a = 1;
  // private access restricts access to the class itself. It is the most
  // restrictive access level. Classes and interfaces cannot be private.
  // private variables can still be accessed if a public method within the
  // class calls it.
  private int b = 2;
  // public access is available to different packages provided it is imported.
  // All public methods and variables of a class are inherited by their
  // subclasses.
  public int c = 3;
  // protected access restricts access to the class and its subclasses. Classes
  // and interfaces cannot be protected.
  protected int d = 4;
}

public class _06_ModifiersTest {

  public void accessTest() {
    AccessVariables accessVar = new AccessVariables();
    System.out.println("default: " + accessVar.a);
    // private variables cannot be accessed even if the class it is in is
    // called.
    // System.out.println("default: " + accessVar.b);
    System.out.println("default: " + accessVar.c);
    System.out.println("default: " + accessVar.d);
  }

  public static void main(String []args) {
    _06_ModifiersTest modTest = new _06_ModifiersTest();
    modTest.accessTest();
  }
}
