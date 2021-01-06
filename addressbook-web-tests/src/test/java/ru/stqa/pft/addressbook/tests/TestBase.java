package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.addressbook.appmaneger.ApplicationMenager;

public class TestBase {

  protected static final ApplicationMenager applicationMenager = new ApplicationMenager(BrowserType.CHROME);

  @BeforeSuite
  public void setUp() throws Exception {
    applicationMenager.init();
  }

  @AfterSuite
  public void tearDown() throws Exception {
    applicationMenager.stop();

  }

}
