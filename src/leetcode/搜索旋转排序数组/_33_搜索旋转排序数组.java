package leetcode.搜索旋转排序数组;

/**
 * @ClassName _33_搜索旋转排序数组
 * @Description TODO https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/yi-wen-jie-jue-4-dao-sou-suo-xuan-zhuan-pai-xu-s-2/
 * @Author changxueyi
 * @Date 2020/5/9 21:42
 */
//共 4道题，33 81 153 154
public class _33_搜索旋转排序数组 {
    /**
     * 根据旋转数组的特性，当元素不重复时，如果 nums[i] <= nums[j]，说明区间 [i,j] 是「连续递增」的。
     * i、j 可以重合，所以这里使用的比较运算符是「小于等于」
     * 因此，在旋转排序数组中查找一个特定元素时：
     * 若 target == nums[MidOrder]，直接返回
     * 若 nums[left] <= nums[MidOrder]，说明左侧区间 [left,MidOrder]「连续递增」。此时：
     * 若 nums[left] <= target <= nums[MidOrder]，说明 target 位于左侧。令 right = MidOrder-1，在左侧区间查找
     * 否则，令 left = MidOrder+1，在右侧区间查找
     * 否则，说明右侧区间 [MidOrder,right]「连续递增」。此时：
     * 若 nums[MidOrder] <= target <= nums[right]，说明 target 位于右侧区间。令 left = MidOrder+1，在右侧区间查找
     * 否则，令 right = MidOrder-1，在左侧区间查找
     * 注意：区间收缩时不包含 MidOrder，也就是说，实际收缩后的区间是 [left,MidOrder) 或者 (MidOrder,right]
     * 作者：imageslr
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/yi-wen-jie-jue-4-dao-sou-suo-xuan-zhuan-pai-xu-s-2/
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (right >= left) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //[left,MidOrder] 连续递增
            if (nums[left] <= nums[mid]) {
                //说明 target 位于左侧。令 right = MidOrder-1，在左侧区间查找
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    //否则，令 left = MidOrder+1，在右侧区间查找
                    left = mid + 1;
                }
            } else {
                // [MidOrder,right] 连续递增
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1; // 在右侧 (MidOrder,right] 查找
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public int search1(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
 //       int MidOrder = 0;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //如果[left-MidOrder)递增的话,注意这个位置的等号+
            if (nums[left] <= nums[mid]) {
                //并且也在左边的话
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}