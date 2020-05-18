package 剑指offer.数组;

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
                //特别注意，这个位置是i>up  细节
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

    //08点05分 2020/5/5
    public int[] spiralOrder1(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        //定义边界
        //左上右下
        int left = 0, up = 0, right = matrix[0].length - 1, down = matrix.length - 1;
        int count = 0;
        int[] arr = new int[matrix.length * matrix[0].length];
        while (left <= right && down >= up) {
            for (int i = left; i <= right; i++) {
                arr[count++] = matrix[up][i];
            }
            for (int i = up + 1; i <= down; i++) {
                arr[count++] = matrix[i][right];
            }
            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    arr[count++] = matrix[down][i];
                }
            }
            if (left != right) {
                //特别注意，这个位置是i>up
                for (int i = down - 1; i > up; i--) {
                    arr[count++] = matrix[i][left];
                }
            }
            left++;
            right--;
            down--;
            up++;
        }
        return arr;
    }

    //11点13分 2020/5/16
    public int[] spiralOrder3(int[][] matrix) {
        //错误点1 ： 下面少写 -1
        int left = 0, top = 0, right = matrix[0].length-1, down = matrix.length-1;
        int[] arr = new int[right * down];
        //错误点2： 少写=判断
        //错误点4 要保持一整个连续的，所以要使用count
        int count = 0;
        while (right >= left && down >= top) {
            //错误点3：自己写成了 int i= 0；
            for (int i = left; i <= right; i++) {
                arr[count++] = matrix[top][i];
            }
            //错误点5： 自己写成了 int i=1,,,如果仅剩一个5，就不走下面这个，直接在上一层循环中打印过5就结束
            for (int i = top+1; i <= down; i++) {
                arr[count++] = matrix[i][right];
            }
            //错误点6 自己写成了if (down > top) {
            if (top != down) {
                for (int i = right - 1; i >= left; i--) {
                    arr[count++] = matrix[down][i];
                }
            }
            if (left != right) {
                //这个位置特殊处理下i > top，没有等于号
                for (int i = down - 1; i > top; i--) {
                    arr[count++] = matrix[i][left];
                }
               }
            left++;
            top++;
            right--;
            down--;
        }
        return arr;
    }
}