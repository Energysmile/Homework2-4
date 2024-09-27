package smile.energy.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }


    @GetMapping(path = "/plus")
    public String calculatorPlus(@RequestParam int num1, int num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam int num1, int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam int num1, int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam int num1, int num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }
}