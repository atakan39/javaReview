package javaQuestions;

import java.util.Scanner;

public class Question52 {

    public static void main(String[] args) {


        System.out.println(sumOfnums(100));

        int number=50;

        System.out.println(sumOfnums(number));


    }

    public static int sumOfnums(int totalNumber){

        int sum=0;

        for (int i = 0; i <= totalNumber; i++) {
            sum=sum+i;
        }
        return sum;
    }

    public static void sumOfnums(int start, int end){

        int sum=0;

        for (int i = start ; i <= end; i++) {
            sum=sum+i;
        }

    }




}
/*
@52. write a program that can calculate the sum of all numbers between 1 to any given number
        input: 100
        output: 5050

 */