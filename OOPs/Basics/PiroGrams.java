// Class PiroGrams -> methods -> Palindrome String / Fibonacci Series / Sort an array (descending order)

public class PiroGrams {
    public static void main(String[] args) {
        PiroGrams p = new PiroGrams();

        // Palindrome String
        System.out.println(p.PalindromeString("madam"));

        // Fibonacci Series
        int[] arr = p.FibonacciSeries(10);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sort an array (descending order)
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = p.SortArray(arr1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    // Palindrome String
    public boolean PalindromeString(String str) {
        return true;
    }

    // Fibonacci Series
    public int[] FibonacciSeries(int n) {
        int[] arr = new int[n];
        return arr;
    }

    // Sort an array (descending order)
    public int[] SortArray(int[] arr) {
        return arr;
    }
}
