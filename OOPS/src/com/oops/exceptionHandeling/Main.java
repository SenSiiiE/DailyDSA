package com.oops.exceptionHandeling;

public class Main {
    public static void main(String[] args) throws MyException{



            int a = 1;
            int b = 0;

            if(b == 0){
                throw new MyException("Can't divide by zero");
            }
//            String name = "Vikash";
//            if (name.equals("Vikash")) {
//                throw new MyException("Your name is Vikash");
//            }

    }
}
