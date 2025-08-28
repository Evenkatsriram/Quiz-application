import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which programming language is platform independent?",
            "3. Who developed Java?",
            "4. What is 5 + 7?",
            "5. Which one is not an OOP concept in Java?"
        };

        // Multiple-choice options
        String[][] options = {
            {"a) Berlin", "b) Madrid", "c) Paris", "d) Rome"},
            {"a) C", "b) Java", "c) Python", "d) Assembly"},
            {"a) Dennis Ritchie", "b) James Gosling", "c) Bjarne Stroustrup", "d) Guido van Rossum"},
            {"a) 10", "b) 11", "c) 12", "d) 13"},
            {"a) Inheritance", "b) Polymorphism", "c) Compilation", "d) Encapsulation"}
        };

        // Correct answers
        char[] correctAnswers = {'c', 'b', 'b', 'c', 'c'};

        int score = 0;

        System.out.println("===== Welcome to the Quiz Application =====\n");

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (a/b/c/d): ");
            char answer = sc.next().toLowerCase().charAt(0);

            // Check if correct
            if (answer == correctAnswers[i]) {
                score++;
                System.out.println("✅ Correct!\n");
            } else {
                System.out.println("❌ Wrong! Correct answer: " + correctAnswers[i] + "\n");
            }
        }

        // Final score
        System.out.println("===== Quiz Finished! =====");
        System.out.println("Your final score: " + score + "/" + questions.length);

        sc.close();
    }
}
