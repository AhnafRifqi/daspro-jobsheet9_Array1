import java.util.Scanner;

public class ModifiedArrayAverageScore02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] score = new int[10];
        double totalPassed = 0;
        double totalFailed = 0;
        int StudentPassed = 0;
        int StudentFailed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                totalPassed += score[i];
                StudentPassed++;
            } else {
                totalFailed += score[i];
                StudentFailed++;
            }
        }

        double averagegPassed = (StudentPassed > 0) ? totalPassed / StudentPassed : 0;
        double averagegFailed = (StudentFailed > 0) ? totalFailed / StudentFailed : 0;

        System.out.println("The average score of students who passed is " + averagegPassed);
        System.out.println("The average score of students who failed is " + averagegFailed);
    }
}
