package Java_Threads;

public class main {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        task1.start();
        task2.start();
    }
}
