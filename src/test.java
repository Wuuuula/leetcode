import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(44);
        int num = list.indexOf(100);
        System.out.println(num);
    }

}

