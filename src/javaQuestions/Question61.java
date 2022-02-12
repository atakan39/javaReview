package javaQuestions;

public class Question61 {
    public static void main(String[] args) {

        String word = "aabccdc";
        char cha = 'c';
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==cha) {
                count++;
            }
        }
        System.out.println(count);

    }
}

/*
 @@  61. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3



 */
