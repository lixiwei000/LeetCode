package easy;


import easy.model.TreeNode;
/**
 * @author NikoBelic
 * @create 16/7/26 23:14
 */
public class SameTree
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if (p == null && q != null)
            return false;
        if (p != null && q == null)
            return false;
        if (p != null && q != null)
        {
            if (p.val != q.val)
                return false;
        }
        if (p == null && q == null)
            return true;
        boolean leftOK = isSameTree(p.left,q.left);
        boolean rightOK = isSameTree(p.right,q.right);
        if (leftOK && rightOK)
            return true;
        return false;
    }
}
