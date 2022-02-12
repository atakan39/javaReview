package javaQuestions;

import java.util.Scanner;

public class Question90 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String [] names=new String[3];





        for (int i = 0; i < 3; i++) {

            System.out.println("enter your friend name "+(i+1));
            names[i]=input.next();

        }



        for (String each:  names) {
         //   System.out.println(reverseString(each));
            String reversed="";
            for (int i=each.length()-1; i>=0; i--){
                reversed+=each.charAt(i);

            }
            System.out.println(reversed);
        }


    }

    public static String reverseString(String str){

        return null;
    }
}
/*
 90.
      create string array, and store the names of your  class mates (3)
      reverse each students names and print them in separate lines
 */