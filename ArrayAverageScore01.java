import java.util.Scanner;

public class ArrayAverageScore01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[10];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        int total = 0;
        for (int score : scores) {
            total += score;
        }

        double average = (double) total / scores.length;
        System.out.println("The class average score is " + average);
    }
}