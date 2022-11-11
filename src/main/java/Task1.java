import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int someNum = sc.nextInt();

        if (someNum > 7) {
            System.out.println("Привет");
        }

        //Второй способ:

        checkNumber(9);

    }

    public static void checkNumber(int someNum) {
        System.out.println("Введите число:" + someNum);

        if (someNum > 7) {
            System.out.println("Привет");
        }
    }
}
