package ru.stqa.pft.addressbook.appmaneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.ArrayList;
import java.util.List;


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

  public void selectGroup(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
   // clic(By.name("selected[]")); это старый вариант с переходом на первый элемент
  }

  public void initGroupModification() {
    clic(By.name("edit"));
  }

  public void submitGroupModification() {
    clic(By.name("update"));
  }

  public void createGroup(GroupDate group) {
    initGroupCreation();
    fillGroupForm(group);
    submitGroupGreation();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getGroupCount() {
    return  wd.findElements(By.name("selected[]")).size();
  }

  public List<GroupDate> getGroupList() {
    List<GroupDate> groups = new ArrayList<GroupDate>();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element : elements){
      String name = element.getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      GroupDate group = new GroupDate(id,name, null, null);
      groups.add(group);
    }
    return groups;
  }
}
