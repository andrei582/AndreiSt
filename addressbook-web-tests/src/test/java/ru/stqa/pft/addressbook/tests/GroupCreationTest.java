package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() {
    int before = applicationMenager.getGroupHelper().getGroupCount();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", null, null));
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getNavigationHelper().gotoLogAut();
    int after = applicationMenager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, ++before);
  }

}
