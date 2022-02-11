package javaQuestions;

public class Question25 {
    public static void main(String[] args) {


        String str = "ata";
        String str2 = "kan";

        String result="";

        int j=0;

        if (str.length()==3 && str2.length()==3){

            for (int i = 0; i < str.length(); i++,j++) {

                result+=str.charAt(i)+""+str2.charAt(j)+"";
            }

     }else{
          System.out.println("Invalid word length");
        }

        System.out.println(result);

    }
}