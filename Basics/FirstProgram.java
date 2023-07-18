public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");

        for (String str : args) {
            System.out.print(str + ", ");
        }
    }
} 
/*
 * To Compile: javac FirstProgram.java
 * 
 * To Run: java FirstProgram
 * 
 * CmdLine: java FirstProgram arg1 arg2 arg3
 * 
 * 
 */