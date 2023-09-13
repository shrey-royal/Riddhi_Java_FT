package mypackage;
import mypackage.Class1;

public class Class2 extends Class1 {
    public Class2() {
        System.out.println("mypackage.Class2 constructor");
        Class1 c1 = new Class1();
        c1.method1();
        c1.main(null);
    }
}
