import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-9-26.
 */
public class TraverseTreeTest {
    @org.junit.Test
    public void inOderTraversr() throws Exception {
        BiTreeNode root = new BiTreeNode(1);
        root.left = new BiTreeNode(2);
        root.right = new BiTreeNode(3);
        root.left.left = new BiTreeNode(4);
        root.left.right = new BiTreeNode(5);
        root.right.left = new BiTreeNode(6);
        root.right.right = new BiTreeNode(7);
        TraverseTree traverseTree = new TraverseTree();
        traverseTree.inOderTraverse(root);
    }
}