import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Double> sqrt = Math::sqrt;


        double input = 16.0;
        double result = sqrt.apply(input);
        System.out.println("Корень числа " + input + " = " + result);
    }
}






