public class Rgx1 {
    public static void main(String[] args) {
        //
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
Regex Quantifiers:
Regex Meta Characters:


*/

