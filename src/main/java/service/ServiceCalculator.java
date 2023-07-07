package service;

public interface ServiceCalculator {

    String calculator();
    String writeCalculator();

    Integer plus(Integer num1, Integer num2);
    Integer minus(Integer num1, Integer num2);
    Integer multiply(Integer num1, Integer num2);
    Integer divide(Integer num1, Integer num2);

}

