package leetcode.搜索旋转排序数组;

/**
 * @ClassName _154_寻找旋转排序数组中的最小值II
 * @Description TODO https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/yi-wen-jie-jue-4-dao-sou-suo-xuan-zhuan-pai-xu-s-2/
 * @Author changxueyi
 * @Date 2020/5/10 9:54
 */
public class _154_寻找旋转排序数组中的最小值II {
    //这道题是 153 题的升级版，元素可以重复
    //当 nums[left] == nums[MidOrder] 时，退化为顺序查找。
    //1.一种是直接遍历 [left,right] 每一项
    //2.另一种是 left++，跳过一个干扰项
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] < nums[right] || left == right) {
                return nums[left];
            }
            int mid = left + (right - left) / 2;
            if (nums[left] < nums[mid]) {
                left = mid + 1;
            }else if (nums[left]==nums[mid]){
                left++;
            }else {
                right = mid;
            }
        }
        return -1;
    }
    //Krahets 答案
    public int findMin1(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else if (nums[mid] < nums[right]) right = mid;
            else right = right - 1;
        }
        return nums[left];
    }
}