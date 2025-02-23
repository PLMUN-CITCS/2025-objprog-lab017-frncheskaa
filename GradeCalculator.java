import java.util.Scanner;

public class GradeCalculator {
    public static int getStudentScore() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter your score: "); 
        int score = input.nextInt(); 
        return score; 
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println("Your Grade is: " + calculateGrade(getStudentScore())); 
    }
}