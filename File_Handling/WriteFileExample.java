package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args)
    {

        try {

            FileWriter Writer = new FileWriter("C:\\Users\\LOQ\\Desktop\\JavaCourse\\File_Handling\\hello.txt");

            Writer.write("I love coding in java");
            Writer.close();

            System.out.println("Successfully written.");
        }

        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

