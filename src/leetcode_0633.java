import java.util.Scanner;

public class leetcode_0633 {
    /**
     *  633:平方数之和
     *
     *  给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a^2 + b^2 = c 。
     */
    public boolean judgeSquareSum(int c) {
        if (c < 0){
            return false;
        }
        for (int i = 0; i <= Math.sqrt(c); i++) {
            int j = (int) (c - Math.pow(i,2));
            if (Math.sqrt(j) % 1 == 0){
                return true;
            }
        }
        return false;
    }
}
