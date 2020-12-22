package ru.stqa.pft.addressbook.appmaneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupHelper {

  private    WebDriver wd;

  public GroupHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void submitGroupGreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupDate groupDate) {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupDate.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
  }

  public void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  public void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }
}