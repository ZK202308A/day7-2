package org.example;

import org.example.quiz.Quiz;
import org.example.quiz.QuizService;
import org.example.quiz.QuizUI;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        QuizService.INSTANCE.addQuiz(new Quiz("Q1..","y"));
        QuizService.INSTANCE.addQuiz(new Quiz("Q2..","y"));
        QuizService.INSTANCE.addQuiz(new Quiz("Q3..","y"));
        QuizService.INSTANCE.addQuiz(new Quiz("Q4..","y"));
        QuizService.INSTANCE.addQuiz(new Quiz("Q5..","y"));

        Scanner scanner = new Scanner(System.in);
        QuizUI quizUI = new QuizUI(scanner);

        quizUI.show();


    }
}