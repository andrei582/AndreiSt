package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.List;

public class GroupDelitionTest extends TestBase {

  @Test
  public void testGroupDelition() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    if (! applicationMenager.getGroupHelper().isThereAGroup() ){
      applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", null, null));
      applicationMenager.getNavigationHelper().gotoGroupPage();
    }
    List<GroupDate> before = applicationMenager.getGroupHelper().getGroupList();

    applicationMenager.getGroupHelper().selectGroup(before.size() - 1);
    applicationMenager.delitSelectedGroup();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    List<GroupDate> after = applicationMenager.getGroupHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size() - 1);
    applicationMenager.getNavigationHelper().gotoLogAut();
  }


 // public boolean isAlertPresent() {
 //   return applicationMenager.isAlertPresent();
//  }

}
