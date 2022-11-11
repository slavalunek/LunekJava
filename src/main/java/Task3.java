import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Числа кратные 3:");

        for (int element : array) {
            if (element % 3 == 0 && element != 0) {
                System.out.println(element);
            }
        }
        System.out.println();

        //Второй способ:
        checkNumber();
    }

    public static void checkNumber() {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Числа кратные 3:");

        for (int element : array) {
            if (element % 3 == 0 && element != 0) {
                System.out.println(element);
            }
        }
    }
}
