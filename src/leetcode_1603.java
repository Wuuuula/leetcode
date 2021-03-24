public class leetcode_1603 {

    /**
     * 1603. 设计停车系统
     * 请你给一个停车场设计一个停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。
     *
     * 请你实现 ParkingSystem 类：
     *
     * ParkingSystem(int big, int medium, int small) 初始化 ParkingSystem 类，三个参数分别对应每种停车位的数目。
     * bool addCar(int carType) 检查是否有 carType 对应的停车位。 carType 有三种类型：大，中，小，分别用数字 1， 2 和 3 表示。
     * 一辆车只能停在  carType 对应尺寸的停车位中。如果没有空车位，请返回 false ，否则将该车停入车位并返回 true 。
     */
    private int big;
    private int medium;
    private int small;

    public leetcode_1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        boolean flag = false;
        switch (carType){
            case 1:
                if (this.big != 0){
                    this.big -= 1;
                    flag = true;
                }
                break;
            case 2:
                if (this.medium != 0){
                    this.medium -= 1;
                    flag = true;
                }
                break;
            case 3:
                if (this.small != 0){
                    this.small -= 1;
                    flag = true;
                }
                break;
        }
        return flag;
    }
}
