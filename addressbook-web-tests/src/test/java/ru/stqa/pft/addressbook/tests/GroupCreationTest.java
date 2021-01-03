package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    List<GroupDate> before = applicationMenager.getGroupHelper().getGroupList();
    GroupDate group = new GroupDate("test21", null, null);
    applicationMenager.getGroupHelper().createGroup(group);
    applicationMenager.getNavigationHelper().gotoGroupPage();
  //  applicationMenager.getNavigationHelper().gotoLogAut();
    List<GroupDate> after = applicationMenager.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);

    int max = 0;
    for (GroupDate g : after) {
      if (g.getId() > max) {
        max = g.getId();
      }
    }
    group.setId(max);
     before.add(group);

    Assert.assertEquals(new HashSet<>(before), new HashSet<>(after));
  }

}
