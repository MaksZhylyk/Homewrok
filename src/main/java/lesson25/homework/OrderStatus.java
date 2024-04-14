package lesson25.homework;

public enum OrderStatus {
    PENDING("Your order is pending approval", 0),
    PROCESSING("Your order in processing", 1),
    SHIPPED("Your order shipped", 2),
    DELIVERED("Your order delivered", 3),
    CANCELLED("Your order cancelled. Sorry((", 4);
    private String description;
    private final int level;

    OrderStatus(String description, int level) {
        this.description = description;
        this.level = level;
    }

    public String getDescription() {
        return description;
    }
    public boolean canCancel(){
        if(level <= 1){
            return true;
        } else{
            return false;
        }
    }
}
