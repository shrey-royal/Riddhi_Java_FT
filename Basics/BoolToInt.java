public class BoolToInt {
    public static void main(String[] args) throws Exception {
        // boolean b = true;
        // int i = b ? 1 : 0;  
        // System.out.println(i);

        System.out.println("Enter any character: ");
        char ch = (char) System.in.read();

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
        
            default:
                System.out.println(ch + " is a consonant.");
                break;
        }
    }
}
