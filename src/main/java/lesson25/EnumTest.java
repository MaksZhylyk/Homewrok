package lesson25;

public class EnumTest {
    private static EnumTask enumTask = EnumTask.SUMMER;
    public static void main(String[] args) {
        wearForSeason(enumTask);
        }
    private static boolean wearForSeason(EnumTask enumTask) {
        switch (enumTask) {
            case AUTUMN:
                System.out.println(enumTask.name() + " Recommended wear are pants and sweater");
                break;
            case SPRING:
                System.out.println(enumTask.name() + " Recommended wear are pants and sweater");
                break;
            case SUMMER:
                System.out.println(enumTask.name() + " Recommended wear are shorts and t-shirts ");
                break;
            case WINTER:
                System.out.println(enumTask.name() + " Recommended wear are pants and jacket");
                break;
            default:
                System.out.println("Have written bad meaning");
                break;

        }
    return true;
    }

}
