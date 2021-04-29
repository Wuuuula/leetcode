public class leetcode_1828 {

    /**
     *  1828. 统计一个圆中点的数目
     *
     *  给你一个数组points，其中points[i] = [xi, yi]，表示第i个点在二维平面上的坐标。多个点可能会有相同的坐标。
     *
     * 同时给你一个数组queries，其中queries[j] = [xj, yj, rj]，表示一个圆心在(xj, yj)且半径为rj的圆。
     *
     * 对于每一个查询queries[j]，计算在第 j个圆内点的数目。如果一个点在圆的 边界上，我们同样认为它在圆内。
     *
     * 请你返回一个数组answer，其中answer[j]是第j个查询的答案。
     */
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        for (int i = 0; i< queries.length; i++) {
            int sum = 0;
            for (int[] point : points) {
                double distance = Math.sqrt(Math.pow(Math.abs(queries[i][0] - point[0]),2) +
                        Math.pow(Math.abs(queries[i][1] - point[1]),2));
                if (distance <= queries[i][2]){
                    sum ++;
                }
            }
            arr[i] = sum;
        }
        return arr;
    }

}
