package javaQuestions;

import java.util.Scanner;

public class Question60 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int positiveNums=0;
        int negativeNums=0;


        for (int i = 1; i < 6; i++) {

            System.out.println("Enter number "+i);
            int num=input.nextInt();

            if(num>0){
                positiveNums++;
            }else if(num<0){
                negativeNums++;
            }

        }

        System.out.println("Positive numbers : "+positiveNums+"\nNegative numbers: "+negativeNums);

    }
}
/*
@@ 60. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
            Ex:
                Inputs:
                    10
                    20
                    -1
                    0
                    3

                Output:
                    3 positive and 1 negative

93.
  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};



 */