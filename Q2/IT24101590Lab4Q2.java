import java.util.Scanner;

public class IT24101590Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter exam marks (out of 100):");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.println("Enter the lab submission marks (out of 100):");
        double labSubmission = scanner.nextDouble();
        if (labSubmission < 0 || labSubmission > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.println("Please enter the percentage given for the exam:");
        double examPercentage = scanner.nextDouble();
        System.out.println("Please enter the percentage given for the lab submission:");
        double labPercentage = scanner.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating program.");
            return;
        }

        double examMarksCalculated = examMarks * examPercentage / 100;
        double labMarksCalculated = labSubmission * labPercentage / 100;
        double finalMarks = examMarksCalculated + labMarksCalculated;

        System.out.println("Final Marks: " + finalMarks);
    }
}