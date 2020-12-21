package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NumberCreationTest extends TestBase {


  @Test
  public void testNumberCreation() throws Exception {
    gotoNewAddress();
    fillNewAdressForm(new NewAdressDate("ttname", "ttmiddle", "ttlast", "ttnicke", "tttitle", "ttcompany", "ttaddress at the test", "444555", "44445555", "445544", "44455554", "4545@444.44", "4445@445.45", "4", "April", "4444", "444 nnn hhh"));
    submitNewAddress("(//input[@name='submit'])[2]");
    gotoHome();
    gotoLogAut();
  }


}
