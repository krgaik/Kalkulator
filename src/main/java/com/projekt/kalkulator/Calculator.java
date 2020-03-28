package com.projekt.kalkulator;

public class Calculator {

    public int addNumbers(int a, int b){
        return a+b;
    }

    public int subNumbers(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator kalkulator = new Calculator();
        kalkulator.addNumbers(5,6);
        System.out.println("It works");
    }
}

