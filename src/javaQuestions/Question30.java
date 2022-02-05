package javaQuestions;

public class Question30 {

    public static void main(String[] args) {

        String message="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

        String sender=message.substring(message.indexOf('<')+1,message.indexOf('>'));

        String phonenumber=message.substring(message.indexOf('<')+1,message.indexOf('>'));

        String Message=message.substring(message.indexOf('<')+1,message.indexOf('>'));

        System.out.println(sender);


    }
}
/*

@ 30. Given a String message in the following format:
        Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
        assign the value of the sender, phoneNumber, and messageBody variables and print them

*/