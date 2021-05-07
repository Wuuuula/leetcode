public class leetcode_剑指Offer64 {

    /**
     *  剑指 Offer 64. 求1+2+…+n
     *
     *  求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     *
     */
    public int sumNums(int n) {
        int result = (n * (n+1))/2;
        return result;
    }
}
