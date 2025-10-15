import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner (System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner (System.in).nextInt();
        int sumNumber = firstNumber + secondNumber;
        int difNumber = firstNumber - secondNumber;
        int prodNumber = firstNumber * secondNumber;
        double  quotNumber = (double)firstNumber/secondNumber;
        System.out.println("Сумма чисел: " + sumNumber);
        System.out.println("Разность чисел: " + difNumber);
        System.out.println("Произведение чисел: " + prodNumber);
        System.out.println("Частное чисел: " + quotNumber);
    }
}
