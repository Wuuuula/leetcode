import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leetcode_1833 {
    /**
     *  1833. 雪糕的最大数量
     *
     *  夏日炎炎，小男孩 Tony 想买一些雪糕消消暑。
     *
     * 商店中新到 n 支雪糕，用长度为 n 的数组 costs 表示雪糕的定价，其中 costs[i] 表示第 i 支雪糕的现金价格。
     * Tony 一共有 coins 现金可以用于消费，他想要买尽可能多的雪糕。
     *
     * 给你价格数组 costs 和现金量 coins ，请你计算并返回 Tony 用 coins 现金能够买到的雪糕的 最大数量 。
     *
     * 注意：Tony 可以按任意顺序购买雪糕。
     */
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        // 余额
        int balance = coins;
        // 雪糕个数
        int sum = 0;
        for (int i = 0; i <costs.length; i++) {
            if (costs[i] <= balance){
                balance -= costs[i];
                sum++;
            }else{
                break;
            }
        }
        return sum;
    }
}
