// Demonstrates the methods built into the character wrapper class.
// A char is a single character. It can be a letter, number, or one of the
// unicode escape sequences like '\u0000'. char is in single quotes '' while
// String is in double quotes "". They are not interchangable.
// The list of escape characters is found in _04_DataTypeTest.java

public class _11_CharacterTest {

  void charTest() {
    Character[] chars = {'a', '2', ' ', 'A', 'a', 'a', 'A', 's'};
    char ch;
    boolean isTrue;
    String s;
    int i;

    // Character.isLetter(char) and other methods determine if the passed
    // character is something and returns a boolean. Strings may not be passed
    // as an argument, even if the string has only one character.
    isTrue = Character.isLetter(chars[0]);
    System.out.println("\"" + chars[0] + "\" isLetter: " + isTrue);
    isTrue = Character.isDigit(chars[1]);
    System.out.println("\"" + chars[1] + "\" isDigit: " + isTrue);
    isTrue = Character.isWhitespace(chars[2]);
    System.out.println("\"" + chars[2] + "\" isWhitespace: " + isTrue);
    isTrue = Character.isUpperCase(chars[3]);
    System.out.println("\"" + chars[3] + "\" isUpperCase: " + isTrue);
    isTrue = Character.isLowerCase(chars[4]);
    System.out.println("\"" + chars[4] + "\" isLowerCase: " + isTrue + "\n");

    // Character.toUpperCase(char) and other methods change the char argument
    // into a different form and return them as char. Strings may not be passed
    // as arguments.
    ch = Character.toUpperCase(chars[5]);
    System.out.println("\"" + chars[5] + "\" toUpperCase: " + ch);
    ch = Character.toLowerCase(chars[6]);
    System.out.println("\"" + chars[6] + "\" toLowerCase: " + ch);
    // String.charAt(0) converts the character at string position 0 into a char.
    ch = Character.toString(chars[7]).charAt(0);
    System.out.println("\"" + chars[7] + "\" toString: " + ch + "\n");

    // Adding characters together results in an int. This is because they are
    // first converted to an ASCII int value before being added together.
    // To get 0 + 0 = 0, first convert the char to a string before converting
    // the string to a number using numberObject.valueOf(value).
    s = '0' + "0"
    i = '0' + '0';
    System.out.println("char and string \"" + '0' + '0' + "\" mixed sum: " + i);
    System.out.println("\"" + '0' + '0' + "\" sum: " + i);
  }

  public static void main(String []args) {
    _11_CharacterTest ct = new _11_CharacterTest();
    ct.charTest();
  }

}
