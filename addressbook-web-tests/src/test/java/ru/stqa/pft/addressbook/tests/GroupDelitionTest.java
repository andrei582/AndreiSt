package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.List;

public class GroupDelitionTest extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    if (! applicationMenager.getGroupHelper().isThereAGroup() ){
      applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", "modific", "modification"));
      applicationMenager.getNavigationHelper().gotoGroupPage();
    }
  }

  @Test
  public void testGroupDelition()  {
    List<GroupDate> before = applicationMenager.getGroupHelper().getGroupList();

    applicationMenager.getGroupHelper().selectGroup(before.size() - 1);
    applicationMenager.delitSelectedGroup();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    List<GroupDate> after = applicationMenager.getGroupHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size() - 1);
  //  applicationMenager.getNavigationHelper().gotoLogAut();
    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);
  }


 // public boolean isAlertPresent() {
 //   return applicationMenager.isAlertPresent();
//  }

}
