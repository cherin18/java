import java.util.Arrays;
public class Array{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.fill(numbers, 0);
        System.out.println("Cleared array: " + Arrays.toString(numbers));
    }
}
