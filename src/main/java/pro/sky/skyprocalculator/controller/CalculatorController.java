package pro.sky.skyprocalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/")
    public String answerHello() {
        return calculatorService.answerHello();
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam(value = "num1", required = false) Integer num1,
                      @RequestParam(value = "num2", required = false) Integer num2) {
        calculatorService.checkArgument(num1, num2);
        return String.format("%d + %d = %d", num1, num2, calculatorService.sumUpTheArguments(num1, num2));
    }

    @GetMapping(path = "/minus")
    public String subtract(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        calculatorService.checkArgument(num1, num2);
        return String.format("%d - %d = %d", num1, num2, calculatorService.subtractArgument(num1, num2));

    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        calculatorService.checkArgument(num1, num2);
        return String.format("%d * %d = %d", num1, num2, calculatorService.multiplicationOfArgument(num1, num2));

    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(value = "num1", required = false) Double num1,
                           @RequestParam(value = "num2", required = false) Double num2) {
        calculatorService.checkArgument(num1, num2);
        calculatorService.checkArithmeticException(num2);
        return String.format("%.2f / %.2f = %.2f", num1, num2, calculatorService.divisionOfArguments(num1, num2));
    }

}
