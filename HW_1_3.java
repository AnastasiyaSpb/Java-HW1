package HW;
/*
 * Реализовать простой калькулятор
 */


import java.util.Scanner;

public class HW_1_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_num = read.nextInt();
        System.out.print("Введите знак: ");
        String sign = read.next();
        System.out.printf("Введите второе число: ");
        int second_num = read.nextInt();
        read.close();
        int result;
        switch (sign) {
            case "+":
                result = first_num + second_num;
                break;
            case "-":
                result = first_num - second_num;
                break;
            case "*":
                result = first_num * second_num;
                break;
            case "/":
                result = first_num / second_num;
                break;
            default:
                result = 0;
        }

        System.out.printf("Результат: %d %s %d = %d", first_num, sign, second_num, result);

    }
}
