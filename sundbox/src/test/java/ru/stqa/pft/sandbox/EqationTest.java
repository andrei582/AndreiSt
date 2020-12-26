package ru.stqa.pft.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class EqationTest {

  @Test
  public void test0(){
    Eqation e = new Eqation(1,1,1);
    Assert.assertEquals(e.rootNumber(), 0);
  }

  @Test
  public void test1(){
    Eqation e = new Eqation(1,2,1);
    Assert.assertEquals(e.rootNumber(), 1);
  }

  @Test
  public void test2(){
    Eqation e = new Eqation(1,5,6);
    Assert.assertEquals(e.rootNumber(), 2);
  }


}
