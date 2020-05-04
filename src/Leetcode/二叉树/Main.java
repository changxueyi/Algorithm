package Leetcode.二叉树;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 16:55
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = createBinaryTree();
        System.out.println("\nPostOrder: ");
        //   houxu(root);
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