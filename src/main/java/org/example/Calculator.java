package org.example;

public class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        // Exemplo de uso dos métodos da calculadora
        double resultAdd = add(5, 3);
        System.out.println("5 + 3 = " + resultAdd);

        double resultSubtract = subtract(5, 3);
        System.out.println("5 - 3 = " + resultSubtract);

        double resultMultiply = multiply(5, 3);
        System.out.println("5 * 3 = " + resultMultiply);

        double resultDivide = divide(6, 3);
        System.out.println("6 / 3 = " + resultDivide);
    }
}