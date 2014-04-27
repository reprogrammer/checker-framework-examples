import org.checkerframework.checker.nullness.qual.*;

class Main {
  @Nullable Object o1, o2;
  void m() {
    if (o1 == null || o2 == null) {
      return;
    } else {
      System.out.println(o1.toString() + o2.toString());
    }
  }
  public static final void main(String args[]) {
    new Main().m();
  }
}

