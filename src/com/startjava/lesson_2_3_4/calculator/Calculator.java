package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private float num1;
    private float num2;
    private String operation;

    /*public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
*/
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public float calculate() {
        String[] expressionParts = operation.split(" ");
        float result = 0;
        String operand = "";
        if (expressionParts.length < 3) {
            num1 = 0;
            num2 = Float.valueOf(expressionParts[1]);
            operand = expressionParts[0];
        } else {
            num1 = Float.valueOf(expressionParts[0]);
            num2 = Float.valueOf(expressionParts[2]);
            operand = expressionParts[1];
        }
        switch (operand) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "^":
                result = (float) pow(num1, num2);
                break;
            case "min":
                result = min(num1, num2);
                break;
            case "max":
                result = max(num1, num2);
                break;
            case "sin":
                result = (float) sin(num2);
                break;
            case "cos":
                result = (float) cos(num2);
                break;
            case "round":
                result = round(num2);
                break;
            case "sqrt":
                result = (float) sqrt(num2);
                break;
            default:
                System.out.println("Wrong symbol");
                break;
        }
        return result;
    }
}