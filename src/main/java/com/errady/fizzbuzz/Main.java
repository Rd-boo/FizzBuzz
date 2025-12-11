package com.errady.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        int nb = 15;
        for (int i = 1; i <= nb; i++){
            System.out.println(fb.de(i));
        }
    }
}
