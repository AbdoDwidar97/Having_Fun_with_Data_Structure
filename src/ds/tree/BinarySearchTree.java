package ds.tree;
import ds.models.TreeNode;
import ds.queue.Queue;

public class BinarySearchTree
{
    private int height = 0;
    private TreeNode root;

    public BinarySearchTree(){}
    public BinarySearchTree(double[] array)
    {
        for (Double itr : array) insert(itr);
    }

    public int height()
    {
        return height;
    }

    private String str = "";
    @Override
    public String toString()
    {
        str = "";
        dfsPrint(root);
        return str;
    }

    private void dfsPrint(TreeNode root)
    {
        if (root == null)
        {
            str += " Null";
            return;
        }

        if (root.getLeft() == null && root.getRight() == null)
        {
            str = str + " " + root.getValue();
            return;
        }

        str = str + " " + root.getValue();

        dfsPrint(root.getLeft());
        dfsPrint(root.getRight());
    }

    public void insert(double val)
    {
        root = insertItem(val, root, 0);
    }

    private TreeNode insertItem(double val, TreeNode root, int level)
    {
        if (level == 0 && root == null)
            return new TreeNode(val, null, null);

        if (root == null && level > 0)
        {
            height = Math.max(level + 1, height);
            return new TreeNode(val, null, null);
        }

        if (val < root.getValue())
            root.setLeft(insertItem(val, root.getLeft(), level + 1));

        else root.setRight(insertItem(val, root.getRight(), level + 1));

        return root;
    }

    public boolean dfsSearch(double val)
    {
        return dfs(val, root);
    }

    private boolean dfs(double val, TreeNode root)
    {
        if (root == null) return false;
        if (root.getValue() == val) return true;
        if (root.getLeft() == null && root.getRight() == null) return false;
        return dfs(val, root.getLeft()) || dfs(val, root.getRight());
    }

    public boolean bfsSearch(double val)
    {
        if (root == null) return false;

        Queue<TreeNode> queue = new Queue<>();
        queue.enqueue(root);

        while (!queue.isEmpty())
        {
            TreeNode node = queue.dequeue();
            if (node.getValue() == val) return true;
            if (node.getLeft() != null) queue.enqueue(node.getLeft());
            if (node.getRight() != null) queue.enqueue(node.getRight());
        }

        return false;
    }
}
