import java.util.Scanner;

   public class IT24101590Lab4Q3 {
     public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = Scanner.nextInt();
         Scanner.close();

         String result = (number > 0) ? "Positive":
                         (number < 0) ? "Negative":
                         "Zero";
         

         System.out.println("The number is: " + result);
   }
}