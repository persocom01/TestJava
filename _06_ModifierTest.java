// Demonstrates various modifiers.
// Modifiers can be divided into two types:
// access modifiers - default, private, public, protected
// non access modifiers - static, final, abstract, synchronized, transient and
// volatile.

class AccessModifers {
  // By default, access is available to other classes in the same package.
  int a = 1;
  // private access restricts access to the class itself. It is the most
  // restrictive access level. Classes and interfaces cannot be private.
  // private variables can still be accessed if a public method within the
  // class calls it.
  private int b = 2;
  // public access is available to different packages provided it is imported.
  // All public methods and variables of a class are inherited by their
  // subclasses. Interfaces are by default public.
  public int c = 3;
  // protected access restricts access to the class and its subclasses. Classes
  // are by default protected. Interfaces cannot be protected.
  protected int d = 4;
}

class NonAccessModifers {
  // static makes it such that only a single variable or method exists
  // regardless of the number of instances of the class. A static variable is
  // also known as a class variable.
  static int w = 5;
  // final variables can only be initialized once. If given a variable as an
  // input, the final variable is calculated once and will not change even
  // if the input variable is subsequently changed. If an object is referenced
  // instead, the reference cannot be changed, but the data in the object can
  // be changed.
  // final instances cannot be overridden by any subclasses.
  // final classes cannot be subclassed.
  final int x = w + 1;
  // transient variables are not serialized when serializing an object using
  // import java.io.Serializable;
  transient int y = 7;
  // A volatile variable is read from main memory instead of the CPU cache.
  // Where this is applicable is in multithreaded applications where multiple
  // CPUs may be used, and variables written to different CPU caches. Volatile
  // ensures that the variable has the same value across the entire
  // application.
  volatile int z = 8;

  // A synchronized method can only be accessed by a single thread at a time.
  // Unknown where this is applicable.
  synchronized void addToStatic() {
    w++;
  }
}

// An abstract class is one made specifically to be extended. It cannot be
// instantiated alone, and thus cannot also be final. Classes that contain
// abstract methods must be abstract themselves.
abstract class ExtendMe {
  // An abstract method is one declared without being implemented. (no {})
  // A class extending the abstact class must define all its abstract methods.
  // abstract methods cannot be final or strict.
  abstract void abstactMethod();
}

class ExtendMeSub extends ExtendMe {
  void abstactMethod() {
    System.out.println("abstract demonstration");
  }
}

public class _06_ModifierTest {

  void accessTest() {
    AccessModifers accessMod = new AccessModifers();
    System.out.println("default: " + accessMod.a);
    // private variables cannot be accessed even if the class it is in is
    // called.
    // System.out.println("private: " + AccessMod.b);
    System.out.println("public: " + accessMod.c);
    System.out.println("protected: " + accessMod.d);
  }

  void nonAccessTest() {
    NonAccessModifers nonAccessMod = new NonAccessModifers();
    // NonAccessModifers nonAccessMod2 = new NonAccessModifers();
    nonAccessMod.addToStatic();
    // Demonstrates that static variables change for the parent class even if
    // it is an instance is the one that calls the method.
    // static must be called using the class name instead of the instance name
    // or a warning will occur.
    System.out.println("static: " + NonAccessModifers.w);
    // Note that if final was recalculated it would be 3 instead of 2.
    System.out.println("final: " + nonAccessMod.x);
    // Not demonstrated.
    System.out.println("transient: " + nonAccessMod.y);
    // Not demonstrated.
    System.out.println("volatile: " + nonAccessMod.z);
  }

  void abstractTest() {
    ExtendMeSub abstractMod = new ExtendMeSub();
    abstractMod.abstactMethod();
  }

  public static void main(String []args) {
    _06_ModifierTest mt = new _06_ModifierTest();
    mt.accessTest();
    mt.nonAccessTest();
    mt.abstractTest();
  }

}
