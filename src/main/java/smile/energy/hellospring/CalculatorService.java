package smile.energy.hellospring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String calculator() {
        return "<i>Добро пожаловать в калькулятор&#129303</i>";
    }

    public String calculatorPlus(int num1, int num2) {
        int i = num1 + num2;
        return num1 + " + " + num2 + " = " + i;
    }

    public String calculatorMinus(int num1, int num2) {
        int i = num1 - num2;
        return num1 + " - " + num2 + " = " + i;
    }

    public String calculatorMultiply(int num1, int num2) {
        int i = num1 * num2;
        return num1 + " * " + num2 + " = " + i;
    }

    public String calculatorDivide(double num1, double num2) {
        double i = num1 / num2;
        return num1 + " / " + num2 + " = " + i;

    }
}
