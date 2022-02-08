package javaQuestions;

import java.util.Scanner;

public class Question81 {
    public static void main(String[] args) {

       circleInfoApp();











    }

    public static double area(double radius){
        double pi=3.14;
        return radius*radius*pi;
    }

    public static double perimeter(double radius){
        double pi=3.14;
        return 2*radius*pi;

    }

    public static void circleInfoApp(){
        final double pi=3.14;

        Scanner input=new Scanner(System.in);


        boolean anotherOne;

        do {

            System.out.println("Enter the radius");

           double radius = input.nextDouble();

           while (radius < 0) {
                System.out.println("Enter a valid radius");
                radius = input.nextDouble();
            }

       /*     if(radius<0){
                throw new RuntimeException("invalid entry- your entry :"+radius);
            } */

            //     double area=radius* radius* pi;

            System.out.println("area = "+ area(radius));

            //      double perimeter=2*radius*pi;

            System.out.println("perimeter = "+ perimeter(radius));

            System.out.println("Would you like to do it another one");

            String answer=input.next();

            anotherOne=answer.equalsIgnoreCase("Yes");

            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using CircleInfoApp");
            }


        }while(anotherOne);

    }


}
/*
81.Write a program that can calculate the area and perimeter of a circle:
            a. Ask the user "Enter the radius of the circle:"
                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

            b. Display:
                    1. Diameter of circle
                    2. Area of circle
                    3. Perimeter of circle

            c. Ask the user "Would you like to calculate another circle?"
                    If "yes" --> repeat the previous steps
                    If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"
 */

/*
        Scanner inPut = new Scanner(System.in);

while(true){

            System.out.println("Enter the radius of the circle:");
            double radius = inPut.nextDouble();
            double pI = 3.14;
            double diameter = radius * 2;
            double area = radius * radius * pI;
            double perimeter = 2 * radius * pI;

            if (!(radius > 0)) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.println("diameter = " + diameter);
            System.out.println("Perimeter = " + perimeter);
            System.out.println("Area = " + area);

            System.out.println("Would you like to calculate another circle?");
            String anotherOne = inPut.next().toLowerCase();


            while (!(anotherOne.equals("yes") || anotherOne.equals("no"))) {
                System.err.println("invalid entry re enter answer");
                anotherOne = inPut.next().toLowerCase();
            }

            if (anotherOne.equals("no")) {
                System.out.println("thank you for using calculator APP");
                break;
            }

        }
inPut.close();

 */