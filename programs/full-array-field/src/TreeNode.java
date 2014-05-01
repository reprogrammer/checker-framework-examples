import org.checkerframework.checker.nullness.qual.*;

public class TreeNode {
  Object[] children;

  public TreeNode(int size) {
    children = new Object[size];
    for (int i = 0; i < size; ++i) {
      children[i] = null;
    }
    for (int i = 0; i < size; ++i) {
      children[i] = new Object();
    }
  }

  public static final void main(String args[]) {
    new TreeNode(10);
  }
}

