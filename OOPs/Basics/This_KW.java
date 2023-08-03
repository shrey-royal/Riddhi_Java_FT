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


/*
1. **Palindrome Checker:** Write a Java program to determine if a given string is a palindrome or not.

2. **Prime Number Generator:** Develop a Java program that generates and prints all prime numbers within a given range.

3. **Student Management System:** Create a Java class hierarchy to model a student management system, including classes for students, courses, and enrollment.

4. **File Encryption and Decryption:** Implement a Java program that reads a file, encrypts its contents using a chosen encryption algorithm, and then decrypts it back to the original content.

5. **Bank Account Management:** Design a Java program that simulates a simple bank account management system, allowing users to deposit, withdraw, and check their balances.

6. **Online Shopping Cart:** Build a Java application for an online shopping cart, allowing users to add items, view the cart, and calculate the total cost.

7. **Word Frequency Counter:** Write a Java program that reads a text file, counts the frequency of each word, and displays the top N most frequent words.

8. **Employee Payroll System:** Develop a Java program that manages employee records, calculates their salaries based on different roles, and generates payroll reports.

9. **Contact List Application:** Create a Java GUI application to manage a contact list, enabling users to add, edit, and delete contacts, as well as search for specific contacts.

10. **Temperature Conversion Utility:** Design a Java program that converts temperatures between Celsius and Fahrenheit, allowing users to input values in one unit and see the corresponding value in the other.

Feel free to adapt and expand upon these problem statements to create meaningful Java programming exercises.
*/