abstract class Superclass {
  abstract void m(Object o);
}

class Subclass extends Superclass {
  @Override
  void m(Object o) {
    System.out.println(o.toString());
  }
}

class Main {
  public static final void main(String args[]) {
    Superclass o = new Subclass();
    o.m("string");
  }
}

