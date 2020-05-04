package Leetcode.Test;


import java.util.LinkedList;
import java.util.List;


/**
 * @ClassName PostOrder
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 8:34
 */
public class PostOrder {
    public List<Integer> postOrder(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            list.addFirst(node.val);
            if (node.left!=null){
                stack.push(node.left);
            }
            if (node.right!=null){
                stack.push(node.right);
            }
        }
        return list;

    }
}