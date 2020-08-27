// Demonstrates loops in java.
// There are 3 kinds of loops in java:
// 1. while
// 2. for
// 3. do... while

public class _08_LoopTest {

  void whileLoop(int max) {
    int i = 0;
    while(i < max) {
      if(i >= 10) {
        // Break causes the loop to terminate.
        break;
      }
      i++;
    }
    System.out.println("while loops run: " + i);
  }

  public static void main(String []args) {
    _08_LoopTest lt = new _08_LoopTest();
    lt.whileLoop(5);
  }
}
