package ru.stqa.pft.addressbook.appmaneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoLogAut() {
    clic(By.linkText("Logout"));
  }

  public void gotoGroupPage() {
    clic(By.linkText("groups"));
  }

  public void gotoHome() {
    clic(By.linkText("home"));
  }

  public void gotoNewAddress() {
    clic(By.linkText("add new"));
  }
}
