package Java_Threads;

public class Task2 extends Thread {
    public void run(){
        System.out.println("Task 2 started");
        for(int i=0;i<=10;i++){
            System.out.println("Task 2 "+ i);
            try {
                sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Task 2 ended");

    }
}
