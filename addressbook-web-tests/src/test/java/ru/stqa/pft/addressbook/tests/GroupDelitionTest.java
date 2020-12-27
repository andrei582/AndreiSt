package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupDelitionTest extends TestBase {

  @Test
  public void testGroupDelition() throws Exception {
    applicationMenager.getNavigationHelper().gotoGroupPage();
    if (! applicationMenager.getGroupHelper().isThereAGroup() ){
      applicationMenager.getGroupHelper().createGroup(new GroupDate("test21", null, null));
      applicationMenager.getNavigationHelper().gotoGroupPage();
    }
    applicationMenager.getGroupHelper().selectGroup();
    applicationMenager.delitSelectedGroup();
    applicationMenager.getNavigationHelper().gotoGroupPage();
    applicationMenager.getNavigationHelper().gotoLogAut();
  }


 // public boolean isAlertPresent() {
 //   return applicationMenager.isAlertPresent();
//  }

}
