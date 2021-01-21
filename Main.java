package exerciseFivePointOneSeven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SalesCalculator salesCalculator = new SalesCalculator();
        int productNumber;

        System.out.println("enter product number or -1 to terminate: ");
        productNumber = input.nextInt();
        while (productNumber != -1) {
            salesCalculator.setProductNumber(productNumber);
            System.out.println("enter product number or -1 to terminate: ");
            productNumber = input.nextInt();

        }
        double totalPrice = salesCalculator.getPrice();
        System.out.printf("Total value of all products sold is %.2f%n",totalPrice);
    }
}
