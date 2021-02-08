// Demonstrates loops in java.
// There are 3 kinds of loops in java:
// 1. while
// 2. for
// 3. do... while

// Needed for arraylists.
import java.util.*;

public class _08_LoopTest {

  // Demonstrates a while loop and the break statement.
  void whileLoop(int n) {
    int i = 2;
    int maxRange = (int)Math.sqrt(n) + 1;
    boolean f = true;
    // while(condition) {code}
    while(i <= maxRange) {
      if(n%i == 0) {
        f = false;
        // Break causes the loop to terminate.
        break;
      }
      i++;
    }
    if(f) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }

  // Demonstrates a for loop, the continue statement, and how to implement
  // dynamic lists in java.
  void forLoop(int n) {
    int f = 3;
    Integer[] arr = {};
    // for(dataType var = value; condition; increment) {code}
    // for loops include in their implementation the count variable as well as
    // the stop condition, making them safer than while loops.
    for(int i = 1; i < n; i++) {
      if(i%f == 0) {
        ArrayList<Integer>factors = new ArrayList<Integer>(Arrays.asList(arr));
        factors.add(i);
        arr = factors.toArray(arr);
        // Continue ignores the rest of the code in the loop and restarts it.
        // In a while loop, care must be taken to ensure that it doesn't result
        // in an infinite loop due to not incrementing the stop condition.
        continue;
      }
    }
    System.out.println("the multiples of " + f + " below " + n + " are " + Arrays.toString(arr));
  }

  void doWhileLoop(int n) {
    int i = 0;
    // do... while loops are while loops that execute at least once, as the
    // condition whether to repeat the loop is evaluated at the end of the
    // first iteration instead of the beginning.
    do {
      System.out.println(i);
      i++;
    } while(i <= n);
  }

  public static void main(String []args) {
    _08_LoopTest lt = new _08_LoopTest();
    lt.whileLoop(10);
    lt.forLoop(10);
    lt.doWhileLoop(3);
  }

}
