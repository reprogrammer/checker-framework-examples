import checkers.nullness.quals.*;

class Main {
  public static final void main(String args[]) {
    initArray(10);
  }

  // The nullness checker should raise a warning in this method.
  static @NonNull Object @NonNull [] initArray(int n) {
    Object[] array = new Object[n];
    return array;
  }
}

