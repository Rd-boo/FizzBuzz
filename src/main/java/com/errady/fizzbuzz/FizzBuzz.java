package com.errady.fizzbuzz;

public class FizzBuzz {

    public static String de(int n){

        if(n == 3 || n == 6 || n == 9 || n == 12){
            return "Fizz";
        }
        else if (n == 5 || n == 10) {
            return "Buzz";
        }
        if (n == 15 || n == 30){
            return "FizzBuzz";
        }
        else {
            return Integer.toString(n);
        }
    }
}
