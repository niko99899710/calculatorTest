package com.example.calculatortest.service;

import com.example.calculatortest.exception.ZeroDividerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Service12ParamTest {
    private final Service12Impl service12Impl = new Service12();

    @ParameterizedTest
    @CsvSource({"5,5,10", "3,4,7"})
    public void shouldParamPlus(int num1, int num2, int expected ){
        int answer = service12Impl.plus(num1, num2);
        Assertions.assertEquals(expected, answer);
    }
    @ParameterizedTest
    @CsvSource({"5,5,0", "8,4,4"})
    public void shouldParamMinus(int num1, int num2, int expected){
        int answer = service12Impl.minus(num1, num2);
        Assertions.assertEquals(expected, answer);
    }

    @ParameterizedTest
    @CsvSource({"5,5,25", "8,4,32"})
    public void shouldParamMultiply(int num1, int num2, int expected){
        int answer = service12Impl.multiply(num1, num2);
        Assertions.assertEquals(expected, answer);
    }

    @ParameterizedTest
    @CsvSource({"5,5,1", "8,4,2"})
    public void shouldParamDivide(int num1, int num2, int expected){
        int answer = service12Impl.divide(num1, num2);
        Assertions.assertEquals(expected, answer);
    }

    @ParameterizedTest
    @CsvSource({"5,0", "8,0"})
    public void shouTrowExceptionZeroDividerException(int num1, int num2){
        Assertions.assertThrows(RuntimeException.class,() -> service12Impl.divide(num1,num2));
    }

}
