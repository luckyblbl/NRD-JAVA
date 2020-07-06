package nrd.belousov.numeralsystem;

import java.math.BigInteger;

public class NumeralSystem {
    public static void Convert(String a, String b, String x){
        BigInteger number = new BigInteger(x,Integer.valueOf(a));
        System.out.println(number.toString(Integer.valueOf(b)));
    }
}
