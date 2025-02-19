package Java;

public class ExampleThreadSafety {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBuffer thread1 = new TestBuffer();
        TestBuilder thread2 = new TestBuilder();

        thread1.start(); // Safe (Synchronized)
        thread2.start(); // May produce unexpected results (Not Synchronized)

	}

}
