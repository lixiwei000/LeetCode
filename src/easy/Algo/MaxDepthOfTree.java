package easy.Algo;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * @author NikoBelic
 * @create 16/7/17 23:52
 */
public class MaxDepthOfTree
{
    public int maxDepth(TreeNode root)
    {
        if (root == null)
            return 0;

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        int count = 0;
        while (!stack.isEmpty())
        {
            int size = stack.size();
            while (size-- > 0) // 遍历这一层的节点是否还有子节点
            {
                TreeNode cur = stack.pop();
                if (cur.left != null)
                    stack.addLast(cur.left); // 注意:此处使用Push结果会出错,因为push将节点加入到左边,而addLast将节点加入到右边
                if (cur.right != null)
                    stack.addLast(cur.right);
            }
            count++; // 栈不为空,则当前层是有节点的 所以需要++
        }
        return count;
    }
    public int maxDepthDFS(TreeNode node)
    {
        if (node == null)
            return 0;
        return 1 + Math.max(maxDepthDFS(node.left),maxDepthDFS(node.right));
    }
}

 class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}