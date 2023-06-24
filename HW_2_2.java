package HW;

import java.io.IOException;

/*
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

import java.util.logging.*;

public class HW_2_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HW_2_2.class.getName());
        String logPath = "log.txt";
        try {
            FileHandler fh = new FileHandler(logPath, false);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int[] array = { 2, 4, 6, 8, 1, 2, 89, 0 };
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
                logger.log(Level.INFO, "element " + Integer.toString(i));
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        logger.log(Level.WARNING, "logger off");
    }

}
