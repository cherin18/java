import java.util.Arrays;
public class Mularry {
   public Mularry() {
   }
   public static void main(String[] var0) {
      int[][] var1 = new int[][]{{2, 3, 4, 5, 6, 7}, {7, 8, 5, 3, 4, 9}, {1, 8, 6, 3, 9, 0}};
      System.out.println("2D Array:");
      System.out.println(Arrays.deepToString(var1));
      System.out.println("Element at row 0, column 1: " + var1[0][1]);
   }
}
