package Java;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // 1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b) = " + (a + b));
        System.out.println("Subtraction (a - b) = " + (a - b));
        System.out.println("Multiplication (a * b) = " + (a * b));
        System.out.println("Division (a / b) = " + (a / b));
        System.out.println("Modulus (a % b) = " + (a % b));

        // 2. Assignment Operators
        int x = 10;
        System.out.println("\nAssignment Operators:");
        x += 5;  // x = x + 5
        System.out.println("x += 5: " + x);
        x -= 3;  // x = x - 3
        System.out.println("x -= 3: " + x);
        x *= 2;  // x = x * 2
        System.out.println("x *= 2: " + x);
        x /= 2;  // x = x / 2
        System.out.println("x /= 2: " + x);
        x %= 3;  // x = x % 3
        System.out.println("x %= 3: " + x);

        // 3. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 4. Logical Operators
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " + (p && q)); // AND
        System.out.println("p || q: " + (p || q)); // OR
        System.out.println("!p: " + (!p)); // NOT

        // 5. Bitwise Operators
        int m = 5, n = 3; // Binary: 5 -> 0101, 3 -> 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n)); // AND
        System.out.println("m | n: " + (m | n)); // OR
        System.out.println("m ^ n: " + (m ^ n)); // XOR
        System.out.println("~m: " + (~m)); // Complement
        System.out.println("m << 1: " + (m << 1)); // Left Shift
        System.out.println("m >> 1: " + (m >> 1)); // Right Shift

        // 6. Unary Operators
        int y = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("y: " + y);
        System.out.println("++y: " + (++y)); // Pre-increment
        System.out.println("y++: " + (y++)); // Post-increment
        System.out.println("After Post-increment y: " + y);
        System.out.println("--y: " + (--y)); // Pre-decrement
        System.out.println("y--: " + (y--)); // Post-decrement
        System.out.println("After Post-decrement y: " + y);

        // 7. Ternary Operator
        int num1 = 20, num2 = 30;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println("\nTernary Operator:");
        System.out.println("Minimum of num1 and num2: " + min);

	}

}
