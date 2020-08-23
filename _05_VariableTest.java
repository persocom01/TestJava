// Demonstrates variables.

public class _05_VariableTest {
  // The shortest way to define a variable is:
  // dataType variableName;
  // Variables can also be given a value when defined, or multiple variables
  // can be defined at the same time.
  int a, b, c;
  int d = 4, e = 5;

  // There are 3 types of variables:
  // Local - defined inside methods, they cannot have access modifiers and have
  // no default value.
  public void localVar() {
    int d;
    // Without this line, the following error will occur:
    // error: variable d might not have been initialized
    d = 44;
    // Local variables take precedence over instance or class variables.
    System.out.println("local var: " + d);
  }

  // Instance - variables defined inside classes but outside methods.
  public void instanceVar() {
    // Instance variables have default values.
    System.out.println("instance var: " + a);
  }

  // Class - instance variables with the static keyword.
  // Class variables are rarely used other than being declared constants.
  // Constants are varialbes  that are final and static, and never change their
  // value. When class variables are public static final, their names are in
  // all caps.
  public static final String TITLE = "variable testing program";
  public void classVar(String s) {
    // When passing variables to a method, only class variables are allowed.
    System.out.println("class var: " + s);
  }

  public static void main(String []args) {
    _05_VariableTest varTest = new _05_VariableTest();
    varTest.localVar();
    varTest.instanceVar();
    varTest.classVar(TITLE);
  }

}
