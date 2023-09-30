/*
3. Write a Java program to find the longest Palindromic Substring within a string.

Sample Output:

The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the given string is; brownfoxxofnworb
The length of the palindromic substring is: 16
*/

public class StrTask5 {
    public static void main(String[] args) {
        String input = "thequickbrownfoxxofnworbquickthe";
        String longestPalindrome = findLongestPalindrome(input);

        System.out.println("The given string is: " + input);
        System.out.println("The longest palindrome substring in the given string is: " + longestPalindrome);
        System.out.println("The Length of the palindromic substring is: " + longestPalindrome.length());
    }

    private static String findLongestPalindrome(String input) {
        if(input == null || input.isEmpty()) {
            return "";
        }

        String longestPalindrome = "";

        for(int i=0;i<input.length(); i++) {
            String p1 = expandAroundCenter(input, i, i);    //Odd length palindrome
            String p2 = expandAroundCenter(input, i, i+1);  //Even length palindrome

            if(p1.length() > longestPalindrome.length()) {
                longestPalindrome = p1;
            }

            if(p2.length() > longestPalindrome.length()) {
                longestPalindrome = p2;
            }
        }
        return longestPalindrome;
    }

    private static String expandAroundCenter(String input, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }

        //Extract the palindrome substring
        StringBuilder palindrome = new StringBuilder(input.substring(left+1, right));
        return palindrome.toString();
    }
}