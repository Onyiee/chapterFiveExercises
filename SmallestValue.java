package exerciseFivePointOneOne;

//(Find the Smallest Value) Write an application that finds the smallest of several integers.
//        Assume that the first value read specifies the number of values to input from the user.

public class SmallestValue {

    private int smallestNumber;


    public void setNumber(int number) {
        if(number < smallestNumber) {
            smallestNumber = number;
        }


    }

    public int getNumber() {
        return smallestNumber;
    }


    public int getUserInput() {
        return getNumber();
    }

    public void setFirstNumber(int number)
    {
        smallestNumber=number;
    }
}
