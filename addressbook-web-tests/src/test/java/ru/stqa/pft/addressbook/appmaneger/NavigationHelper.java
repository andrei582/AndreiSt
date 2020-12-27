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
    // проверяем, не находимся ли мы уже в группе.:
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new")) ){
      return;
    }
    clic(By.linkText("groups"));
  }

  public void gotoHome() {
    // проверяем, не наодимся ли мы в странице Home:
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    clic(By.linkText("home"));
  }

  public void gotoNewAddress() {
    clic(By.linkText("add new"));
  }
  public void gotoEditAddress() {
    clic(By.xpath("//img[@alt='Edit']"));
  }
  public void gotoAddressUpdate() {
    clic(By.xpath("(//input[@name='update'])[2]"));
  }
}
