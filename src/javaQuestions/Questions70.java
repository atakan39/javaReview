package javaQuestions;

import java.util.Arrays;

public class Questions70 {
    public static void main(String[] args) {

        String word1="silent";
        String word2="listen";

        char [] word1chars=word1.toCharArray();
        char [] word2chars=word2.toCharArray();

        Arrays.sort(word1chars);
        Arrays.sort(word2chars);

        System.out.println(Arrays.toString(word1chars));
        System.out.println(Arrays.toString(word2chars));


        boolean isAnagram=Arrays.equals(word1chars,word2chars);

        System.out.println(isAnagram);


        if(Arrays.equals(word1chars,word2chars)){
            System.out.println("is Anagram");
        }else{
            System.out.println("NOT anagram");
        }


















 /*  //split how many words
        String str="dOg cAt dOG java java cat cat cat";
        String word="dog";

       String [] words= str.split(" ");

        System.out.println(Arrays.toString(words));

        int count=0;

        for (String each : words) {
            if(each.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(word +": "+ count +" times");

    */








    }
}
// @ 70. check if two words is anagram.