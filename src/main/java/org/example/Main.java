package org.example;

import org.example.ex1.ChRest;
import org.example.ex1.GunsanRest;
import org.example.ex1.SeoulRest;
import org.example.quiz.Quiz;
import org.example.quiz2.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void testZazang(ChRest chRest){

        chRest.makeZazang();

    }


    public static void main(String[] args) {

        QuizService.INSTANCE.addQuiz(new SQuizVO("Q1..","y"));
        QuizService.INSTANCE.addQuiz(new MQuizVO("Q1..","AAA","AAA","BBB"));

        Scanner scanner = new Scanner(System.in);
        QuizUI quizUI = new QuizUI(scanner);

        quizUI.show();

//        QuizVO q1 = new SQuizVO("Subjective...","A");
//
//        System.out.println(q1.getText());
//
//        System.out.println(q1.checkAnswer("A"));


//        ChRest rest1 = new ChRest();
//        rest1.makeZazang();
//
//        ChRest rest2 = new SeoulRest();
//        rest2.makeZazang();
//
//        ChRest rest3 = new SeoulRest();
//        rest3.makeZazang();



//        System.out.println(QuizService.INSTANCE);
//        Quiz q1 = new Quiz("Q1..","y");
//
//        QuizService.INSTANCE.addQuiz(q1);
//
//        QuizService.INSTANCE.addQuiz(new Quiz("Q2..","y"));
//        QuizService.INSTANCE.addQuiz(new Quiz("Q3..","y"));
//        QuizService.INSTANCE.addQuiz(new Quiz("Q4..","y"));
//        QuizService.INSTANCE.addQuiz(new Quiz("Q5..","y"));
//
//        Scanner scanner = new Scanner(System.in);
//        QuizUI quizUI = QuizUI.INSTANCE;
//        quizUI.setScanner(scanner);
//
//        quizUI.show();


    }
}