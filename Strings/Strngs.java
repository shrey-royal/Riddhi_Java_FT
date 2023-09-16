public class Strngs {
    public static void main(String[] args) {
        // String str = "Hello World!";
        // System.out.println(str.hashCode());

        // str = "Goodbye World!"; //here the reference is changed
        // System.out.println(str.hashCode());

        //String Methods

        String str = "Hello World!";
        System.out.println(str);

        //charAt(): returns the character at the specified index
        System.out.println("str.charAt(0): " + str.charAt(0));
    
        //compareTo(): compares two strings lexicographically (ASCII difference)
        System.out.println("str.compareTo(\"Hello World!\"): " + "A".compareTo("a"));

        //concat(): concatenates two strings
        System.out.println("str.concat(\" Goodbye World!\"): " + str.concat(" Goodbye World!"));

        //contains(): returns true if the string contains the specified sequence of char values
        System.out.println("str.contains(\"Hello\"): " + str.contains("Hello"));

        //endsWith(): checks whether a string ends with the specified character(s)
        System.out.println("str.endsWith(\"!\"): " + str.endsWith("!"));

        //equals(): compares two strings
        System.out.println("str.equals(\"Hello World!\"): " + str.equals("Hello World!"));

        //equalsIgnoreCase(): compares two strings, ignoring case considerations
        System.out.println("str.equalsIgnoreCase(\"hello world!\"): " + str.equalsIgnoreCase("hello world!"));

        //format(): returns a formatted string using the specified format string and arguments
        System.out.println("String.format(\"%s\", str): " + String.format("%s", str));

        //getBytes(): encodes this string into a sequence of bytes using the platform's default charset
        System.out.println("str.getBytes(): ");
        for(byte b : str.getBytes()) {
            System.out.print((char)b + ", ");
        }
        System.out.println();

        //getChars(): copies characters from this string into the destination character array
        char[] charArray = new char[5];
        //getChars(int srcBegin(n), int srcEnd(n-1), char[] dst, int dstBegin)
        str.getChars(0, 5, charArray, 0);
        System.out.println("str.getChars(0, 5, charArray, 0): ");
        for(char c : charArray) {
            System.out.print(c + ", ");
        }

        //indexOf(): returns the index within this string of the first occurrence of the specified character or -1 if the character does not occur
        System.out.println("\nstr.indexOf(\"o\"): " + str.indexOf("o"));

        //intern(): returns a canonical representation for the string object
        System.out.println("str.intern(): " + str.intern());

        //isEmpty(): returns true if, and only if, length() is 0
        System.out.println("str.isEmpty(): " + str.isEmpty());

        //join(): returns a string joined with the given delimiter
        System.out.println("String.join(\"_\", \"Hello\", \"World!\"): " + String.join("_", "Hello", "World!"));

        //lastIndexOf(): returns the index within this string of the last occurrence of the specified character or -1 if the character does not occur
        System.out.println("str.lastIndexOf(\"o\"): " + str.lastIndexOf("o"));

        //length(): returns the length of this string
        System.out.println("str.length(): " + str.length());

        //replace(): returns a string replacing all the old char or CharSequence to new char or CharSequence
        System.out.println("str.replace(\"Hello\", \"Goodbye\"): " + str.replace("Hello", "Goodbye"));

        //replaceAll(): replaces each substring of this string that matches the given regular expression with the given replacement
        System.out.println("str.replaceAll(\"Hello\", \"Goodbye\"): " + str.replaceAll("[oe]", "X"));

        //split(): splits this string around matches of the given regular expression
        System.out.println("str.split(\" \"): ");
        for(String s : str.split(" ")) {
            System.out.print(s + ", ");
        }
        System.out.println();

        //startsWith(): checks whether a string starts with the specified character(s)
        System.out.println("str.startsWith(\"Hello\"): " + str.startsWith("Hello"));

        //substring(): returns a string that is a substring of this string
        System.out.println("str.substring(0, 5): " + str.substring(0, 5));

        //toLowerCase(): converts all of the characters in this String to lower case using the rules of the default locale
        System.out.println("str.toLowerCase(): " + str.toLowerCase());

        //toUpperCase(): converts all of the characters in this String to upper case using the rules of the default locale
        System.out.println("str.toUpperCase(): " + str.toUpperCase());

        //trim(): returns a string whose value is this string, with any leading and trailing whitespace removed
        System.out.println("str.trim(): " + "    abcd    ".trim());

        //valueOf(): returns the string representation of the passed argument
        System.out.println("String.valueOf(123): " + String.valueOf(123));
    }
}

/*
Hashcode is a unique identifier for an object.

String Methods:

1. String charAt()
2. String compareTo()
3. String concat()
4. String contains()
5. String endsWith()
6. String equals()
7. equalsIgnoreCase()
8. String format()
9. String getBytes()
10. String getChars()
11. String indexOf()
12. String intern()
13. String isEmpty()
14. String join()
15. String lastIndexOf()
16. String length()
17. String replace()
18. String replaceAll()
19. String split()
20. String startsWith()
21. String substring()
22. String toCharArray()
23. String toLowerCase()
24. String toUpperCase()
25. String trim()
26. String valueOf()


*/