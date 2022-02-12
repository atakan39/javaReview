package javaQuestions;

import java.util.Arrays;

public class Question93 {
    public static void main(String[] args) {


        int nums[] = {1, 2, 3, 4, 5};

        reverseArray(nums);

    }


    public static void reverseArray(int[] arr) {

        int[] reversed = new int[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            reversed[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(reversed));

    }

}

    /*
    public static int [] reverseArray(int [] arr){

        int [] reversed=new int[arr.length];

        int j=0;

        for (int i = arr.length - 1; i >= 0; i--) {

            reversed[j]=arr[i];
            j++;

        }

        return reversed;
    }
}
*/
/*
93.
  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};


 */