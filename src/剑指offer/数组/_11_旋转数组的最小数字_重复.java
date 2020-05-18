package 剑指offer.数组;

/**
 * @ClassName _11_旋转数组的最小数字_重复
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 10:51
 */
public class _11_旋转数组的最小数字_重复 {
    //暴力解法--暴力美学
    public int minArray(int[] numbers) {
        int j = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[j] < numbers[i]) {
                return numbers[j];
            } else {
                j++;
            }
        }
        return numbers[0];
    }

    public int minArray1(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (numbers[i] <= numbers[j]) {
                return numbers[i];
            }
            else if (numbers[i] <= numbers[mid]) {
                i = mid+1;
            }else {
                j = mid;
            }
        }
        return -1;
    }

    public int minArray2(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }
}