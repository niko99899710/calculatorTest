package com.example.calculatortest.service;

import com.example.calculatortest.exception.ZeroDividerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Service12Test {
    private final Service12Impl service12Impl = new Service12();

    public Service12Test() {
    }

    @Test
    public void wight10WhenSumOne5Two5(){
        int answer = service12Impl.plus(5,5);
        Assertions.assertEquals(10, answer);
    }

    @Test
    public void wight0WhenSumOne5Two5(){
        int answer = service12Impl.minus(5,5);
        Assertions.assertEquals(0, answer);
    }

    @Test
    public void wight25WhenSumOne5Two5(){
        int answer = service12Impl.multiply(5,5);
        Assertions.assertEquals(25, answer);
    }

    @Test
    public void wight1WhenSumOne5Two5(){
        int answer = service12Impl.divide(5,5);
        Assertions.assertEquals(1, answer);
    }

    @Test
    public void shouTrowExceptionZeroDividerException(){
        Assertions.assertThrows(ZeroDividerException.class,() -> service12Impl.divide(5,5));
    }


}
