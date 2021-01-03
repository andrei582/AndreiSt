package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.List;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    List<GroupDate> before = applicationMenager.getGroupHelper().getGroupList();
    applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", null, null));
    applicationMenager.getNavigationHelper().gotoGroupPage();
  //  applicationMenager.getNavigationHelper().gotoLogAut();
    List<GroupDate> after = applicationMenager.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

}
