class AMC {
    //AMC -> Ahmedabad Municipal Corporation
    public String dept_name;
    public String dept_head;
    public int no_of_employees;

    public AMC(String dept_name, String dept_head, int no_of_employees) {
        this.dept_name = dept_name;
        this.dept_head = dept_head;
        this.no_of_employees = no_of_employees;
    }

    // public AMC(int x) {
    //     this("Electricity", "Mr. Yash Soni", 120);
    // }

    // public void fun() {
    //     System.out.println("Fun() is called");
    // }

    public void print() {
        //print details in Tabular format
        // this.fun();
        System.out.println(this.dept_name + "\t\t\t" + this.dept_head + "\t\t" + this.no_of_employees);
    }
}

public class This_KW {
    public static void main(String[] args) {
        System.out.println("Dept. Name\t\tDept. Head\t\t\tNo. of Employees");
        AMC amc = new AMC("Health", "Dr. Bhavin Solanki", 100);
        amc.print();

        amc = new AMC("Education", "\b\b\b\b\b\b\b\bMr. Herry Patel\t", 1);
        amc.print();

        amc = new AMC("Roads", "Mr. Mayank Parmar", 1000);
        amc.print();

        amc = new AMC("Water", "Mr. Hitesh Patel", 50);
        amc.print();

        // amc = new AMC(1);
        // amc.print();

        
    }
}
