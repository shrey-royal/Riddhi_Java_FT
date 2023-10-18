public class Task3 {
    
    public static String checkPasswordStrength(String password) {
        String lengthPattern = ".{8,}";
        String uppercasePattern = ".*[A-Z].*";
        String lowercasePattern = ".*[a-z].*";
        String digitPattern = ".*\\d.*";
        String specialCharacterPattern = ".*[@#$%^&+=].*";

        boolean islengthValid = password.matches(lengthPattern);
        boolean isUppercaseValid = password.matches(uppercasePattern);
        boolean isLowercaseValid = password.matches(lowercasePattern);
        boolean isDigitValid = password.matches(digitPattern);
        boolean isSpecialCharacterValid = password.matches(specialCharacterPattern);

        System.out.println(islengthValid + " " + isUppercaseValid + " " + isLowercaseValid + " " + isDigitValid + " " + isSpecialCharacterValid);

        if (islengthValid && isUppercaseValid && isLowercaseValid && isDigitValid && isSpecialCharacterValid) {
            return "Strong";
        } else if(islengthValid && (isUppercaseValid || isLowercaseValid) && isDigitValid) {
            return "Moderate";
        } else {
            return "Weak";
        }
    }

    public static void main(String[] args) {
        String inputPassword = "P@ssw0rd123";
        String passwordStrength = checkPasswordStrength(inputPassword);
        System.out.println(passwordStrength);
    }
}
