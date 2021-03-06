package leetcode.回溯法;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName _46_全排列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/15 9:42
 */
public class _46_全排列 {
    /**
     * result = []
     * def backtrack(路径, 选择列表):
     * if 满足结束条件:
     * result.add(路径)
     * return
     * for 选择 in 选择列表:
     * 做选择
     * backtrack(路径, 选择列表)
     * 撤销选择
     */
    List<List<Integer>> res = new LinkedList<>();

    /* 主函数，输入一组不重复的数字，返回它们的全排列 */
    public  List<List<Integer>> permute(int[] nums) {
        // 记录「路径」
        LinkedList<Integer> track = new LinkedList<>();
        backTrace(nums, track);
        return res;
    }

    //路径：记录在 track 中
    //选择列表：nums中不存在于track的那些元素
    //结束条件:nums中的元素全都在 track中出现
     void backTrace(int[] nums, LinkedList<Integer> track) {
        //触发结束
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //排除不合法的选择
            if (track.contains(nums[i]))
                continue;
            //做选择
            track.add(nums[i]);
            //进入下一层决策树
            backTrace(nums, track);
            //取消选择
            track.removeLast();
        }
    }



}