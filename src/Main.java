//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main{
    public static void main(String[] args) {
        // Example input
        int[] discoveries = {300, 450, 120, 800, 540, 760, 310, 900, 500, 620};

        // Step 1: Assume the first number is the maximum
        int maxValue = discoveries[0];
        int maxIndex = 0;

        // Step 2: Loop through the dataset
        for (int i = 1; i < discoveries.length; i++) {
            if (discoveries[i] > maxValue) {
                maxValue = discoveries[i];  // update max value
                maxIndex = i;              // update its position
            }
        }

        // Step 3: Print the result
        System.out.println("Highest discovery: " + maxValue + " barrels at position " + maxIndex);
    }
}
