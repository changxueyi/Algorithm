package leetcode.Top100;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName preOrder
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/21 16:16
 */
public class preOrder {
    //前序遍历，递归实现
    public List<Integer> pre(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    void dfs(TreeNode root, ArrayList<Integer> res) {
        if (root==null) return;
        res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
    }


}