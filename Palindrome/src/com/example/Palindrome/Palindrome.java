package com.example.Palindrome;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    String userInput, reverseUserInput;

    System.out.print("Give me a word: ");
    userInput = user.nextLine();
    StringBuilder builder = new StringBuilder(userInput);
    reverseUserInput = (builder.reverse()).toString();
    System.out.println(reverseUserInput);

       if ((userInput.toLowerCase()).equals(reverseUserInput.toLowerCase())) {
            System.out.println("This is a palindrome");
        }
       else {
            System.out.println("This is not a palindrome");
        }

    }
}
