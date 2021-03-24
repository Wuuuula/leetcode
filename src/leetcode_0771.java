import java.util.HashMap;
import java.util.Map;

public class leetcode_0771 {

    /**
     * 771. 宝石与石头
     *
     *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
     *  S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     *
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     */

    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        Map<Character,Integer> Map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            if (!Map.containsKey(stones.charAt(i))){
                Map.put(stones.charAt(i),1);
            }else{
                Map.put(stones.charAt(i),Map.get(stones.charAt(i))+1);
            }
        }
        for (int i = 0; i < jewels.length(); i++) {
            if (Map.containsKey(jewels.charAt(i))){
                num += Map.get(jewels.charAt(i));
            }
        }
        return num;
    }

}
