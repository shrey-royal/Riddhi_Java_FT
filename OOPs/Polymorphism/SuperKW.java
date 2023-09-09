class Parent {
    int variable = 123;

    Parent() {
        System.out.println("Parent constructor");
    }

    void method() {
        // System.out.println("Variable: " + variable);
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int var = 321;

    Child() {
        super();
        System.out.println("Child constructor");
    }

    void method() {
        super.method();
        System.out.println("Variable: " + super.variable);
        System.out.println("Variable: " + var);
        System.out.println("Child method");
    }
}

public class SuperKW {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.method();
    }
}
