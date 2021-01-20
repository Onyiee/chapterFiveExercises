package exerciseFivePointOneSix;
//(Bar Chart Printing Program) One interesting application of computers is to display
//        graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//        number that’s read, your program should display the same number of adjacent asterisks. For example,
//        if your program reads the number 7, it should display *******. Display the bars of asterisks after
//        you read all five numbers.

import java.util.Scanner;

public class BarChart {

    public static String getNumber() {


        Scanner input = new Scanner(System.in);

            System.out.println("enter first number: ");
            int firstNumber = input.nextInt();
            System.out.println("enter second number: ");
            int secondNumber = input.nextInt();
            System.out.println("enter third number: ");
            int thirdNumber = input.nextInt();
            System.out.println("enter fourth number: ");
            int fourthNumber = input.nextInt();
            System.out.println("enter fifth number: ");
            int fifthNumber = input.nextInt();

        System.out.println(displayStars(firstNumber));
        System.out.println(displayStars(secondNumber));
        System.out.println( displayStars(thirdNumber));
        System.out.println( displayStars(fourthNumber));
        System.out.println(displayStars(fifthNumber));

        return null;
    }

    private static String displayStars(int number){
        String asterisk = "";
        if(number > 1 && number <= 30) {

            for (int i = 0; i < number; i++) {
                asterisk += "*";
            }
        }else {
            asterisk+="invalid input";
        }
       return asterisk;
    }
}
