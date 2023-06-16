package HW;
/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class HW_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        int sum = 0;
        int mult = 1;
        do {
            sum = sum + i;
            mult = mult * i;
            i++;
        } while (i <= n);
        System.out.printf("Сумма чисел от 1 до %d равна %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d равно %d", n, mult);
    }
}
