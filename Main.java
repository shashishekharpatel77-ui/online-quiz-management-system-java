import java.util.Scanner;
import model.User;
import service.AdminManager;
import service.QuizManager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizManager quizManager = new QuizManager();
        AdminManager adminManager = new AdminManager();

         while (true) {

            System.out.println("\n========== ONLINE QUIZ MANAGEMENT SYSTEM ==========");
            System.out.println("1. Register User");
            System.out.println("2. Add Question");
            System.out.println("3. Display Questions");
            System.out.println("4. Start Quiz");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter User ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine();

                   
                    
                    User user = new User(id, username);

                    quizManager.addUser(user);

                    break;

                       case 2:

                    adminManager.addQuestion(quizManager);

                    break;

                case 3:

                    quizManager.displayQuestions();

                    break;

                case 4:

                    System.out.println("Quiz feature will be implemented next.");

                    break;

                case 5:

                    System.out.println("Thank You!");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }

}

       