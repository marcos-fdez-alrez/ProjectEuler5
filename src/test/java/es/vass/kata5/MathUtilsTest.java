package es.vass.kata5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {


    private static final Long POWER_SUM_RESULT = 104743L;
    private static final Long EXPONENT = 15L;

    private static final Long PRIME_RESULT = 1366L;


    @DisplayName("Test Sum Digits")
    @Test
    void sumPowerOfTwoDigits() {
        Long result = MathUtils.sumPowerOfTwoDigits(EXPONENT);
        assertEquals(POWER_SUM_RESULT,result);
    }

    @DisplayName("Test 10001 First prime number")
    @Test
    void test10001FirstPrimeNumber() {
        Long result = MathUtils._10001FirstPrimeNumber();
        assertEquals(PRIME_RESULT,result.longValue());
    }

}
