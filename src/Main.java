public class Main {

    public static void main(String[] args) {


        boolean wakeup = true;

        wakeup = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(wakeup);

        wakeup = BarkingDog.shouldWakeUp(false ,2);
        System.out.println(wakeup);

        wakeup = BarkingDog.shouldWakeUp(true ,8);
        System.out.println(wakeup);

        wakeup = BarkingDog.shouldWakeUp(true ,-1);
        System.out.println(wakeup);

    }
}
