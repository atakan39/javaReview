package javaQuestions;

public class Question21 {
    public static void main(String[] args) {


      takeFisrtmidlast("ss");



    }

    public static void takeFisrtmidlast (String str){

            if (str.length() <= 2) {
                throw new RuntimeException("String too short.");
            }

            if (str.length() % 2 == 0) {

                str = str.substring(0, 1) + str.substring(str.length() - 1);

            } else {

                str = str.substring(0, 1) + str.substring(str.length() / 2, str.length() / 2 + 1) + str.substring(str.length() - 1);
            }


        System.out.println(str);


        }

}



// 21. Write a program that will print out first , mid and last letters together.
//
// /*  alternative
//
//     if (str.length() % 2 == 0) {
//
//            str = "" + str.charAt(0) + str.charAt(str.length() - 1);
//
//        } else {
//            str = "" + str.charAt(0) + str.charAt(str.length() / 2) + str.charAt(str.length() - 1);
//        }
//*/