// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.util.Scanner;

public class Task4 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите данные: ");
        String s = (scanner.nextLine());
        if (s.length() < 1) {
            throw new RuntimeException("Пустые строки вводить нельзя.");
        }
    }
}
