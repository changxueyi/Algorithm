package leetcode.二叉树;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName _114_二叉树展开为链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/18 15:42
 */
public class _114_二叉树展开为链表 {
    //展开后的链表是1->2->3->4->5->6，这个顺序就是二叉树前序遍历的顺序，我们用前序遍历的方式遍历这棵树，将结果保存到一个数组中，再把这个数组中的每个元素前后串联起来就可以了。
    public void flatten(TreeNode root) {
        if (root == null) return;
        LinkedList<TreeNode> list = new LinkedList<>();
        dfs(root, list);
        TreeNode head = list.removeFirst();
        head.left = null;
        while (list.size() > 0) {
            TreeNode cur = list.removeFirst();
            cur.left = null;
            head.right = cur;
            head = cur;
        }
    }

    void dfs(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        list.add(root);
        dfs(root.left, list);
        dfs(root.right, list);
    }
}