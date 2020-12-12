package ru.stqa.pft.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testArea() {
        double d = 0;
        Square s = new Square(5);
        Assert.assertEquals( s.area(), 25.0, d);
    }
}
