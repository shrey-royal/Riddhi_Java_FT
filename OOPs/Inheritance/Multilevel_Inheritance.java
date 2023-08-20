import java.util.Scanner;

class Parent {
    // data members
    protected int a;

    //constructors
    Parent() {
        a = 0;
    }

    // member functions
    void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        // sc.close();
    }
    
    void display() {
        System.out.println("a = " + a);
    }
}

class Child extends Parent {
    protected float b;

    //constructors
    Child() {   
        a = 0;
        b = 0.0f;
    }

    // member functions
    void scan() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextFloat();
        
        sc.close();
    }

    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class GrandChild extends Child {
    private char c;

    //constructors
    GrandChild() {   
        a = 0;
        b = 0.0f;
        c = 'R';
    }

    // member functions
    void scan() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextFloat();
        System.out.println("Enter c: ");
        c = sc.next().charAt(0);
        
        // sc.close();
    }

    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.scan();
        gc.display();
    }
}
