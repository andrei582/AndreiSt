package ru.stqa.pft.addressbook.appmaneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupDate;


public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void submitGroupGreation() {
    clic(By.name("submit"));
  }

  public void fillGroupForm(GroupDate groupDate) {
    type(By.name("group_name"), groupDate.getName());
    type(By.name("group_header"), groupDate.getHeader());
    type(By.name("group_footer"), groupDate.getFooter());
  }

  public void initGroupCreation() {
    clic(By.name("new"));
  }

  public void selectGroup() {
    clic(By.name("selected[]"));
  }

  public void initGroupModification() {
    clic(By.name("edit"));
  }

  public void submitGroupModification() {
    clic(By.name("update"));
  }
}
