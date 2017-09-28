import java.util.Stack;

/**
 * Created by dongfu on 17-9-26.
 */
public class TraverseTree {
    public void inOderTraverse(BiTreeNode root) {
        if (root != null) {
            Stack<BiTreeNode> stack = new Stack<>();
            stack.push(root);
            BiTreeNode p;
            while (!stack.empty()) {
                p = stack.peek();
                while (p != null) {
                    p = p.left;
                    stack.push(p);
                }
                stack.pop();
                if (!stack.empty()) {
                    // visit(p);
                    p = stack.pop();
                    System.out.println(p.value);
                    stack.push(p.right);
                }
            }
        }
    }
}
