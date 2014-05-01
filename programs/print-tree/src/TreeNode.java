import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.initialization.qual.*;

public class TreeNode {
  int value = 0;
  @Nullable TreeNode left = null;
  @Nullable TreeNode right = null;

  static @Nullable TreeNode createTree(int levels) {
    if (levels == 0) {
      return null;
    } else {
      TreeNode n = new TreeNode();
      n.left = createTree(levels - 1);
      n.right = createTree(levels - 1);
      return n;
    }
  }

  void printTree() {
    System.out.println(value);
    if (left != null) left.printTree();
    if (right != null) right.printTree();
  }

  static void printTwoLeveledTree() {
    TreeNode twoLeveledTree = createTree(2);
    assert twoLeveledTree != null : "@AssumeAssertion(nullness)";
    twoLeveledTree.printTree();
  }
}

