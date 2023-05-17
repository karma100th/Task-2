package homework1;

import java.math.BigInteger;

public class Task2 {
    public static void main(String[] args) {
        int index = 50;
        int counter = 2;
        BigInteger sumNumber = BigInteger.ZERO;
        BigInteger helperValue;
        BigInteger helperValue2 = new BigInteger("0");
        BigInteger helperValue1 = new BigInteger("1");

        while (counter < index) {
            helperValue = helperValue1;
            helperValue1 = helperValue1.add(helperValue2);
            helperValue2 = helperValue;
            System.out.print(helperValue1 + "\t");
            counter++;
            if (helperValue1.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0) {
                sumNumber = sumNumber.add(helperValue1);
            }
        }
        System.out.println("\nСумма четных чисел из ряда равна: " + sumNumber);
    }
}
