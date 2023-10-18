import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rgx1 {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile(".i");
        // Matcher m = p.matcher("ri");
        // boolean b = m.matches();
        // System.out.println(b);

        // boolean b2 = Pattern.compile(".s").matcher("as").matches();
        // System.out.println(b2);

        // boolean b3 = Pattern.matches(".s", "as");
        // System.out.println(b3);

        // System.out.println(Pattern.matches(".s", "as"));

        //Character classes
        // System.out.println(Pattern.matches("[amn]", "nma"));    //true (a or m or n comes one time)
        // System.out.println(Pattern.matches("[amn]", "a"));
        // System.out.println(Pattern.matches("[a-v]", "y"));


        // System.out.println(Pattern.matches("[^abc]", "x")); //true (x is not a or b or c)
        // System.out.println(Pattern.matches("[abc]?", "ab")); //false (among a or b or c)
        // System.out.println(Pattern.matches("[abc]*", "aaaaa")); 

        System.out.println(Pattern.matches("\\d", "abc"));
        System.out.println(Pattern.matches("\\D{4}", "abcd"));
        System.out.println();


    }
}

/*
Regular Expression: A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.

Used to validate user input (searching or manipulating strings).

java.util.regex package

4 things are included in this package:
1. MatchResult interface: defines the result of a match
2. Matcher class : used to search for the pattern
3. Pattern class : used to define the pattern
4. PatternSyntaxException class : used to indicate syntax error in a regular expression pattern

Methods of Matcher Class: (implements MatchResult interface)

> boolean matches() : checks whether the whole text matches the pattern
> boolean find() : finds the next expression that matches the pattern
> boolean find(int start) : finds the next expression that matches the pattern from the given start number
> String group() : returns the matched subsequence
> int start() : returns the starting index of the matched subsequence
> int end() : returns the ending index of the matched subsequence
> int groupCount() : returns the total number of the matched subsequence


Methods of Pattern Class:

> static Pattern compile(String regex) : compiles the given regex and returns the instance of the Pattern
> Matcher matcher(CharSequence input) : creates a matcher that matches the given input with the pattern
> static boolean matches(String regex, CharSequence input) : It works as the combination of compile and matcher methods. It compiles the regular expression and matches the given input with the pattern.
> String[] split(CharSequence input) : splits the given input string around matches of the given regular expression
    (returns 3 strings: before the match, the match, and after the match)
> String pattern() : returns the regex pattern


Regex Character Classes:
1	[abc]	a, b, or c (simple class)
2	[^abc]	Any character except a, b, or c (negation)
3	[a-zA-Z]	a through z or A through Z, inclusive (range)
4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
5	[a-z&&[def]]	d, e, or f (intersection)
6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)


Regex Quantifiers:

X?	X occurs once or not at all
X+	X occurs once or more times
X*	X occurs zero or more times
X{n}	X occurs n times only
X{n,}	X occurs n or more times
X{y,z}	X occurs at least y times but less than z times


Regex Meta Characters:

.	Any character (may or may not match terminator)
\d	Any digits, short of [0-9]
\D	Any non-digit, short for [^0-9]
\s	Any whitespace character, short for [\t\n\x0B\f\r]
\S	Any non-whitespace character, short for [^\s]
\w	Any word character, short for [a-zA-Z_0-9]
\W	Any non-word character, short for [^\w]

*/

