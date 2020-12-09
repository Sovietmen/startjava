package com.startjava.lesson_2_3_4.calculator;

import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String answer;
        Scanner scan = new Scanner(System.in);
        answer = "y";
        while (!answer.equals("n")) {
            if (answer.equals("y")) {
                System.out.println("Enter math expression: ");
                calculator.setExpression(scan.nextLine());
                System.out.println("Result = " + calculator.calculate());
            }
            System.out.println("Continue (y/n)?");
            answer = scan.nextLine();
        }
    }
}