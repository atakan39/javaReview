package javaQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Question88 {

    public static void main(String[] args) {

        findAverage();

    }

    public static void findAverage(){
        Scanner input=new Scanner(System.in);

        System.out.println("How many number you want>");

        int totalNumbers=input.nextInt(); // 3

        int [] nums=new int[totalNumbers];
        double sum=0;

        for (int i = 0; i < totalNumbers; i++) {

            System.out.println("enter a number");

            int num=input.nextInt();

            while(num<=0){
                System.out.println("enter again");
                num=input.nextInt();
            }
            nums[i]=num;
            sum+=num;
        }

        double average=sum/totalNumbers;

        System.out.println(Arrays.toString(nums));

        System.out.println(average);



    }

}

/*
@@ 4.
        AverageNumber:
        1. Ask the user how many numbers they want to enter
        2. get all the inputs from the user and store them into an array
        3. Iterate the array & return the average number

 */

