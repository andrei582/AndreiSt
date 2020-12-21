package ru.stqa.pft.addressbook;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase {

  @Test
  public void testGroupDelition() throws Exception {
    gotoGroupPage();
    selectGroup();
    delitSelectedGroup();
    gotoGroupPage();
    gotoLogAut();
  }


  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
