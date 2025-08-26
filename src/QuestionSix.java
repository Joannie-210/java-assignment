public class QuestionSix {
    public static void main(String[] args) {
        int[] yields = {45, 60, 38, 55, 70, 42, 39, 48};

        int minValue = yields[0];
        int minIndex = 0;

        for (int i = 1; i < yields.length; i++) {
            if (yields[i] < minValue) {
                minValue = yields[i];
                minIndex = i;
            }
        }

        System.out.println("Lowest yield: " + minValue + " bags on day " + minIndex);
    }
}
