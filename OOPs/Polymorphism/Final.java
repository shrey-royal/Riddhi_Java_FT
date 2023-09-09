final class Dummy {
    final int var = 5456;
    final void print() {
        System.out.println("Variable: " + var);
    }
}

// class Sample extends Dummy {
//     @Override
//     void print() {
//         System.out.println("Variable: " + var);
//     }
// }


public class Final {
    public static void main(String[] args) {
        Dummy d = new Dummy();
        d.print();
        d.var = 123;
        d.print();
    }
}

/*
Final Class: A class that cannot be inherited
Final Variable: A variable that cannot be changed
Final Method: A method that cannot be overridden
*/