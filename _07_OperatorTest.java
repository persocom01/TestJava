// Demonstrates operators in java.

public class _07_OperatorTest {

  void arithmeticOperatorTest() {
    int x;
    double y;
    // Java automatically converts int to double when an operation occurs
    // between mixed types but not the other way round, even if the double is
    // 1.0.
    // Assignment operators exist for all arithmetic operators except ++ and --.
    // This means statements like:
    // y = y + x
    // can be written as:
    // y += x
    y = 1.0 + 1 - 1;
    System.out.println("addition/subtraction:\n" + y);
    // int is automatically rounded down during division.
    x = 9 * 10 / 100;
    // Even if the data type is double, if the operation where the decimal is
    // supposed to occur (90/100) is done between ints, the number is rounded
    // down before being converted to a decimal
    y = 9 * 10 / 100 * 2.0;
    System.out.println("multiplication/division\n" + x + "\n" + y);
    // To prevent this, make the operations that go first all doubles, or make
    // all the numbers doubles.
    y = 9.0 * 10 / 100 * 2;
    System.out.println(y);
    x = 10 % 4;
    System.out.println("modulus:\n" + x);
    x = 1;
    // If ++ or -- is before the variable, 1 is added to the variable before
    // the statement is evaluated. This is why y == 2.0 and not y == 1.0, while
    // x == 2 is always true after the statement.
    y = ++x;
    System.out.println("pre increment:\n" + y);
    x = 1;
    y = x++;
    System.out.println("post increment:\n" + y);
    // Not an operator, but this is how to do power if it is needed.
    x = 2;
    y = Math.pow(x, 8);
    System.out.println("power:\n" + y);
  }

  void relationalOperatorTest() {
    int x;
    double y;
    boolean z;
    x = 1;
    y = 1.0;
    // == works between int and double.
    z = y == x;
    System.out.println("==: " + z);
    z = y != x;
    System.out.println("!=: " + z);
    z = y > x;
    System.out.println(">: " + z);
    z = y <= x;
    System.out.println("<=: " + z);
  }

  void bitwiseOperatorTest() {
    // Bitwise operators can only be applied to the integer datatypes:
    // byte, short, int, long, char.
    // It works on bits, which can be seen if the numbers are converted to
    // binary.
    // Assignment operators exist for all bitwise operators except ~ and >>>.
    // This means statements like:
    // y = y&x
    // can be written as:
    // y &= x
    int x = 60;
    int y = 13;
    int z;
    String s;
    s = String.format("%7s", Integer.toString(x, 2)).replace(' ', '0');
    System.out.println("binary 60: " + s);
    s = String.format("%7s", Integer.toString(y, 2)).replace(' ', '0');
    System.out.println("binary 13: " + s);
    // & copies bits that are the same in both.
    z = x&y;
    s = String.format("%7s", Integer.toString(z, 2)).replace(' ', '0');
    System.out.println("&: " + s);
    // & copies bits as long as they occur in one.
    z = x|y;
    s = String.format("%7s", Integer.toString(z, 2)).replace(' ', '0');
    System.out.println("|: " + s);
    // ^ copies bits that occur in one or the other but not both.
    z = x^y;
    s = String.format("%7s", Integer.toString(z, 2)).replace(' ', '0');
    System.out.println("^: " + s);
    // ~ gives the compliment of the int, which is in this case -61.
    z = ~x;
    s = String.format("%7s", Integer.toString(z, 2)).replace(' ', '0');
    System.out.println("~: " + s);
    // Shifts the bits left.
    z = x<<1;
    s = String.format("%7s", Integer.toString(z, 2)).replace(' ', '0');
    System.out.println("<<: " + s);
    // Shifts the bits right.
    z = x>>1;
    s = String.format("%7s", Integer.toString(z, 2)).replace(' ', '0');
    System.out.println(">>: " + s);
    // Shifts the bits right and replaces the empty spaces with 0.
    z = x>>>1;
    s = String.format("%7s", Integer.toString(z, 2)).replace(' ', '0');
    System.out.println(">>>: " + s);
  }

  void logicalOperatorTest() {
    // Logical operators only work between boolean variables in testing.
    boolean x = true;
    boolean y = false;
    boolean z;
    // && == and
    z = y && x;
    System.out.println("&&: " + z);
    // || == or
    z = y || x;
    System.out.println("||: " + z);
    // ! == not
    z = !(y && x);
    System.out.println("!: " + z);
    // While not a logical operator, instanceof is used to check if a variable
    // belongs to a particular class. It generally does not work on primitive
    // data types except strings.
    String s = "string";
    z = s instanceof String;
    System.out.println("instanceof: " + z);
  }

  public static void main(String []args) {
    _07_OperatorTest ot = new _07_OperatorTest();
    ot.arithmeticOperatorTest();
    System.out.println();
    ot.relationalOperatorTest();
    System.out.println();
    ot.bitwiseOperatorTest();
    System.out.println();
    ot.logicalOperatorTest();
  }

}
