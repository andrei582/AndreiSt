package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    List<GroupDate> before = applicationMenager.getGroupHelper().getGroupList();
    GroupDate group = new GroupDate("test22", null, null);
    applicationMenager.getGroupHelper().createGroup(group);
    applicationMenager.getNavigationHelper().gotoGroupPage();
  //  applicationMenager.getNavigationHelper().gotoLogAut();
    List<GroupDate> after = applicationMenager.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);

    group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
     before.add(group);
    Comparator<? super GroupDate> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
  before.sort(byId);
  after.sort(byId);
    Assert.assertEquals(before, after);
  }

}
