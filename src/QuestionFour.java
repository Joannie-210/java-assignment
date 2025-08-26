import java.util.*;

public class QuestionFour {
    public static void main(String[] args) {
        int[][] data = {
                {5, 0, 0, 4, 6, 5, 4},
                {3, 1, 0, 2, 0, 1, 2},
                {0, 0, 0, 0, 0, 0, 0}
        };

        List<int[]> flagged = new ArrayList<>();

        for (int[] medicine : data) {
            for (int i = 0; i < medicine.length - 1; i++) {
                if (medicine[i] == 0 && medicine[i + 1] == 0) {
                    flagged.add(medicine);
                    break; // stop checking this medicine once found
                }
            }
        }


        for (int[] arr : flagged) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
