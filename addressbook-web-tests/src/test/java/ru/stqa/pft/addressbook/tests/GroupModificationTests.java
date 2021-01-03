package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

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
    Assert.assertEquals(new HashSet<>(before), new HashSet<>(after));
  }
}
