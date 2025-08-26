import java.util.*;

public class QuestionThree {
    public static void main(String[] args) {
        int[] defects = {2, 8, 1, 0, 6, 7, 3, 9, 5};

        List<Integer> result = new ArrayList<>();

        for (int count : defects) {
            if (count > 5) {
                result.add(count);
            }
        }

        System.out.println(result);
    }
}
