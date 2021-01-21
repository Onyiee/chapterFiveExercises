package exerciseFivePointOneSeven;
//5.17 (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
//        Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
//        Write an application that reads a series of pairs of numbers as follows:
//        a) product number
//        b) quantity sold
//        Your program should use a switch statement to determine the retail price for each product. It
//        should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//        loop to determine when the program should stop looping and display the final results.


public class SalesCalculator {
    int productNumber;
    double price=0.0;

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber=productNumber;
        productPriceCalculator(productNumber);
    }

    public double getPrice() {
        return price;

    }

    private void productPriceCalculator(int number){
        switch (number){
            case 1:
                price += 2.98;
                break;

            case 2:
                price += 4.50;
                break;

            case 3:
                price += 9.98;
                break;

            case 4:
                price += 4.49;
                break;

            case 5:
                price += 6.87;
                break;
        }

    }



}
