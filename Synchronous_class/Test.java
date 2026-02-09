package Synchronous_class;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        Thread t1 = new Thread(() -> c1.increment(), "Thread-1");
        Thread t2 = new Thread(() -> c1.printCount(), "Thread-2");

        Thread t3 = new Thread(() -> c2.increment(), "Thread-3");
        Thread t4 = new Thread(() -> c2.printCount(), "Thread-4");

        t1.start();
        t2.start();

        t3.start();
        t4.start();
    }
}