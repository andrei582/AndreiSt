package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    applicationMenager.gotoGroupPage();
    applicationMenager.initGroupCreation();
    applicationMenager.fillGroupForm(new GroupDate("test21", "test22", "test23"));
    applicationMenager.submitGroupGreation();
    applicationMenager.gotoGroupPage();
    applicationMenager.gotoLogAut();
  }

}
