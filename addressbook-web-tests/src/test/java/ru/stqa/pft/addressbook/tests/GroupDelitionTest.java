package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupDelitionTest extends TestBase {

  @Test
  public void testGroupDelition() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    int before = applicationMenager.getGroupHelper().getGroupCount();
    if (! applicationMenager.getGroupHelper().isThereAGroup() ){
      applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", null, null));
      applicationMenager.getNavigationHelper().gotoGroupPage();
    }
    if (before != 0) {
      applicationMenager.getGroupHelper().selectGroup(before - 1);
    } else applicationMenager.getGroupHelper().selectGroup(before);
    applicationMenager.delitSelectedGroup();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    if (before != 0) {
      int after = applicationMenager.getGroupHelper().getGroupCount();
      Assert.assertEquals(after, before - 1);
    }
    applicationMenager.getNavigationHelper().gotoLogAut();
  }


 // public boolean isAlertPresent() {
 //   return applicationMenager.isAlertPresent();
//  }

}
