package javaQuestions;

public class Question83 {
    public static void main(String[] args) {

        String str="aabcccd";

        String chars="";
        String result="";

        for (int i = 0; i <= str.length()-1; i++) {

            if (!chars.contains(str.charAt(i) + "")) {
                chars += "" + str.charAt(i);
            }

            // abcd

        }





            for (int j = 0; j < chars.length(); j++) {

                int count=0;

                for (int k = 0; k < str.length(); k++) {

                    if(chars.charAt(j)==str.charAt(k)){
                        count++;
                    }
                }

                result+=""+chars.charAt(j)+count;
            }
        System.out.println(result);
           }


    }

/*
83. Write a program that can find the frequency of the characters from a string    nested for loopi

        Ex:
        str = "aabcccd";

        output:
        a2b1c3d1
*/

/*
83. Write a program that can find the frequency of the characters from a string    nested for loopi

             Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */