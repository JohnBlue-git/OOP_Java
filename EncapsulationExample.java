/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: Encapsulation
Reference: ...

(*)friend:
java has no "friend" mechanism

private:
only itsheld can use

protected:
only itshlef and its child class can use

public:
all class or other process can use

static:
only in this scope can use

(*)package:
only the class or process within the same package can use

*/

//import myPackage.B;// import myPackage B class
//import myPackage.*;// import myPackage all class
//in default case, Java Compiler will also import java.lang.* for developer (a nice mechanism)

package myPackage;// define pakage

public class EncapsulationExample {
    private int privateVariable;
    protected int protectedVariable;
    public int publicVariable;
    int packageVariable;

    private   void privateObjectMethod() {}
    protected void protectedObjectMethod() {}
    public    void publicObjectMethod() {}
    void packageObjectMethod() {}

    static private   void privateClassMethod() {}
    static protected void protectedClassMethod() {}
    static public    void publicClassMethod() {}
    static           void packageClassMethod() {}

    public static void main(String[] argv) {
      EncapsulationExample en = new EncapsulationExample();
    }
}
