package ru.stqa.pft.sandbox;

public class Eqation {
  private final double a;
  private final double b;
  private final double c;
  private int n;
  public Eqation(double a, double b, double c){

    this.a = a;
    this.b = b;
    this.c = c;

    double d = b*b -4*a*c;

    if (d > 0) {
      n = 2;
    } else {
      if (d == 0){
        n = 1;
      } else {
        n = 0;
      }
    }
  }

  public int rootNumber() {
    return n;
  }
}
