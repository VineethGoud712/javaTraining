package Java;

public class EaxmpleStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() - Adds text at the end
        sb.append(" World");
        System.out.println("append(): " + sb); // Hello World

        // 2. insert() - Inserts text at a specific index
        sb.insert(6, "Java ");
        System.out.println("insert(): " + sb); // Hello Java World

        // 3. replace() - Replaces characters in a specific range
        sb.replace(6, 10, "C++");
        System.out.println("replace(): " + sb); // Hello C++ World

        // 4. delete() - Deletes characters in a specific range
        sb.delete(6, 10);
        System.out.println("delete(): " + sb); // Hello World

        // 5. deleteCharAt() - Deletes a single character at a given index
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb); // HelloWorld

        // 6. reverse() - Reverses the string
        sb.reverse();
        System.out.println("reverse(): " + sb); // dlroWolleH
        sb.reverse(); // Reverting back to original

        // 7. length() - Returns the length of the string
        System.out.println("length(): " + sb.length()); // 10

        // 8. capacity() - Returns the current capacity of StringBuilder
        System.out.println("capacity(): " + sb.capacity()); // Default is 16 + original length

        // 9. charAt() - Returns the character at a specific index
        System.out.println("charAt(0): " + sb.charAt(0)); // H

        // 10. setCharAt() - Modifies a character at a specific index
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt(0, 'h'): " + sb); // helloWorld

        // 11. substring(start) - Returns substring from start index
        System.out.println("substring(5): " + sb.substring(5)); // World

        // 12. substring(start, end) - Returns substring from start to end index
        System.out.println("substring(0, 5): " + sb.substring(0, 5)); // hello

        // 13. ensureCapacity() - Ensures minimum capacity
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sb.capacity()); // 50 or more

        // 14. indexOf() - Returns index of first occurrence of substring
        System.out.println("indexOf(\"World\"): " + sb.indexOf("World")); // 5

        // 15. lastIndexOf() - Returns last occurrence of substring
        sb.append(" World");
        System.out.println("lastIndexOf(\"World\"): " + sb.lastIndexOf("World")); // 11
    
	}

}
