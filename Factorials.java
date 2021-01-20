package exerciseFivePointOneThree;
//5.13 (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
//        integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
//        1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
//        results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
//

public class Factorials {
    private int number;
    private long factorials=1;


    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return  number;
    }

    public long getFactorials() {
        while(number >= 1){
            factorials = factorials * number;
            number--;
        }
        return factorials;
    }

}
