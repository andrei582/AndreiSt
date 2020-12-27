package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", null, null));
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getNavigationHelper().gotoLogAut();
  }

}
