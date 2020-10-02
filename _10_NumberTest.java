// Demonstrates the methods built into the number wrapper class.

public class _10_NumberTest {

  void numTest() {
    // To call the number class wrapper instead of the primitive data type,
    // capitalize the first letter, except for int and Char, whose classes are
    // Integer and Character respectively.
    Float x = 1.5f;
    int y;
    String z;

    // .datatypeValue() converts the number into another primitive data type.
    System.out.println("byteValue: " + x.byteValue());
    // .compareTo(value) compares the number to another of the same data type.
    // It returns 1 if the number is greater, 0 if the same, and -1 if smaller
    // than the one in the bracket.
    System.out.println("compareTo: " + x.compareTo(10.0f));
    // .equals returns true only if both the value and the data type of the
    // number in the bracket is the same. Otherwise false.
    System.out.println("equals: " + x.equals(1.5));
    // numberObject.valueOf(value) returns the number object equivalent of the
    // argument passed to it. The argument can be a string. If a char is given
    // the results will be strange, such as Float.valueOf('0') = 48, so when
    // dealing with char, convert them to a string first.
    x = Float.valueOf("1337");
    System.out.println("valueOf: " + x);
    // Integer.valueOf is special in that it can accept two arguments, a string
    // and a int radix. Radix is the root of the numbering system. A radix
    // value smaller than 10 will return a value lower than face value and vice
    // versa.
    y = Integer.valueOf("100", 2);
    System.out.println("valueOf radix: " + y);
    z = x.toString();
    System.out.println("toString: " + z);
    // Integer.parseInt(value) is similar to Integer.valueOf, except that it
    // returns a primitive datatype instead of a number object.
    y = Integer.parseInt("100", 2);
    System.out.println("parseInt radix: " + y + "\n");

    // Math.abs(value) returns the absolute value of the value given. The value
    // still has to be the correct datatype.
    x = Math.abs(-1.5f);
    System.out.println("abs: " + x);
    // Math.ceil(value) rounds a number up and returns it as a double.
    x = (float)Math.ceil(1.4);
    System.out.println("ceil: " + x);
    // Math.floor(value) rounds a number up and returns it as a double.
    x = (float)Math.floor(1.6);
    System.out.println("floor: " + x);
    // Math.rint(value) rounds a number to the closest integer value and
    // returns it as a double. 0.5 is rounded up.
    x = (float)Math.rint(1.5);
    System.out.println("rint: " + x);
    // Math.round(value) is like rint, but it returns a long or int, depending
    // on whether you passed it a double or float as an argument. If a int is
    // desired, you still have to convert the long to an int.
    y = (int)Math.round(1.5);
    System.out.println("round: " + y);
    // Math.min(value, value) returns the minimum of two values depending on
    // the datatype of the values given. If the two values are of the same
    // datatype, that datatype will be returned. If datatypes are mixed the
    // datatype that will take priority is as follows:
    // double>float>long>int
    // Returns int when passed byte.
    x = Math.min(1, 9.5f);
    System.out.println("min: " + x);
    y = Math.max(1, 9);
    System.out.println("max: " + y);
    // Math.exp(value) returns e to the power of the value given as a double.
    x = (float)Math.exp(1);
    System.out.println("exp: " + x);
    x = (float)Math.log(2.7182817);
    System.out.println("log: " + x);
    // Math.pow(value1, value2) returns value1 to the power of value2 as a
    // double.
    x = (float)Math.pow(2, 5);
    System.out.println("pow: " + x);
    // Math.sqrt(value) returns the sqrt of value as a double.
    x = (float)Math.sqrt(4);
    System.out.println("sqrt: " + x);
    // Math.random(value) returns the sqrt of value as a double.
    x = (float)Math.random();
    System.out.println("random: " + x + "\n");

    // Math.toRadians(degrees) converts degrees to radians and returns it as a
    // double. Converting to radians involves multiplying by pi and dividing by
    // 180.
    double rad = Math.toRadians(90);
    System.out.println("radian: " + rad);
    // Math.sin(radians) and other trigonometric functions return the
    // respective trig ratios of radian given to them as a double.
    x = (float)Math.sin(rad);
    System.out.println("sin: " + x);
    // We use format %.2f to round the number to two decimal places here.
    x = (float)Math.cos(rad);
    System.out.format("cos: %.2f\n", x);
    x = (float)Math.tan(rad);
    System.out.format("tan: %.0f\n", x);
    // Math.asin(value) and other inverse trig functions return the angle, in
    // radians of the trig ratios given to them as a double.
    x = (float)Math.asin(1);
    System.out.println("asin: " + x);
    x = (float)Math.acos(0);
    System.out.println("acos: " + x);
    x = (float)Math.atan(0);
    System.out.println("atan: " + x);
    // Math.atan2(y, x) converts cartesian coordinates to polar and returns the
    // angle to the x-axis. (or y axis if you reverse the argument order)
    rad = Math.atan2(12, 5);
    double deg = Math.toDegrees(rad);
    System.out.println("atan2: " + deg);
  }

  public static void main(String []args) {
    _10_NumberTest nt = new _10_NumberTest();
    nt.numTest();
  }

}
