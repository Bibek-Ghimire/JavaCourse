package Java_Threads;

public class Task1 extends Thread{
    public void run() {
        System.out.println("Task 1 started");
        for(int i=0;i<=10;i++){
            System.out.println("Task 1 "+ i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Task 1 ended");

    }
}
