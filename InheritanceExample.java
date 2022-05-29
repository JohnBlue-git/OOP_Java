/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: to show inheritance of class, how to upcast, down cast, determine which class the object belong

Inheritance ::

is a property to inheriant assets from base class
is mecahnism to inheriant asset

in Java, it only has public inheritance

Override ::

is a mechanism for a dirived class to redefine functions in base class to meet its own demand
*/

class Base {
  public void fun() {
      System.out.println("Base: fun");
  }

  // static variable cannot be inherited in Java
  // but C++ can
  public static int num = 3;

  // static function cannot be inherited in Java and C++
  public static void static_fun() {
      System.out.println("Base: static fun");
  }
}

// if class has not declar extends, then automatically
// public class A extends java.lang.Object
class Derived1 extends Base {
  public void fun() {
      System.out.println("Derived 1: fun");
  }

  // we can't override static method in Java and C++
  // it is a pain new definition belong to Derived 2
  public static void static_fun() {
      System.out.println("Derived 1: static fun");
  }

  // static function could only be used in its scope
  public static void main(String[] argv) {
    static_fun();
  }
}

class Derived2 extends Base {
    // final function cannot be overriden
    // final class cannot be inherited
    public final void fun() {
        System.out.println("Derived 2: fun");
    }
}

public class InheritanceExample {
    public static void main(String[] argv) {
        // Declaring an array of object
        // Allocating memory for 2 objects of type Base
        Base[] en = new Base[3];
        //
        // since Java fully obey the OOP rules, Java only support "virtual function"
        // , the reference will automaticall check which class the object belong
        // , then use the method defined by that class
        //
        // also, Jave has instanceof & ... to check whether the object belong to specific class
        //
        en[0] = new Base();
        en[0].fun();
        //en[0].static_fun();// static function could only be used in its scope
        //
        en[1] = new Derived1();
        en[1].fun();
        //
        en[2] = new Derived2();
        if (en[2] instanceof Derived2 && Derived2.class.isInstance(en[2])) {
          en[2].fun();
        }
        System.out.println("en[2] belong to Base:" + (en[2] instanceof Base));
        System.out.println("en[2] belong to Derived1:" + Derived1.class.isInstance(en[2]));
    }
}
