package com.kodilla;

class Calculator {

    public int addAToB(int a, int b){
        return a + b;
    }
    public int subtractBFromA(int a, int b){
        return a - b;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        int ad = calculator.addAToB(10,7);
        int sub = calculator.subtractBFromA(10,7);
        System.out.println(ad + "\n" + sub);
    }
}