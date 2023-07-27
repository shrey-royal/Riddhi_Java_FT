class Dummy {
    int a, b, c;    // instance variables / class variables / data members / fields

    // methods / member functions
    void display() {
        System.out.println(a + " " + b + " " + c);
    }

    void add(int x, int y, int z) {
        a = x;
        b = y;
        c = z;

        System.out.println(a + b + c);
    }

    int sub(int x, int y, int z) {
        a = x;
        b = y;
        c = z;

        return a - b - c;
    }
}

public class Object_Class {
    public static void main(String[] args) {
        Dummy obj = new Dummy();    // obj is an object of class Dummy
        obj.a = 10;
        obj.b = 20;
        obj.c = 30;
        // System.out.println(obj.a + " " + obj.b + " " + obj.c);
        obj.display();  // calling the method display() of class Dummy using obj   
        obj.add(1, 2, 3);   // calling the method add() of class Dummy using obj    
        System.out.println(obj.sub(1, 2, 3)); // calling the method sub() of class Dummy using obj 
    }
}


/*
 * 
 * Access Modifiers: public, private, protected, default
 * 
 * 1. public: accessible from anywhere
 * 2. private: accessible only within the class
 * 3. protected: accessible within the package and outside the package but through inheritance only
 * 4. default: accessible within the package only
 * 
 * 
 * Class PiroGrams -> methods -> Palindrome String / Fibonacci Series / Sort an array (descending order)
 * 
 * 
 */