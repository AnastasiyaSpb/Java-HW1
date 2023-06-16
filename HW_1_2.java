package HW;
/*
 * Вывести все простые числа от 1 до 1000
 */

import java.util.Scanner;

public class HW_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        sc.close();
        boolean flag = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(i + " ");
            else
                flag = true;

        }
    }

}
