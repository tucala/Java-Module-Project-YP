public class compare {
    public static void result() {
        if ((car1.speed*24) > (car2.speed*24) && (car1.speed*24) > (car3.speed*24)) {
            System.out.println("Самая быстрая машина: " + car1.auto);
        } else if ((car2.speed*24) > (car1.speed*24) && (car2.speed*24) > (car3.speed*24)) {
            System.out.println("Самая быстрая машина: " + car2.auto);
        } else if ((car3.speed*24) > (car1.speed*24) && (car3.speed*24) > (car2.speed*24)) {
            System.out.println("Самая быстрая машина: " + car3.auto);
        }
    }
}
