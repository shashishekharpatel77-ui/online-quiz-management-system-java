package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Question;
import model.User;

public class QuizManager {

    private ArrayList<Question> questions;
    private ArrayList<User> users;
    private Scanner scanner;

    public QuizManager() {
        questions = new ArrayList<>();
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Add Question
    public void addQuestion(Question question) {
        questions.add(question);
        System.out.println("Question added successfully.");
    }

    // Add User
    public void addUser(User user) {
        users.add(user);
        System.out.println("User registered successfully.");
    }

    // Display Questions
    public void displayQuestions() {
        if (questions.isEmpty()) {
            System.out.println("No questions available.");
            return;
        }

        for (Question question : questions) {
            question.displayQuestion();
            System.out.println();
        }
    }
}