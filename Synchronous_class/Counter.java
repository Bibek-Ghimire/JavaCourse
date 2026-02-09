package Synchronous_class;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        System.out.println(Thread.currentThread().getName() + " incrementing");
        count++;
        try
        {
            Thread.sleep(1000);
        }

        catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " done incrementing");
    }

    public synchronized void printCount() {
        System.out.println(Thread.currentThread().getName() + " printing: " + count);
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() + " done printing");
    }
}


