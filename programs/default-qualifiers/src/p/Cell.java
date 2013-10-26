package p;

import checkers.javari.quals.ReadOnly;

public class Cell {

  private @ReadOnly Data data1 = new Data();

  private Data data2 = new Data();

  public void update1() {
    data1.update();
  }

  public void update2() {
    data2.update();
  }


}

