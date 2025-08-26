import java.util.*;

public class QuestionSeven{
    public static void main(String[] args) {
        int[][] readings = {
                {120, 80}, {150, 95}, {138, 85}, {145, 92}, {160, 100}
        };

        List<int[]> result = new ArrayList<>();

        for (int[] reading : readings) {
            if (reading[0] > 140) {
                result.add(reading);
            }
        }

        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
