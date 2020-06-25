package es.vass.kata5;

import java.math.BigDecimal;
import java.util.stream.LongStream;

public class MathUtils {

    private static Long ZERO_VALUE = 48L;

    public static Long sumPowerOfTwoDigits(Long exponent) {
        String cadena = new BigDecimal(Math.pow(2, exponent)).toPlainString();
        return cadena.chars()
                .mapToLong(value -> value - ZERO_VALUE)
                .sum();

    }

    public static Long _10001FirstPrimeNumber(int position) {
        long[] value = LongStream.rangeClosed(1, 1000000)
                .filter(element -> LongStream.rangeClosed(2, Double.valueOf(Math.sqrt(element)).longValue()).allMatch(divisor -> element % divisor != 0))
                .toArray();
        return value[position];
    }

}
