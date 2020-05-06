package 剑指offer.二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName PreOrder
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 15:37
 */
public class PreOrder {

    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right); // 右
        System.out.println(root.val); // 根
        dfs(root.left); // 左
    }
    //前序遍历
    public static List<Integer> preOrder1(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(arr, root);
        return arr;
    }

    static void dfs(ArrayList<Integer> arr, TreeNode root) {
        if (root==null) return;
        arr.add(root.val);
        System.out.print(root.val+" ");
        dfs(arr,root.left);
        dfs(arr,root.right);
    }

    public static List<Integer> preOrder2(TreeNode root) {
        if (root == null) return null;

        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                arr.add(cur.val);
                System.out.print(cur.val + " ");
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop().right;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[7];//以数组形式生成一棵完全二叉树
        for (int i = 0; i < 7; i++) {
            node[i] = new TreeNode(i);
        }
        for (int i = 0; i < 7; i++) {
            if (i * 2 + 1 < 7)
                node[i].left = node[i * 2 + 1];
            if (i * 2 + 2 < 7)
                node[i].right = node[i * 2 + 2];
        }
        preOrder1(node[0]);

    }
}