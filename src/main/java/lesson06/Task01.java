package lesson06;

public class Task01 {
    public static void main(String[] args) {
        double sum = 1200;
        int experience = 7;
        if(sum >= 1000){
            sum = sum - (sum * 0.1);
        }
        if(experience >= 5){
            sum = sum - (sum * 0.05);
        }
        System.out.println(sum);
    }
}
