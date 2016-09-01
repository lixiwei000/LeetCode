package easy.Algo;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Invert a binary tree.

      4
    /  \
   2     7
  / \   / \
 1   3 6   9
 to
      4
    /   \
   7     2
  / \   / \
 9   6 3   1
 * @author NikoBelic
 * @create 16/7/18 00:24
 */
public class ReverseBT
{
    public TreeNode invertTree(TreeNode root)
    {
        if (root == null)
            return null;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while(!stack.isEmpty())
        {
            TreeNode cur = stack.pop();
            // 交换位置
            if (cur != null)
            {
                TreeNode tmp = cur.left;
                cur.left = cur.right == null ? null : cur.right;
                cur.right = tmp == null ? null : tmp;
                // 将交换后的节点插入队列
                stack.addLast(cur.left);
                stack.addLast(cur.right);
            }
        }
        return root;
    }
}
