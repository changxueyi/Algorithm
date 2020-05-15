package leetcode.搜索旋转排序数组;

/**
 * @ClassName _81_搜索旋转排序数组II
 * @Description TODO https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/yi-wen-jie-jue-4-dao-sou-suo-xuan-zhuan-pai-xu-s-2/
 * @Author changxueyi
 * @Date 2020/5/9 23:06
 */
public class _81_搜索旋转排序数组II {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int left = 0;
        int right = nums.length - 1;
        //判断= ，因为会出现只有一个元素的情况
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return true;
            //遇到重复元素，就要去重，两周思路,
            //一种是直接遍历 [left,right] 每一项
            //另一种是 left++，跳过一个干扰项
            if (nums[left] == nums[right] && nums[right] == nums[mid]) {
                left++;
                right--;
            }
            //第一种情况,说明在nums[left] 到nums[MidOrder] 这段是递增的
            else if (nums[left] <= nums[mid]) {
                //后面target <= nums[MidOrder])，不要去加=，保持左闭  右开状态，不然就重复了
                //如果相等，即target = nums[MidOrder])就要跳回上面，返回true
                if (nums[left] <= target && target < nums[mid]) {
                    //说明在左边
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                //说明在mid---right这段是递增的
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }


}