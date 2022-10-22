package ds.tree;
import ds.models.TreeNode;

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

    public boolean dfsSearch(int val)
    {
        /// here we must implement DFS search in BST.
        return true;
    }

}
