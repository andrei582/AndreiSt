package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase {

  @Test
  public void testGroupDelition() throws Exception {
    applicationMenager.gotoGroupPage();
    applicationMenager.selectGroup();
    applicationMenager.delitSelectedGroup();
    applicationMenager.gotoGroupPage();
    applicationMenager.gotoLogAut();
  }


  public boolean isAlertPresent() {
    return applicationMenager.isAlertPresent();
  }

}
