/*
class SuperClass {
    void show() {
        System.out.println("SuperClass");
    }
}

class SubClass extends SuperClass {
    @Override
    void show() {
        System.out.println("SubClass");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {
        //Upcasting
        SuperClass s = new SubClass();  //creating object of superclass then assigning it to subclass
        s.show();   //SubClass  -> Dynamic Binding
        //we can say that s is upcasted to SubClass

        //Downcasting
        SubClass s2 = (SubClass) s; //creating object of subclass then assigning it to superclass
        s2.show();  //SubClass  -> Dynamic Binding


        SuperClass s1 = new SuperClass();
        s1.show();  //Static Binding

    }
}
*/
/*
Upcasting: Converting a subclass object to a superclass object (implicit/Static Binding)
Downcasting: Converting a superclass object to a subclass object (explicit/Dynamic Binding)

*/

class RBI {
    void getInterestRate() {
        System.out.println("Interest Rate: 7%");
    }
}

class SBI extends RBI {
    @Override
    void getInterestRate() {
        System.out.println("Interest Rate: 8%");
    }
}

class ICICI extends RBI {
    @Override
    void getInterestRate() {
        System.out.println("Interest Rate: 9%");
    }
}

class PNB extends RBI {
    @Override
    void getInterestRate() {
        System.out.println("Interest Rate: 10%");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {
        /*
        RBI bank = new RBI();
        bank.getInterestRate(); //7%

        bank = new SBI();
        bank.getInterestRate(); //8%
        SBI sbi = (SBI) bank; //Downcasting
        sbi.getInterestRate(); //8%

        bank = new ICICI();
        bank.getInterestRate(); //9%
        ICICI icici = (ICICI) bank; //Downcasting
        icici.getInterestRate(); //9%

        bank = new PNB();
        bank.getInterestRate(); //10%
        PNB pnb = (PNB) bank; //Downcasting
        pnb.getInterestRate(); //10%
        */

        //instanceof operator
        RBI bank = new RBI();
        // System.out.println(bank instanceof RBI);

        // bank = new SBI();
        // System.out.println(bank instanceof SBI);

        // bank = new ICICI();
        // System.out.println(bank instanceof ICICI);

        bank = new PNB();
        PNB pnb = (PNB) bank;
        System.out.println(pnb instanceof PNB);



    }
}