/**
 * Created by jhanward on 7/28/2017.
 */
class CalculatorDemo {
    public static void main(String[] args){

        CalculatorService.calculate(12,13,"add",(double one, double two, String operator)-> {
            double add = one + two;
            System.out.printf("Addition: %s%n", add);
        });

        CalculatorService.calculate(12,13,"subtract",(double one, double two, String operator)-> {
            double subtract = one - two;
            System.out.printf("Subtraction: %s%n", subtract);
        });

        CalculatorService.calculate(12,13,"multiply",(double one, double two, String operator)-> {
            double multiply = one*two;
            System.out.printf("Subtraction: %s%n", multiply);
        });

        CalculatorService.calculate(12,13,"divide",(double one, double two, String operator)-> {
            double divide = 0.0;
            try{
                divide = one/two;
                System.out.printf("Subtraction: %s%n", divide);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        });
    }
}
