package ru.stqa.pft.addressbook.appmaneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
  protected WebDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  protected void clic(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    clic(locator);
    if (text != null) {
      String existngText = wd.findElement(locator).getAttribute("value");
      if (!text.equals(existngText)) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
      }
    }
    // public boolean isAlertPresent() {
    //  try {
    //    wd.switchTo().alert();
    //    } catch (NoAlertPresentException e) {
    //     return false;
    //  }
  }

}
