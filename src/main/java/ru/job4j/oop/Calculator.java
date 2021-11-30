package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int m) {
        return m - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + multiply(s) + divide(s);
    }

    public static void main(String[] args) {
        int rslSum = sum(10);
        System.out.println("Результат сложенния = " + rslSum);
        Calculator calculator = new Calculator();
        int rslMultiply = calculator.multiply(5);
        System.out.println("Результат умножния = " + rslMultiply);
        int rslMinus = minus(13);
        System.out.println("Результат вычитания = " + rslMinus);
        int rslDivide = calculator.divide(20);
        System.out.println("Результат деления = " + rslDivide);
        int rslSumAllOperation = calculator.sumAllOperation(10);
        System.out.println("Сумма всех операций = " + rslSumAllOperation);
    }
}