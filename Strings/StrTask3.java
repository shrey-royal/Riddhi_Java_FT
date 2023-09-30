public class StrTask3 {
    public static void main(String[] args) {
        String input = "BDCA";
        System.out.println("The Given String is: " + input);
        int n = input.length();
        System.out.println("The Lexicographic rank of the given string is: " + calculateLexicoRank(input, n - 1));
    }

    public static int makeFactorial(int n) {
        return (n <= 2) ? n : n * makeFactorial(n - 1);
    }

    public static int calculateLexicoRank(String str, int n) {
        int ctrofRank = 1;
        for (int i = 0; i < n; i++) {
            int ctr = 0;
            for (int j = i + 1; j <= n; j++) {
                if (str.charAt(i) > str.charAt(j)) {
                    ctr++;
                }
            }
            ctrofRank += ctr * makeFactorial(n - i);
        }
        printAllPermutations(str.toCharArray(), 0, n);
        return ctrofRank;
    }

    public static void printAllPermutations(char[] str, int l, int r) {
        if (l == r) {
            System.out.println(new String(str));
        } else {
            for (int i = l; i <= r; i++) {
                swap(str, l, i);
                printAllPermutations(str, l + 1, r);
                swap(str, l, i); // backtrack
            }
        }
    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
