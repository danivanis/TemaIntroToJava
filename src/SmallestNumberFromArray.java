import java.util.Arrays;

public class SmallestNumberFromArray {
    public static void main(String[] args) {
        int array[] = {99, 66, 3, 20, 35, 12, 22, 75};
        Arrays.sort(array);
        System.out.println("The smallest number in the array is " + array[0]);
    }
}
