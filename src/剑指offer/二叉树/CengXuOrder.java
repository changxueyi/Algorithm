package 剑指offer.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName CengXuOrder
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/11 9:24
 */
public class CengXuOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return arr;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> cur = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                cur.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            arr.add(cur);
        }
        return arr;
    }
}