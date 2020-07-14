import java.util.Arrays;

/**
 * Created by KPS on 7/14/2020.
 */
public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 3, 4, 6, 8};
        int searchNumber = 10;
        int index = Arrays.binarySearch(ints, searchNumber);
        if (index<0||index>ints.length) {
            System.out.println("the number is not in array");
        } else {
            System.out.println(Arrays.binarySearch(ints, searchNumber));
        }
    }
}
