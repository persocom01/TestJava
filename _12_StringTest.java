// Demonstrates various methods used with the String object.
// You need this to print arrays as strings.
import java.util.Arrays;

public class _12_StringTest {

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

  void strFormat() {
    float f = 1.5;

  }

  // The new String constructor takes
  void strTest() {

  }

  public static void main(String []args) {
    _12_StringTest st = new _12_StringTest();
    st.strLen("12345678910");
    System.out.println();
    st.strConstructor();
    st.strTest();
  }

}
