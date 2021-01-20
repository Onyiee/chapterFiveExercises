package exerciseFivePointOneTwo;
//        5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product
//        of the odd integers from 1 to 15.

public class OddNumbersProduct {
    private int number;
    private int oddNumber;

    public void setNumber(int number) {
        if(number % 2 != 0){
             oddNumber = number;
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
