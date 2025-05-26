import java.util.*;

public class StudentScoreEvaluator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Count of students: ");
        int countOfStudents = scanner.nextInt();
   
        int[][] scores = new int[countOfStudents][3];

        for (int i = 0; i < countOfStudents; i++) {
            for (int s = 0; s < 3; s++) {
                System.out.print("Score " + (s + 1) + " of student_" + (i + 1) + ": ");
                scores[i][s] = scanner.nextInt();

            }
        }

        for (int i = 0; i < countOfStudents; i++) {
            int sum = 0;
            for (int s = 0; s < 3; s++) {
                sum += scores[i][s];
            }
            int avg = sum / 3;

            if (avg <= 10) {
                System.out.println("Student_" + (i + 1) + ":Fail.\naverage of student_" + (i+1) + ":" + avg);
            } else {
                System.out.println("Student_" + (i + 1) + ":Pass.\naverage of student_" + (i+1) + ":" + avg);
            }
        }
    }
}
