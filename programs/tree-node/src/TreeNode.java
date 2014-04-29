import org.checkerframework.checker.nullness.qual.*;

public class TreeNode {
  Object data;
  TreeNode left;
  TreeNode right;

  public TreeNode(Object data, TreeNode l, TreeNode r) {
    this.data = data;
    setChildren(l, r);
  }

  void setChildren(TreeNode l, TreeNode r) {
    left = l;
    right = r;
  }

  public static final void main(String args[]) {
  }

}

