package javaQuestions;

public class Question38 {

    public static void main(String[] args) {


        String str="one";
        String str2="aigth";

        String merged="";

        if(str.substring(str.length()-1).equals(str2.substring(0,1))){
            merged=str+str2.substring(1);

        }else{
            merged=str+str2;
        }

        System.out.println(merged);
    }
}
/*
38. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */