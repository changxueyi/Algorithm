package 剑指offer.二叉树;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName PostOrder
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 16:09
 */
public class PostOrder {
    //特别注意，打印反着读

    public static List<Integer> houxu(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> arr = new LinkedList<>();
        if (root == null) return arr;
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            arr.offerFirst(node.val);
            //这个位置因为插入的是最后一个元素，所以出现了打印与结果想反
            System.out.print(node.val+" ");
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
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
        houxu(node[0]);
        System.out.println("***");
        houxu(node[0]);
      //  TreeNode root = createBinaryTree();
     //   System.out.println("\nPostOrder: ");
     //   houxu(root);
    }

    //官方答案
    public static List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            System.out.print(node.val+" ");
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }

    private static TreeNode createBinaryTree() {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);

        root.left = node1;
        root.right = node2;

        TreeNode node3 = new TreeNode(3);
        node1.left = node3;

        TreeNode node4 = new TreeNode(4);
        node3.left = node4;

        return root;
    }

}

