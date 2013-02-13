import checkers.nullness.quals.*;

class Node {
  int id;
  @Nullable Node next;

  Node(int id, @Nullable Node next) {
    this.id = id;
    this.next = next;
  }
}

class Enumerate {
  private @Nullable Node current;

  public Enumerate(Node node) {
    this.current = node;
  }

  @AssertNonNullIfTrue("current")
  public boolean hasMoreElements() {
    return (current != null);
  }

  @NonNullOnEntry("current")
  public @Nullable Node nextElement() {
    Node retval = current;
    current = current.next;
    return retval;
  }
}

class Main {
  public static final void main(String args[]) {
    Node n2 = new Node(2, null);
    Node n1 = new Node(1, n2);
    Enumerate e = new Enumerate(n1);
    while (e.hasMoreElements()) {
      System.out.println(e.nextElement().id);
    }
  }
}

