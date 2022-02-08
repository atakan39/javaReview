package javaQuestions;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {

      elevator();









    }

    public static void elevator(/*int floorNumber*/){

         Scanner input=new Scanner(System.in);

        System.out.println("Push the number ->");
         int floorNumber=input.nextInt();

        String result;

        if(floorNumber>0 && floorNumber<4){
            switch (floorNumber) {
                case 1:
                    result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        }else{
            throw new RuntimeException("Invalid floor : "+floorNumber);


        }

        System.out.println(result);
    }
}
  /*  17. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
    when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
    when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
    when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
    anything else: print "Invalid floor - 6"

   */
