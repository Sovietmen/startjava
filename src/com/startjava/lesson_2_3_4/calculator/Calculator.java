package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private float num1;
    private float num2;
    private String operation;

    public void setExpression(String operation) {
        this.operation = operation;
    }

    public float calculate() {
        String[] expressionParts = operation.split(" ");
        String operand = expressionParts[1];
        num1 = Float.valueOf(expressionParts[0]);
        num2 = Float.valueOf(expressionParts[2]);
        switch (operand) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            case "^":
                return (float) pow(num1, num2);
            case "min":
                return min(num1, num2);
            case "max":
                return max(num1, num2);
            default:
                System.out.println("Wrong symbol");
                break;
        }
        return 0;
    }
}