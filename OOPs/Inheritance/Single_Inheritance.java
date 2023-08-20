import java.util.Scanner;

class Parent {
    // data members
    protected int a;
    protected float b;

    //constructors
    Parent() {
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

class Child extends Parent {
    // data members
    private int c;

    //constructors
    Child() {   
        a = 0;
        b = 0.0f;
        c = 0;
    }

    // member functions
    void scan() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextFloat();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        
        sc.close();
    }
    
    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}


public class Single_Inheritance {
    public static void main(String[] args) {
        // Parent obj = new Parent();
        // obj.scan();
        // obj.display();

        Child obj = new Child();
        obj.scan();
        obj.display();
    }
}
