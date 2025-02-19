package Java;

public class ExampleofStringMethods {

	public static void main(String[] args) {
		
		String str = "  Hello, Java Programming!  ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        String trimmedStr = str.trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");

        // 3. charAt(index)
        System.out.println("Character at index 7: " + trimmedStr.charAt(7));

        // 4. substring(start, end)
        System.out.println("Substring (7-11): " + trimmedStr.substring(7, 11));

        // 5. indexOf(char)
        System.out.println("Index of 'J': " + trimmedStr.indexOf('J'));

        // 6. lastIndexOf(char)
        System.out.println("Last Index of 'a': " + trimmedStr.lastIndexOf('a'));

        // 7. toUpperCase() & toLowerCase()
        System.out.println("Uppercase: " + trimmedStr.toUpperCase());
        System.out.println("Lowercase: " + trimmedStr.toLowerCase());

        // 8. replace(oldChar, newChar)
        System.out.println("Replace 'Java' with 'Python': " + trimmedStr.replace("Java", "Python"));

        // 9. split(regex)
        String[] words = trimmedStr.split(" ");
        System.out.println("Split Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. startsWith() & endsWith()
        System.out.println("Starts with 'Hello': " + trimmedStr.startsWith("Hello"));
        System.out.println("Ends with '!': " + trimmedStr.endsWith("!"));

        // 11. equals() & equalsIgnoreCase()
        System.out.println("Equals 'hello, java programming!': " + trimmedStr.equals("hello, java programming!"));
        System.out.println("Equals Ignore Case: " + trimmedStr.equalsIgnoreCase("hello, java programming!"));

        // 12. contains()
        System.out.println("Contains 'Java': " + trimmedStr.contains("Java"));

        // 13. concat()
        System.out.println("Concatenated: " + trimmedStr.concat(" Let's Learn!"));

        // 14. compareTo() & compareToIgnoreCase()
        System.out.println("Compare to 'hello': " + trimmedStr.compareTo("hello"));
        System.out.println("Compare Ignore Case to 'hello': " + trimmedStr.compareToIgnoreCase("hello"));

        // 15. isEmpty()
        String emptyString = "";
        System.out.println("Is emptyString empty?: " + emptyString.isEmpty());

        // 16. valueOf()
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("String value of 123: " + numStr);

        // 17. matches(regex)
        System.out.println("Matches regex '.*Java.*': " + trimmedStr.matches(".*Java.*"));

        // 18. toCharArray()
        char[] charArray = trimmedStr.toCharArray();
        System.out.println("Character Array:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 19. format()
        String formatted = String.format("The price of %s is $%.2f", "book", 19.99);
        System.out.println("Formatted String: " + formatted);

        // 20. join()
        String joinedStr = String.join("-", "Java", "Programming", "Language");
        System.out.println("Joined String: " + joinedStr);
    

	}

}
