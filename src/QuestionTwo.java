public class QuestionTwo {
    public static void main(String[] args) {
        int[] deliveries = {1200, 1800, 1500, 2000, 1750, 1400, 1650};

        int total = 0;


        for (int liters : deliveries) {
            total += liters;
        }


        System.out.println("Total delivered: " + total + " liters");

        if (total > 10000) {
            System.out.println("ALERT: Capacity Exceeded!");
        }
    }
}
