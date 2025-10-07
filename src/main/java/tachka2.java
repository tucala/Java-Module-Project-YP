import java.util.Scanner;
public class tachka2 {
    static String auto2;
    static int speed2;
    public static String auto2() {
        System.out.println("Введите название машины №2:");
        Scanner scanner = new Scanner(System.in);
        auto2 = scanner.next();
        return auto2;
    }
    public static int speed2() {
        System.out.println("Введите скорость машины №2:");
        Scanner scanner = new Scanner(System.in);
        speed2 = scanner.nextInt();
        while (speed2 < 0 || speed2 > 250) {
            System.out.println("Неправильная скорость ");
            speed2 = scanner.nextInt();
        }
        return speed2;
    }
}
