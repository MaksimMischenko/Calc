/**
 *
 * @author Maksim Mishchenko
 */
import java.util.Scanner;

class Calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение");
        String text = sc.nextLine().toUpperCase();

        try {
            if (Validate.isArOrRom(text)) {
                Function.metodRome(text);
            } else {
                Validate.count = 0;
                Function.metodArab(text);
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Вы ввели значение не правильно");
        }
    }
}
