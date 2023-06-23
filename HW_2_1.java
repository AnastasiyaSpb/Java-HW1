package HW;

/*
Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
String input_str = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
 */
import java.util.Scanner;

public class HW_2_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите запрос: ");
        String a = read.nextLine();
        read.close();
        System.out.println(select(a));

    }

    public static String select(String a) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from students ");
        String b = a.replaceAll("[{}\\\"\s]", "");
        String[] output = b.split("[:,]");
        String stop = "null";
        int count = 0;
        for (int i = 0; i < output.length; i++) {
            if (stop.equals(output[i]))
                count++;
        }
        if (count == 4)
            return sb.toString();
        else {
            sb.append("WHERE ");
            int i = 0;
            while (i < output.length - 1) {
                if (stop.equals(output[i + 1]))
                    i = i + 2;
                else {
                    if (i % 2 == 0)
                        sb.append(output[i] + "=");
                    else
                        sb.append(output[i] + " AND ");
                    i++;
                }
            }
            if (stop.equals(output[output.length - 1]))
                sb.delete(sb.length() - 4, sb.length() - 1);
            else
                sb.append(output[output.length - 1]);
            return sb.toString();
        }
    }
}
