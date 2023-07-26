package com.qa;

public class Main {
    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        System.out.println("Mult result: " + bc.mult(2, 3));
        try {
            System.out.println("Div result: " + bc.div(6, 0));
        } catch (ArithmeticException ae) {
            System.out.println("Calc error");
            ae.printStackTrace();
        }
        MyConsoleReader mcr = new MyConsoleReader();
        mcr.readInputPrint();

    }
}
