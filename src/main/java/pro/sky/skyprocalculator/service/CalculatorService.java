package pro.sky.skyprocalculator.service;

public interface CalculatorService {

    String hello();

    String answerHello();

    int sumUpTheArguments(int num1, int num2);

    int subtractArgument(int num1, int num2);

    int multiplicationOfArgument(int num1, int num2);

    double divisionOfArguments(double num1, double num2);

   void checkArgument(double num2);

    void checkArgument(Object... args);



}
