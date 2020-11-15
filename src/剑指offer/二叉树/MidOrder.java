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

    //15点07分 2020 /5/18
    public List<Integer> inorderTraversal1(TreeNode root) {
        //中序遍历二叉树
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(root.left);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            list.add(node.val);
            cur = cur.right;
        }
        return list;
    }
}