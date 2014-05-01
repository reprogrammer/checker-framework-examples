import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.initialization.qual.*;

public class TreeNode {
  Object data;
  TreeNode left;
  TreeNode right;

  public TreeNode(Object data, TreeNode l, TreeNode r) {
    this.data = data;
    setChildren(l, r);
  }

  @EnsuresNonNull({"left", "right"})
  void setChildren(@UnderInitialization(TreeNode.class) TreeNode this, TreeNode l, TreeNode r) {
    left = l;
    right = r;
  }

}

