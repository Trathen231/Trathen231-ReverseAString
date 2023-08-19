public class StringReverse {
    /**
     * Task: return the reverse of a string.
     * There are multiple good ways to solve this problem.
     *
     * You could do some math to grab characters from the end of the String using a typical for loop.
     * For instance, you could use build a String by writing a for loop that decrements rather than increments, grabbing
     * characters from the String starting from the end.
     * You could also look into the methods provided by StringBuilder.
     *
     * @param str a String.
     * @return the reverse of str.
     */
    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        
        // Using StringBuilder
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
        
        // Using a for loop
        /*
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
        */
    }

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();

        String original = "hello";
        String reversed = stringReverse.reverse(original);
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
