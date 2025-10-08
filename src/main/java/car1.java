import java.util.Scanner;

public class car1 {
    static String auto;
    static int speed;

    public static String auto() {
        System.out.println("Введите название машины №1:");
        Scanner scanner = new Scanner(System.in);
        auto = scanner.next();
        return auto;
    }

    public static int speed() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите скорость машины №1:");
            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();
                if (speed >= 0 && speed <= 250) return speed;
            } else {
                scanner.next();
            }
            System.out.println("Неправильная скорость");
        }
    }
}

