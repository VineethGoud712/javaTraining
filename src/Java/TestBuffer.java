package Java;

public class TestBuffer extends Thread {
    StringBuffer sb = new StringBuffer("Hello");

    public void run() {
        for (int i = 0; i < 5; i++) {
            sb.append(" World");
            System.out.println(sb);
        }
    }
}

class TestBuilder extends Thread {
    StringBuilder sb = new StringBuilder("Hello");

    public void run() {
        for (int i = 0; i < 5; i++) {
            sb.append(" World");
            System.out.println(sb);
        }
    }
}