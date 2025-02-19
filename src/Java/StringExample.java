package Java;

public class StringExample {
	public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World"); // This creates a new object, but str remains unchanged
        System.out.println(str); // Output: Hello

        str = str.concat(" World"); // Now str points to a new object
        System.out.println(str); // Output: Hello World
    }
}
