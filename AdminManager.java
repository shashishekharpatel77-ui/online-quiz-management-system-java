package service;

import java.util.Scanner;
import model.Question;

public class AdminManager {

    private Scanner scanner;

    public AdminManager() {
        scanner = new Scanner(System.in);
    }

    public void addQuestion(QuizManager quizManager) {

        System.out.println("\n===== Add New Question =====");

        System.out.print("Enter Question ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Question: ");
        String questionText = scanner.nextLine();

        System.out.print("Option A: ");
        String optionA = scanner.nextLine();

        System.out.print("Option B: ");
        String optionB = scanner.nextLine();

        System.out.print("Option C: ");
        String optionC = scanner.nextLine();

        System.out.print("Option D: ");
        String optionD = scanner.nextLine();

        System.out.print("Correct Answer (A/B/C/D): ");
        String correctAnswer = scanner.nextLine();

        Question question = new Question(
                id,
                questionText,
                optionA,
                optionB,
                optionC,
                optionD,
                correctAnswer
        );

        quizManager.addQuestion(question);
    }
}