// Demonstrates various methods used with the String object.

public class _12_StringTest {

  void strLen(String s) {
    int len = s.length();
    System.out.println("the length of " + s + " is " + len);
  }

  // Certain non string datatypes can be converted to strings using the string
  // constructor new String().
  void strConstructor() {
    char[] charArray = { 'c', 'h', 'a', 'r', ' ', 'a', 'r', 'r', 'a', 'y' };
    byte[] byteArray = { 48, 1, 11, 21 };

    // String(char[] chars, startIndex, count) converts char arrays into
    // strings. startIndex and count are optional. They allow a subset of a
    // char array to be converted.
    String s = new String(charArray);
    System.out.println(s);
    s = new String(charArray, 5, 3);
    System.out.println(s);

    // String(byte[] byteArr, startIndex, count) converts byte arrays into
    // strings just like char arrays.
    s = new String(byteArray);
    System.out.println(s);
  }

  // The new String constructor takes
  void strTest() {

  }

  public static void main(String []args) {
    _12_StringTest st = new _12_StringTest();
    st.strLen("12345678910");
    st.strConstructor();
    st.strTest();
  }

}
