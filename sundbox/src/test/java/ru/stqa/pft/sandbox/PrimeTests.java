package ru.stqa.pft.sandbox;

import org.junit.Test;
import org.testng.Assert;

public class PrimeTests {

  @Test
  public  void  testPrimes() {
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }

  @Test
  public  void  testPrimesFast() {
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  }


 // @Test
          //  (enabled = false) это почему - то не работает( не отключает тест)
          // тест на длинных числах работает долго и мы его выключаем
 // public  void  testPrimesLong() {
 //   long n = Integer.MAX_VALUE;
 //   Assert.assertTrue(Primes.isPrime(n));
 // }

  @Test
  public  void  testNonPrimes() {
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }

}
