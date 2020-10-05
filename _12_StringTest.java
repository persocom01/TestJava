// Demonstrates various methods used with the String object.
// You need this to print arrays as strings.
import java.util.Arrays;

public class _12_StringTest {

  // Demonstrates returning the length of a string.
  void strLen(String s) {
    int len = s.length();
    System.out.println("the length of " + s + " is " + len);
  }

  // Certain non string datatypes can be converted to strings using the string
  // constructor new String().
  void strConstructor() {
    char[] charArray = { 'c', 'h', 'a', 'r', ' ', 'a', 'r', 'r', 'a', 'y' };
    String s = "byte array";
    // Convert a string into a byte array.
    byte[] byteArray = s.getBytes();

    // String(char[] chars, startIndex, count) converts char arrays into
    // strings. startIndex and count are optional. They allow a subset of a
    // char array to be converted.
    s = new String(charArray);
    System.out.println(s);
    s = new String(charArray, 5, 3);
    System.out.println(s + "\n");

    // String(byte[] byteArr, startIndex, count) converts byte arrays into
    // strings just like char arrays. However, the numbers are mapped to ASCII
    // characters before being concatenated together as a string. The ASCII
    // table can be found here: http://www.asciitable.com/
    s = new String(byteArray);
    System.out.println(Arrays.toString(byteArray));
    System.out.println(s);
  }

  // Demonstrates formatting strings.
  void strFormat(String name, int num, double price) {
    String fs;

    // %[argument_index$][flags][width][.precision]conversion
    // argument_index$ indicates which argument to substitute into the position.
    // .precision determines the number of decimal places flor floats or the
    // number of letters from the beginning of a string.
    // More detail on the rest here: https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
    fs = String.format("%3$s went to the market to buy %2$d apples at $%1$.2f each.", price, num, name);
    System.out.println(fs);

    // When printing to system out, one can use .printf or .format. They are
    // identical.
    System.out.printf("%2$s carried the %1$d apples home.", num, name);
  }

  // The new String constructor takes
  void strTest() {

  }

  public static void main(String []args) {
    _12_StringTest st = new _12_StringTest();
    st.strLen("12345678910");
    System.out.println();
    st.strConstructor();
    System.out.println();
    st.strFormat("John", 30, 1.5);
    st.strTest();
  }

}
