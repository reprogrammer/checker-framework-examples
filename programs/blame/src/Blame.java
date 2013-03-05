import java.util.Random;

class Tree {

  void makeTree() {
    MathVector xqic = intcoord(new MathVector());
    new Node().loadTree(xqic);
  }

  MathVector intcoord(MathVector vp) {
    if (new Random().nextBoolean()) {
      return new MathVector();
    } else {
      return null;
    }
  }

}

class Node {

  int oldSubindex(MathVector ic) {
    return (int) ic.value(new Random().nextInt());
  }

  void loadTree(MathVector xpic) {
    oldSubindex(xpic);
  }

}

class MathVector {

  double value(int i) {
    return new Random().nextDouble();
  }

}

class BH {

  public static final void main(String[] args) {
    new Tree().makeTree();
  }

}

