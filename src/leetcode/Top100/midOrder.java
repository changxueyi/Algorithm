package leetcode.Top100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName midOrder
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/21 16:28
 */
public class midOrder {
    public List<Integer> mid(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    void dfs(TreeNode root, ArrayList<Integer> arr) {
        if (root==null) return;
        arr.add(root.val);
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
}