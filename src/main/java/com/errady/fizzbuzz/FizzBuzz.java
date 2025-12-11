package com.errady.fizzbuzz;

public class FizzBuzz {

    public static String de(int n){

        if(n % 3 == 0){
            return "Fizz";
        }
        else if (n % 5 == 0) {
            return "Buzz";
        }
        if (n % 3 == 0 && n % 5 == 0){  // ToCheck First
            return "FizzBuzz";
        }
        else {
            return Integer.toString(n);
        }
    }
}
