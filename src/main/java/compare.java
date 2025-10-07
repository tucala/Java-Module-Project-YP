public class compare {
    public static void result() {
        if (tachka1.speed1 > tachka2.speed2 && tachka1.speed1 > tachka3.speed3) {
            System.out.println("Самая быстрая машина: " + tachka1.auto1);
        } else if (tachka2.speed2 > tachka1.speed1 && tachka2.speed2 > tachka3.speed3) {
            System.out.println("Самая быстрая машина: " + tachka2.auto2);
        } else if (tachka3.speed3 > tachka1.speed1 && tachka3.speed3 > tachka2.speed2) {
            System.out.println("Самая быстрая машина: " + tachka3.auto3);
        }
    }
}
