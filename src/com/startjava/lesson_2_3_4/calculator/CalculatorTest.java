package com.startjava.lesson_2_3_4.calculator;

import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String answer;
        Scanner scan = new Scanner(System.in);
        answer = "y";
        float result = 0.0f;
        while (!answer.contentEquals("n")) {
            if (answer.contentEquals("y")) {
                System.out.println("Enter math expression: ");
                calculator.setOperation(scan.nextLine());
                result = calculator.calculate();
                System.out.println("Result = " + result);
            }
            System.out.println("Continue (y/n)?");
            answer = scan.nextLine();
        }
    }
}