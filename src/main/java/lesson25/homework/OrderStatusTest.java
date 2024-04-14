package lesson25.homework;

public class OrderStatusTest {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PROCESSING;

        switch (status){
            case PENDING -> System.out.println(status.getDescription() + ", Can cancel? - " + status.canCancel());
            case PROCESSING -> System.out.println(status.getDescription() + ", Can cancel? - " + status.canCancel());
            case SHIPPED -> System.out.println(status.getDescription() + ", Can cancel? - " + status.canCancel());
            case DELIVERED -> System.out.println(status.getDescription() + ", Can cancel? - " + status.canCancel());
            case CANCELLED -> System.out.println(status.getDescription() + ", Can cancel? - " + status.canCancel());
        }

    }
}
