import java.util.Scanner;
public class tachka3 {
    static String auto3;
    static int speed3;

    public static String auto3() {
        System.out.println("Введите название машины №3:");
        Scanner scanner = new Scanner(System.in);
        auto3 = scanner.next();
        return auto3;
    }
    public static int speed3() {
        System.out.println("Введите скорость машины №3:");
        Scanner scanner = new Scanner(System.in);
        speed3 = scanner.nextInt();
        while (speed3 < 0 || speed3 > 250) {
            System.out.println("Неправильная скорость ");
            speed3 = scanner.nextInt();
        }
        return speed3;
    }
}
