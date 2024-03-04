package lesson14;

public class Task01 {
    private static double[] balances = {-1000.50, 2000.75, -300.40, 5400.00, 12300.30};

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < balances.length; i++) {
            sum = balances[i] + sum;

        }
        double avegage = sum / balances.length;
        System.out.println(avegage);
        int counter = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 5000) {

                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < balances.length; i++) {
            if (balances[i] < 0) {
                balances[i] = 0;

            }
            System.out.println(balances[i]);
        }
        double sumNegative = 0;
            for (int i = 0; i < balances.length; i++) {

                if (balances[i] < 0) {
                    sumNegative = balances[i] + sumNegative;

                }


            }
        System.out.println(sumNegative);
        }
    }
