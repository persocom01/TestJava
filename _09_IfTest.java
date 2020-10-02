// Demonstrates if statements in java.

// enum is a special data type in java, whose value falls within a pre defined
// set of values. It is similar to a dictionary in python.
enum Direction {
  north,
  south,
  east,
  west,
  home
}

public class _09_IfTest {

  void ifTest(int n) {
    // if(condition) {code}
    if(n >= 0) {
      System.out.println(n + " is a positive number");
    }
  }

  void ifElseTest(int n) {
    // if(condition) {code} else {code}
    if(n%2 == 0) {
      System.out.println(n + " is an even number");
    } else {
      System.out.println(n + " is an odd number");
    }
  }

  void switchTest(Direction d) {
    // switch(var) {
    // case value:
    //  code;
    //  break;
    // default:
    //  code;
    // }
    // switch only accepts int types, char, String and enum as variables.
    switch(d) {
      // When using enum, case uses their unqualified names. This means
      // north instead of Direction.north
      case north:
        System.out.println(d + " is where the polar bears live");
        System.out.println(d + " is where a continent lies encased in ice.");
        break;
      case east:
        System.out.println(d + " is where the sun rises.");
        break;
      case west:
        System.out.println(d + " is where the sun sets.");
        break;
      default:
        System.out.println(d + " is where your heart is.");
    }
  }

  public static void main(String []args) {
    _09_IfTest it = new _09_IfTest();
    it.ifTest(10);
    it.ifElseTest(10);
    it.switchTest(Direction.north);
    it.switchTest(Direction.south);
    it.switchTest(Direction.east);
    it.switchTest(Direction.west);
    it.switchTest(Direction.home);
  }

}
