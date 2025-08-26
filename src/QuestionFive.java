import java.util.*;

public class QuestionFive {
    public static void main(String[] args) {
        int[][] routes = {
                {80, 90, 120},
                {105, 110, 115},
                {70, 85, 95},
                {130, 140, 125}
        };

        List<Integer> result = new ArrayList<>();

        for (int[] route : routes) {
            int sum = 0;
            for (int passengers : route) {
                sum += passengers;
            }
            int avg = Math.round((float) sum / route.length);
            if (avg >= 100) {
                result.add(avg);
            }
        }

        System.out.println(result);
    }
}
