package pro.sky.skyprocalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceInt implements CalculatorService {

    public String hello() {
        return "Hello";
    }

    public String answerHello() {
        return "Добро пожаловать в калькулятор ";
    }

    public int sumUpTheArguments(int num1, int num2){
        return num1 + num2;
    }

    public int subtractArgument(int num1, int num2){
        return num1 - num2;

    }

    public int multiplicationOfArgument(int num1, int num2){
        return num1 * num2;

    }

    public double divisionOfArguments(double num1, double num2){
        return num1 / num2;
    }

    public void checkArithmeticException(double num2){
        if (num2 == 0) {
            throw new ArithmeticException("Error: Деление на 0 запрещено");
        }

    }

    public void checkArgument(Object... args) {
        for (Object arg : args) {
            if (arg == null) {
                throw new  IllegalArgumentException("Error:оба аргумента должны быть предоставлены");
            }

        }

    }



}



