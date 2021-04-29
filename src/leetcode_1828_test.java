import java.util.Arrays;

public class leetcode_1828_test {

    public static void main(String[] args) {
        leetcode_1828 test = new leetcode_1828();
        int[][] points = {{1,1},{2,2,},{3,3},{4,4},{5,5}};
        int[][] queries = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
        int[] arr = test.countPoints(points, queries);
        System.out.println(Arrays.toString(arr));
    }
}
