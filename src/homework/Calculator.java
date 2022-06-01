package homework;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> divide = (x, y) -> {
        int result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println(
                    "Нельзя делить на ноль!" + e.getMessage());
        }
        return result;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abc = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}

