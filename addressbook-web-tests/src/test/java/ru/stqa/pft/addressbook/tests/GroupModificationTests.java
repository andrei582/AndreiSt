package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

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
    applicationMenager.getGroupHelper().fillGroupForm(new GroupDate("test21", "test22", "test23"));
    applicationMenager.getGroupHelper().submitGroupModification();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    List<GroupDate> after = applicationMenager.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());


  }
}
