package pro.sky.skyprocalculator.service;

public interface CalculatorService {

    String hello();

    String answerHello();

    String sumUpTheArguments(int num1, int num2);

    String subtractArgument(int num1, int num2);

    String multiplicationOfArgument(int num1, int num2);

    String divisionOfArguments(double num1, double num2);

   void checkArgument(double num2);

    void checkArgument(Object... args);



}
