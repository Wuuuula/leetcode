import java.util.Scanner;

public class leetcode_0633_test {

    public static void main(String[] args) {
        leetcode_0633 test = new leetcode_0633();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数：");
            int num = sc.nextInt();
            boolean flag = test.judgeSquareSum(num);
            System.out.println(num + "是或否:" + flag);
        }
    }
}
