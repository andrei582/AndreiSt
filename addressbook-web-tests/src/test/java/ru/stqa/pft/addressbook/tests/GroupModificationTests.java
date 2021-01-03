package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    if (! applicationMenager.getGroupHelper().isThereAGroup() ){
      applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", "modific", "modification"));
      applicationMenager.getNavigationHelper().gotoGroupPage();
    }
    List<GroupDate> before = applicationMenager.getGroupHelper().getGroupList();
    applicationMenager.getGroupHelper().selectGroup(before.size() - 1);
    applicationMenager.getGroupHelper().initGroupModification();
    GroupDate group = new GroupDate(before.get(before.size() - 1).getId(),"test21", "test22", "test23");
    applicationMenager.getGroupHelper().fillGroupForm(group);
    applicationMenager.getGroupHelper().submitGroupModification();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    List<GroupDate> after = applicationMenager.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());

  before.remove(before.size() - 1);
  before.add(group);
    Comparator<? super GroupDate> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}
