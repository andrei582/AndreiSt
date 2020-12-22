package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getGroupHelper().initGroupCreation();
    applicationMenager.getGroupHelper().fillGroupForm(new GroupDate("test21", "test22", "test23"));
    applicationMenager.getGroupHelper().submitGroupGreation();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getNavigationHelper().gotoLogAut();
  }

}
