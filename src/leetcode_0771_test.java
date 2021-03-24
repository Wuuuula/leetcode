import org.junit.Test;

import java.util.Scanner;

public class leetcode_0771_test {

    @Test
    public void leetcode_0771_test(){
        String j = "aA";
        String s = "aaaaAAAsdsdf";
        leetcode_0771 leetcode_0771 = new leetcode_0771();
        int num = leetcode_0771.numJewelsInStones(j, s);
        System.out.println(num);
    }

}
