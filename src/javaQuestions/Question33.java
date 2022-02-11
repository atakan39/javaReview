package javaQuestions;

public class Question33 {
    public static void main(String[] args) {


replaceAll("Atakan",'a','x');

    }


    public static void replaceAll(String str, char oldChar, char newChar ){
        String result="";

        for (int i = 0; i < str.length(); i++) {

            if((str.charAt(i)+"").equalsIgnoreCase(oldChar+"")){
                result+= newChar;
            }else{
                result+=str.charAt(i)+"";
            }

        }

        System.out.println(result);
    }
}
