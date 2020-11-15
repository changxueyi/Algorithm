package 剑指offer.数组;

/**
 * @ClassName _01_二维元素的查找
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 16:34
 */
public class  _01_二维元素的查找 {
    public boolean search(int[][] arr, int target) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) return false;

        int cow = arr.length;//横着
        int row = arr[0].length;//竖着
        int c = 0;
        int r = row - 1;
        while (c <= cow - 1 && r >= 0) {
            if (arr[c][r] > target) {
                r--;
            } else if (arr[c][r] < target) {
                c++;
            } else {
                return true;
            }
        }
        return false;
    }

    //二维数组的查找
    public static boolean fun(int[][] arr, int target) {
        if (arr.length == 0 || arr == null || arr[0].length == 0) return false;
        //横着 row 列col
        int cos = arr.length;
        //竖着
        int row = arr[0].length;
        int c = 0;
        int r = row - 1;
        while (c <= cos - 1 && r >= 0) {
            if (arr[c][r] > target) {
                r--;
            } else if (arr[c][r] < target) {
                c++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean fun1(int[][] arr, int target) {
        if (arr == null||arr.length==0||arr[0].length==0) return false;
        int row = arr.length, col = arr[0].length;
        int r = 0, c = col - 1;
        while (r < row-1 && c >= 0) {
            if (arr[r][c] > target) {
                c--;
            }
            else if (arr[r][c]<target){
                r++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}};
        Boolean b = fun(arr, 12);
        System.out.println(b);

    }


}