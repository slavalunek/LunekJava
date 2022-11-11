import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String someName = sc.next();

        if (someName.equals("Вячеслав")) {
            System.out.println("Привет,Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        //Второй способ:
        checkName();
    }

    public static void checkName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String someName = sc.next();

        if (someName.equals("Вячеслав")) {
            System.out.println("Привет,Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
