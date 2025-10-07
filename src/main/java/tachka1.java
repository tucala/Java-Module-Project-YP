import java.util.Scanner;
public class tachka1 {
    static String auto1;
    static int speed1;
    public static String auto1() {
        System.out.println("Введите название машины №1:");
        Scanner scanner = new Scanner(System.in);
        auto1 = scanner.next();
        return auto1;
    }
    public static int speed1() {
        System.out.println("Введите скорость машины №1:");
        Scanner scanner = new Scanner(System.in);
        speed1 = scanner.nextInt();
        while (speed1 < 0 || speed1 > 250) {
            System.out.println("Неправильная скорость ");
            speed1 = scanner.nextInt();
        }
        return speed1;
    }
}
