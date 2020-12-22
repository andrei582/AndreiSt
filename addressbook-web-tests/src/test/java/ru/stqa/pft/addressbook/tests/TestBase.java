package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmaneger.ApplicationMenager;

public class TestBase {

  protected final ApplicationMenager applicationMenager = new ApplicationMenager();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    applicationMenager.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    applicationMenager.stop();

  }

}
