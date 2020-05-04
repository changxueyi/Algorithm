package Leetcode.数组;

/**
 * @ClassName _29_顺时针打印矩阵
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 21:13
 */
public class _29_顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        //存储结果
        int[] res = new int[matrix.length * matrix[0].length];
        int counter = 0;
        //定义上下左右边界
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;

        //遍历
        while (left <= right && up <= down) {
            //第一个，从左到右遍历
            for (int i = left; i <= right; i++) {
                res[counter++] = matrix[up][i];
            }
            //第二个，从上到下遍历
            for (int i = up + 1; i <= down; i++) {
                res[counter++] = matrix[i][right];
            }

            //第三个，从右向左遍历
            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    res[counter++] = matrix[down][i];
                }
            }
            //第四个：从下到上遍历
            if (left != right) {
                for (int i = down - 1; i > up; i--) {
                    res[counter++] = matrix[i][left];
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return res;
    }
}