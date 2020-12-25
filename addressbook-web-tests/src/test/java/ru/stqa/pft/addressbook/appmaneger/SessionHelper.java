package ru.stqa.pft.addressbook.appmaneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver wd) {
    super(wd);
  }
  public void login(String username, String login) {
    type(By.name("user"),username);
    type(By.name("pass"),login);
    clic(By.xpath("//input[@value='Login']"));
  }
}
