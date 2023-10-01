class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        return "Custom Exception: " + super.getMessage();
    }
}

public class CustomException {
    public static void main(String[] args) {
        // String s = null;
        // System.out.println(s.length());
        try {
            System.out.println(validateAge(20));    // This will not throw an exception.
            System.out.println(validateAge(12));    // This will throw an exception.
        } catch (InvalidAgeException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }

    public static int validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid");
        } else {
            return age;
        }
    }
}
