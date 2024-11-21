package project;
import java.util.Random;
import java.util.Scanner;

public class MathioGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int levels = 5;
        int[] scores = new int[levels]; 
        int totalScore = 0;

        for (int level = 0; level < levels; level++) {
          
            int num1 = random.nextInt(10); 
            int num2 = random.nextInt(10); 
            
       
            System.out.printf("Level %d: What is %d + %d? ", level + 1, num1, num2);
            int correctAnswer = num1 + num2;

          
            int playerAnswer = scanner.nextInt();

            
            if (playerAnswer == correctAnswer) {
                System.out.println("Correct!");
                scores[level] = 10; 
            } else {
                System.out.println("Wrong! The correct answer was " + correctAnswer);
                scores[level] = -5; 
            }
        }

    
        for (int score : scores) {
            totalScore += score;
        }

      
        System.out.println("Your total score is: " + totalScore);
        if (totalScore == 50) {
            System.out.println("Success!");
        } else {
            System.out.println("You can try again.");
        }

       
        scanner.close();
    }
}
