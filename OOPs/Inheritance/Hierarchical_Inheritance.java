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

class Child_1 extends Parent {
    private float b;

    //constructors
    Child_1() {   
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
        
        // sc.close();
    }

    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class Child_2 extends Parent {
    // data members
    private char c;

    //constructors
    Child_2() {   
        a = 0;
        c = 'R';
    }

    // member functions
    void scan() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.next().charAt(0);
        
        // sc.close();
    }

    void display() {
        System.out.println("a = " + a);
        System.out.println("c = " + c);
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Child_1 obj_1 = new Child_1();
        Child_2 obj_2 = new Child_2();
        
        obj_1.scan();
        obj_2.scan();
        
        obj_1.display();
        obj_2.display();
    }
}
