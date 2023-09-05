// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.


import java.util.Scanner;

public class Task1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println(insertFloat());
        } catch (NumberFormatException e) {
            System.out.println(insertFloat());
        }
    }

    public static float insertFloat() {

        System.out.print("Введите дробное число: ");
        return Float.parseFloat(scanner.nextLine());
    }
}
