/**
 * Created by jhanward on 7/28/2017.
 */
public class CalculatorService {
    public static void calculate(double first, double second, String operator, ICalculator iCalculator) {
        iCalculator.calculateMethod(first, second, operator);
    }
}
