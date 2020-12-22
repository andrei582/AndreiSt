package ru.stqa.pft.addressbook.appmaneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {

  private WebDriver wd;

  public NavigationHelper(WebDriver wd) {
    this.wd =wd;
  }

  public void gotoLogAut() {
    wd.findElement(By.linkText("Logout")).click();
  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  public void gotoHome() {
    wd.findElement(By.linkText("home")).click();
  }

  public void gotoNewAddress() {
    wd.findElement(By.linkText("add new")).click();
  }
}
