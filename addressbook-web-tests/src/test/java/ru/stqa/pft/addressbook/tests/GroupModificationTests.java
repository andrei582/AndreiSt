package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    int before = applicationMenager.getGroupHelper().getGroupCount();
    if (! applicationMenager.getGroupHelper().isThereAGroup() ){
      applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", "modific", "modification"));
      applicationMenager.getNavigationHelper().gotoGroupPage();
    }

    applicationMenager.getGroupHelper().selectGroup(before - 1);
    applicationMenager.getGroupHelper().initGroupModification();
    applicationMenager.getGroupHelper().fillGroupForm(new GroupDate("test21", "test22", "test23"));
    applicationMenager.getGroupHelper().submitGroupModification();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    int after = applicationMenager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before);


  }
}
