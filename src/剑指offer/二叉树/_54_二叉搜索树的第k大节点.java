package 剑指offer.二叉树;

import java.util.Stack;

/**
 * @ClassName _54_二叉搜索树的第k大节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 10:00
 */
public class _54_二叉搜索树的第k大节点 {
    public int kthLargest(TreeNode root, int k) {
        //反向的中序遍历,当遍历到第K个节点时候，就返回该节点值
        //count用于指示已经查找过的数字个数
        int count = 0;
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();

        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.right;
            } else {
                p = stack.pop();
                count++;
                if (count==k) return p.val;
                p = p.left;
            }
        }
        return -1;
    }
}