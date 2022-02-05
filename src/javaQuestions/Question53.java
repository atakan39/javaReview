package javaQuestions;

import java.util.Scanner;

public class Question53 {
    public static void main(String[] args) {


        int number=50;

        int number2=55;


        sumOfEvens(number,number2);

    }

    public static void sumOfEvens(int start, int end){


        int sum=0;

        for (int i = start; i <= end ; i++) {
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }


}
/*
    ask user to give 2 numbers;
53. -Write a program that can return the sum of even numbers between 50 to 55. edge is included


        53. Write a program that can return the factorial number of any given number

        Ex:
        input: 5
        output: 120
         */