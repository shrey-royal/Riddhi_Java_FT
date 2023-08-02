class Static_Ex {
    // int a;
    // static int b;   // static variable
    static int count;

    Static_Ex() {
        count++;
    }
}

public class Static_Example {
    public static void main(String[] args) {
        Static_Ex se0 = new Static_Ex();
        Static_Ex se1 = new Static_Ex();

        System.out.println("Instances of Static_Ex Class = " + Static_Ex.count);

        // se0 = new Static_Ex();
        // se1 = new Static_Ex();
        
        // se0.a = 10;
        // se1.b = 20;
        // System.out.println("se0.a = " + se0.a);
        // System.out.println("se0.b = " + se0.b);
        
        // // se1.a = 30;
        // // se1.b = 40;
        // System.out.println("se1.a = " + se1.a);
        // System.out.println("se1.b = " + se1.b);
    
    }
}

/*
 * Create a Shape class which has a static variable count and a non-static
 * variable name. Create a constructor which increments the count whenever an 
 * object is created and sets the name to the parameter passed to the constructor.
 * Create a method to display the name and count. Create a class called Main
 * which creates two objects of the Shape class and display their names and count.
 * 
 * 
 * 
 * Create a Student Class which will have fees as static variable and name as 
 * non-static variable. Create a constructor which will increment the fees
 * whenever an object is created and sets the name to the parameter passed to
 * the constructor. Create a method to display the name and fees. Create a class
 * called Main which creates two objects of the Student class and display their
 * names and fees.
 */