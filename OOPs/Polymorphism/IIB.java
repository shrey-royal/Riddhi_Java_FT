public class IIB {  //class -> blueprint of object
    // int variable = 123; //it is not the correct way to initialize instance variables

    static {    //executed only once when class is loaded
        System.out.println("Static block");
    }

    {   //executed every time when object is created
        System.out.println("Instance Initializer block");
        //used to initialize instance variables
    }

    IIB() { //executed every time when object is created but after instance initializer block
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        IIB obj1 = new IIB();
        IIB obj2 = new IIB();
    }
}
