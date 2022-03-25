/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: Polymorphism and Interface
Reference: ...



Interface::

a method in interface is a "abstract method" by default



Abstract::

we can also use abstract in class so that the method or the class can be abstract
, forcing the sub-class to override the class and the method

not that the abstract class can not be new directly

public abstract class AbstractExample {
    int x;
    public void abstract abstractMethod() {}
}

*/

// interface
interface Length {
    float st_length = 333; // public static final
    void set_length(float lt); // public abstract
}
interface Width {
    float st_width = 333;
    void set_width(float wd);
}
interface Breadth {
    int st_breadth = 333;
    void set_width(float bd);
    void set_breadth(double bd);
}

// inheritence of interface
interface Shape extends Length, Width {
  float area();
}

// implementation of interface or ... polymorphism
class Geo_Length implements Length {
    protected float length;
    public void set_length(float lt) {
      System.out.println("Geo_Length.set_length()");
      length = lt;
    }
}

class Rectangle implements Shape {// same as implements Length, Width
    public float length;
    public float width;
    public void set_length(float lt) {
      System.out.println("Geo_Length.set_length()");
      length = lt;
    }
    public void set_width(float wd) {
      System.out.println("Rectangle.set_width()");
      width = wd;
    }
    public float area() {
      return length * width;
    }
}

class Triangle extends Geo_Length implements Shape, Breadth {
    // already inherited from Geo_Length
    //public float length;
    //public void set_length(float lt) { ... }

    // width & breadth
    public float width;
    public float breadth;
    public void set_width(float wd) {
      System.out.println("Triangle.set_width()");
      width = wd;
    }

    public void set_breadth(double bd) {
      System.out.println("Triangle.set_breadth()");
      breadth = (float)bd;
    }
    public float area() {
      float s = (length + width + breadth) / 2;
      return (float)Math.sqrt(s * (s - length) * (s - width) * (s - breadth));
    }
}

public class Polymorphism_and_Interface {
  // main
  public static void main(String[] argv) {
      // static variable in interface
      System.out.println("Length >>");
      System.out.println("Length.length >>" + Length.st_length + "\n");

      // Geo_Length
      System.out.println("Geo_Length >>");
      System.out.println("new g");
      Geo_Length g = new Geo_Length();
      g.set_length(3);
      System.out.println("g.length = " + g.length + "\n");

      // Rectangle
      System.out.println("Rectangle >>");
      System.out.println("new r");
      Rectangle r = new Rectangle();
      r.set_length(3);
      r.set_width(3);
      System.out.println("r.area = " + r.area() + "\n");

      // Triangle
      System.out.println("Triangle >>");
      System.out.println("new t");
      Triangle t = new Triangle();
      t.set_length(5);
      t.set_width(4);
      t.set_breadth(3);
      System.out.println("t.area = " + t.area() + "\n");
  }
}
