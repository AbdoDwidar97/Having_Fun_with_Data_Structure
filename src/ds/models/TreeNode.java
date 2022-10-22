package ds.models;

public class TreeNode
{
    double value;
    TreeNode left;
    TreeNode right;

    public TreeNode(){}

    public TreeNode(double val, TreeNode left, TreeNode right)
    {
        this.value = val;
        this.left = left;
        this.right = right;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
