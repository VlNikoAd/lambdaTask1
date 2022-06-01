package homework;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);

        /* Код не работает, так как в функции divide
        идет деление на 0. Арифметическая ошибка.
        Решить можно:
        1) Поменять исходные данные для операции minus.
        2) Добавить конструкцию try/catch в лямбду divide.
         */

    }
}
