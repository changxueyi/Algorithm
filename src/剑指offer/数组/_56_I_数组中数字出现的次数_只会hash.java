package 剑指offer.数组;

import java.util.HashMap;

/**
 * @ClassName _56_I_数组中数字出现的次数_只会hash
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/7 9:07
 */
public class _56_I_数组中数字出现的次数_只会hash {
    //要求时间复杂度是O(n)，空间复杂度是O(1)。
    //*******************不符合要求的解法使用HashMap统计***************************
    public int[] singleNumbers(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        int[] arr = new int[2];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                arr[a] = nums[i];
                a++;
            }
        }
        return arr;
    }


    public int[] singleNumbers1(int[] nums) {
        int sum = 0;
        //将数组所有元素进行异或，最后的结果一定是那两个单一数字的异或结果。看上图示例
        //用示例[4,4,6,1]最后的抑或结果就是 6和1异或的结果 7
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
        }
        int first = 1;
        //通过与运算找到result第一个不为0的首位，7=>0111，也就是第一位
        while ((sum & first) == 0) {
            first = first << 1;
        }
        //例子 4 1 4 6
        //如何分，随便选择一个数字比如右边开始第一位的是一组，不是第一位的为另一组
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //将数组分类。
            if ((nums[i] & first) == 0) {
                result[0] ^= nums[i];
            } else {
                result[1] ^= nums[i];
            }
        }
        return result;
    }

    //13点30分 2020/5/16

}