package 剑指offer.二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _32_i_从上到下打印二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 9:24
 */
public class _32_i_从上到下打印二叉树 {
    public int[] levelOrder(TreeNode root) {
        //标准的层序遍历
        List<Integer> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return new int[0];
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        int n = res.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}