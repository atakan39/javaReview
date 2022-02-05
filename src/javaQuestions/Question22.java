package javaQuestions;

public class Question22 {
    public static void main(String[] args) {
        String a = "qweqweqweqdsssdd", b = "sasdasdasasdsss", c = "ss";


        longestWord(a, b, c);

    }

    public static void longestWord(String str1, String str2, String str3) {
      if(str1.length()<10 && str2.length()<10 && str3.length()<10) {

          if (str1.length() > str2.length() && str1.length() > str3.length() && str2.length() != str3.length()) {
              System.out.println("longest word :" + str1 + "\nlength of longest word is : " + str1.length());
          } else if (str2.length() > str3.length() && str2.length() > str1.length() && str1.length() != str3.length()) {
              System.out.println("longest word :" + str2 + "\nlength of longest word is : " + str2.length());
          } else if (str3.length() > str2.length() && str3.length() > str1.length() && str1.length() != str2.length()) {
              System.out.println("longest word :" + str3 + "\nlength of longest word is : " + str3.length());
          } else {
              System.out.println("invalid");
          }
      }else{
          System.out.println(" word is to long");
      }

        /*    if(str1.length() != str2.length()  && str1.length() != str3.length() && str2.length() != str3.length() ){
            String result;

            if(str1.length()>str2.length() && str1.length()>str2.length()){
                System.out.println("longest word :"+str1+"\nlength of longest word is : "+ str1.length());
            }else if(str2.length()>str3.length() && str2.length()>str1.length()){
                System.out.println("longest word :"+str2+"\nlength of longest word is : "+ str2.length());
            }else{
                System.out.println("longest word :"+str3+"\nlength of longest word is : "+ str3.length());
            }
        }else{
            System.out.println("reqs not valid");
     */

    }
}
//22. Write a program that will print out the longest word of there words.
// Note: Assume the length of the three given Strings will be different
