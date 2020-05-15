package 剑指offer.二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName MidOrder
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/10 22:14
 */
public class MidOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            arr.add(node.val);
            cur = cur.right;

        }
        return arr;
    }
}