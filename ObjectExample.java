/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: to show basic usage of class and object



For class in java:
The public modifier specifies that the members or classes can be accessed openly.
The private modifier specifies that the member can only be accessed in its own class.
The protected modifier specifies that the member can only be accessed within its own package (as with package-private) and, in addition, by a subclass of its class in another package.

Note that only one public class in java
?protected class
?private class
?no modifier class

*/

class Other {
  static String name = "Other";
}

public class ObjectExample {
// variable
  private String name;
  private final String const_name;// = "s";// or you can assign final variable here

// constructor
  public ObjectExample(String s) {
    this.name = s;
    this.const_name = s;// must assign final variable
  }
// copy constructor
  public ObjectExample(final ObjectExample obj) {// final is like a const
    this.name = obj.name;
    this.const_name = obj.const_name;// must assign final variable
  }
// no assigment operator

// function
  public void print() {
    System.out.println("object >>" + name);
  }

  public static void main(String[] argv) {
    // o1 o2 are all reference that point to object
    ObjectExample o1 = new ObjectExample("o1");
    ObjectExample o2 = new ObjectExample("o2");
    //o1 = o2;// workable o1 is just reference

    // copy
    System.out.println("copy >>");
    ObjectExample o3 = new ObjectExample(o1);
    if (o1 == o3) {
      System.out.println("o1 == o3");
    }
    else {
      System.out.println("o1 != o3");
      System.out.println("but");
      System.out.println("o1.print() =");
      o1.print();
      System.out.println("o3.print() =");
      o3.print();
      System.out.println("\n");
    }

    // pt here is just reference, not assignment
    System.out.println("reference >>");
    ObjectExample pt;
    pt = o1;
    pt.print();
    pt = o2;
    pt.print();
    System.out.println("\n");

    // delete
    System.out.println("delete >>");
    o1 = null;// the object that abandom by the reference will be delete automatically
    System.gc();
    System.out.println("complete >>\n");

    // access static
    System.out.println("static variable >>");
    System.out.println("Other.name: " + Other.name);
  }
}
