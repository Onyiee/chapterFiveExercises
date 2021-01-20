package exerciseFivePointOneTwo;

import javax.swing.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        OddNumbersProduct oddNumbersProduct = new OddNumbersProduct();
        int product = 1;


        for (int i = 1; i <= 15; i += 1) {
            if (i % 2 != 0) {
                product = product * i ;
            }

        }

        System.out.printf("product is %d%n", product);
    }
}
