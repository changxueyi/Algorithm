package 剑指offer.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _32_ii_从上到下打印二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 9:19
 */
public class _32_ii_从上到下打印二叉树 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList arr = new ArrayList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                arr.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(arr);
        }
        return res;
    }
}