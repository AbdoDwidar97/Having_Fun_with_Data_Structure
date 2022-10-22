package test;

import ds.tree.BinarySearchTree;
import org.junit.Test;
import static org.junit.Assert.*;

public class binary_tree_test
{
    BinarySearchTree binarySearchTree = new BinarySearchTree(new double[]{6, 7, 12, 3, 1, 2, 8, 10});

    @Test
    public void _testHeight()
    {
        assertEquals(5, binarySearchTree.height());
    }

    @Test
    public void _testPrintTree()
    {
        assertEquals(" 6.0 3.0 1.0 Null 2.0 Null 7.0 Null 12.0 8.0 Null 10.0 Null", binarySearchTree.toString());
    }

    @Test
    public void _testAdd()
    {
        binarySearchTree.insert(13);

        assertEquals(5, binarySearchTree.height());
    }

    @Test
    public void _testSearch()
    {
        assertTrue(binarySearchTree.dfsSearch(2));
        assertFalse(binarySearchTree.dfsSearch(20));
    }

}
