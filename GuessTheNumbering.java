package Project_biginner;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumbering {
	    public static void main(String[] args) {
	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);
	        int numberToGuess = random.nextInt(100) + 1;
	        int numberOfTries = 0;
	        int guess;
	        boolean win = false;

	        System.out.println("Welcome to Guess the Number Game!");
	        System.out.println("I have randomly chosen a number between 1 and 100.");
	        System.out.println("Try to guess it!");

	        while (!win) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            numberOfTries++;

	            if (guess < 1 || guess > 100) {
	                System.out.println("Invalid guess. Please enter a number between 1 and 100.");
	            } else if (guess < numberToGuess) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > numberToGuess) {
	                System.out.println("Too high! Try again.");
	            } else {
	                win = true;
	                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
	            }
	        }
	    }
	}

