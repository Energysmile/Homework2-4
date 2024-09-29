package smile.energy.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
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
    public String calculatorPlus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Нужно ввести оба значения";
        }
            return calculatorService.calculatorPlus(num1, num2);

    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Нужно ввести оба значения";
        }
            return calculatorService.calculatorMinus(num1, num2);

    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Нужно ввести оба значения";
        }
            return calculatorService.calculatorMultiply(num1, num2);

    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Нужно ввести оба значения";
        }
        if (num2 == 0) {
            return "На 0 делить нельзя";
        }
            return calculatorService.calculatorDivide(num1, num2);

    }
}