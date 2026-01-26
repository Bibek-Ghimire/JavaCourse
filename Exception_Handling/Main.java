package Exception_Handling;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Program program = new Program();


        List<Integer> studentAges = program.StudentDetails();

        for (Integer age : studentAges) {
            try {
                if (age < 18) {
                    throw new IllegalArgumentException("Age below eligibility");

                } else {
                    System.out.println("The student age is " + age + ". You are eligible");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Each student details are fetched");
            }
        }
    }
}
