package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase {

  @Test
  public void testGroupDelition() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getGroupHelper().selectGroup();
    applicationMenager.delitSelectedGroup();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getNavigationHelper().gotoLogAut();
  }


  public boolean isAlertPresent() {
    return applicationMenager.isAlertPresent();
  }

}
