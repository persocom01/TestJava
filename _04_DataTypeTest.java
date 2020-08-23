// Demonstrates java datatypes.

public class _04_DataTypeTest {
  // There are 8 primitive (basic) data types in java. Online documentation can
  // be found here:
  // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
  byte byteMax = Byte.MAX_VALUE;
  short shortMax = Short.MAX_VALUE;
  int intMax = Integer.MAX_VALUE;
  // The main difference between byte -> long is the maximum and minimum
  // supported numbers. The smallest, byte supports -128 to 127.
  long longMax = Long.MAX_VALUE;
  // A float must be defined with a trailing f. A simple decimal place defaults
  // to a double.
  float floatEx = 1.01f;
  // A double supports more numbers than float, and is the default data type
  // for numbers with decimal places. Doubles can also be explicitly defined
  // using a trailing d.
  double doubleEx = 1.01;
  // A char is a single character. It can be a letter, number, or one of the
  // unicode escape sequences like '\u0000'. char is in single quotes '' while
  // String is in double quotes "". They are not interchangable.
  char charEx = '\u005F';
  boolean isBool = true;
  String strEx = "The quick brown fox jumps over the lazy dog";

  public static void main(String []args) {
    _04_DataTypeTest dataTest = new _04_DataTypeTest();
    System.out.println("data type examples");
    System.out.println("byte: " + dataTest.byteMax);
    System.out.println("short: " + dataTest.shortMax);
    System.out.println("int: " + dataTest.intMax);
    System.out.println("long: " + dataTest.longMax);
    System.out.println("float: " + dataTest.floatEx);
    System.out.println("double: " + dataTest.doubleEx);
    System.out.println("char: " + dataTest.charEx);
    System.out.println("boolean: " + dataTest.isBool);
    System.out.println("String: " + dataTest.strEx);
  }
}

// Java also supports special escape (\) characters as defined here:
// \n	Newline (0x0a)
// \r	Carriage return (0x0d)
// \f	Formfeed (0x0c)
// \b	Backspace (0x08)
// \s	Space (0x20)
// \t	tab
// \"	Double quote
// \'	Single quote
// \\	backslash
// \ddd	Octal character (ddd)
// \uxxxx	Hexadecimal UNICODE character (xxxx)
