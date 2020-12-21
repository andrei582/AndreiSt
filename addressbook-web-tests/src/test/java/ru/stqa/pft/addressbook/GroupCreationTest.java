package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupDate("test21", "test22", "test23"));
    submitGroupGreation();
    gotoGroupPage();
    gotoLogAut();
  }

}
