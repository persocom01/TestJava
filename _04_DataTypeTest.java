// Demonstrates java datatypes.

public class _04_DataTypeTest {
  // There are 8 primitive (basic) data types in java. Online documentation can
  // be found here:
  // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
  // It should be noted that it is possible to initialize a variable using
  // class wrappers instead of the primitive data type by, in all cases except
  // int and char, capitalizing the first letter. The class wrappers for int
  // and char are Integer and Character respectively.
  // Byte n; and byte n; are not the same. The former is a class, which takes
  // up more memory, but has can execute methods. The importance of this can
  // be seen when object oriented programming comes into play.
  byte byteMax = Byte.MAX_VALUE;
  short shortMax = Short.MAX_VALUE;
  int intMax = Integer.MAX_VALUE;
  // The main difference between byte -> long is the maximum and minimum
  // supported numbers. The smallest, byte supports -128 to 127.
  // Ints given to a long var will automatically be converted to long. However,
  // if a number beyond the max range of int is given, an error will be retuned.
  // To initialize an int instead of depending on automatic conversion, use a
  // trailing l. Caps or no caps doesn't matter, but caps is often used to
  // avoid ambiguity with the number 1.
  long longMax = 9223372036854775807L;
  // A float must be defined with a trailing f. A simple decimal place defaults
  // to a double.
  float floatEx = 1.01f;
  // A double supports more numbers than float, and is the default data type
  // for numbers with decimal places. Doubles can also be explicitly defined
  // using a trailing d.
  double doubleEx = 1.01;
  // A char is a single character. It can be a letter, number, or one of the
  // unicode escape sequences like '\u0000'. char is in single quotes '' while
  // String is in double quotes "". They are not interchangable. A list of
  // unicode chars can be found here:
  // https://www.rapidtables.com/code/text/unicode-characters.html
  char charEx = '\u005F';
  boolean isBool = true;
  String strEx = "The quick brown fox jumps over the lazy dog";

  public static void main(String []args) {
    _04_DataTypeTest dtt = new _04_DataTypeTest();
    System.out.println("data type examples");
    System.out.println("byte: " + dtt.byteMax);
    System.out.println("short: " + dtt.shortMax);
    System.out.println("int: " + dtt.intMax);
    System.out.println("long: " + dtt.longMax);
    System.out.println("float: " + dtt.floatEx);
    System.out.println("double: " + dtt.doubleEx);
    System.out.println("char: " + dtt.charEx);
    // char can be converted to int in java.
    System.out.println("char typecast: " + (int)dtt.charEx);
    System.out.println("boolean: " + dtt.isBool);
    System.out.println("String: " + dtt.strEx);
  }
}

// java supports special escape (\) characters as defined below:
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
// \udddd	Hexadecimal UNICODE character (dddd)
