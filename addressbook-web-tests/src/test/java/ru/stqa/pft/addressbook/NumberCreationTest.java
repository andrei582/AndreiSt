package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NumberCreationTest {
  private WebDriver wb;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wb = new FirefoxDriver();
    wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    input("admin", "secret");

  }

  private void input(String username, String password) {
    wb.get("http://localhost/addressbook/");
    wb.findElement(By.name("user")).clear();
    wb.findElement(By.name("user")).sendKeys(username);
    wb.findElement(By.name("pass")).click();
    wb.findElement(By.name("pass")).clear();
    wb.findElement(By.name("pass")).sendKeys(password);
    submitNewAddress("//input[@value='Login']");
  }

  @Test
  public void testNumberCreation() throws Exception {
    gotoNewAddress();
    fillNewAdressForm(new NewAdressDate("ttname", "ttmiddle", "ttlast", "ttnicke", "tttitle", "ttcompany", "ttaddress at the test", "444555", "44445555", "445544", "44455554", "4545@444.44", "4445@445.45", "4", "April", "4444", "444 nnn hhh"));
    submitNewAddress("(//input[@name='submit'])[2]");
    gotoHome();
    gotoLogAut();
  }

  private void gotoLogAut() {
    wb.findElement(By.linkText("Logout")).click();
  }

  private void gotoHome() {
    wb.findElement(By.linkText("home")).click();
  }

  private void submitNewAddress(String s) {
    wb.findElement(By.xpath(s)).click();
  }

  private void fillNewAdressForm(NewAdressDate newAdressDate) {
    wb.findElement(By.name("firstname")).click();
    wb.findElement(By.name("firstname")).clear();
    wb.findElement(By.name("firstname")).sendKeys(newAdressDate.getName());
    wb.findElement(By.name("middlename")).click();
    wb.findElement(By.name("middlename")).clear();
    wb.findElement(By.name("middlename")).sendKeys(newAdressDate.getMiddle());
    wb.findElement(By.name("lastname")).click();
    wb.findElement(By.name("lastname")).clear();
    wb.findElement(By.name("lastname")).sendKeys(newAdressDate.getLastname());
    wb.findElement(By.name("nickname")).click();
    wb.findElement(By.name("nickname")).clear();
    wb.findElement(By.name("nickname")).sendKeys(newAdressDate.getNickename());
    wb.findElement(By.name("title")).click();
    wb.findElement(By.name("title")).clear();
    wb.findElement(By.name("title")).sendKeys(newAdressDate.getTitle());
    wb.findElement(By.name("company")).click();
    wb.findElement(By.name("company")).clear();
    wb.findElement(By.name("company")).sendKeys(newAdressDate.getCompany());
    wb.findElement(By.name("address")).click();
    wb.findElement(By.name("address")).clear();
    wb.findElement(By.name("address")).sendKeys(newAdressDate.getAddress());
    wb.findElement(By.name("theform")).click();
    wb.findElement(By.name("home")).click();
    wb.findElement(By.name("home")).clear();
    wb.findElement(By.name("home")).sendKeys(newAdressDate.getPhoneHome());
    wb.findElement(By.name("mobile")).click();
    wb.findElement(By.name("mobile")).clear();
    wb.findElement(By.name("mobile")).sendKeys(newAdressDate.getPhoneMobile());
    wb.findElement(By.name("work")).click();
    wb.findElement(By.name("work")).clear();
    wb.findElement(By.name("work")).sendKeys(newAdressDate.getPhoneWork());
    wb.findElement(By.name("fax")).click();
    wb.findElement(By.name("fax")).clear();
    wb.findElement(By.name("fax")).sendKeys(newAdressDate.getFax());
    wb.findElement(By.name("email")).click();
    wb.findElement(By.name("email")).clear();
    wb.findElement(By.name("email")).sendKeys(newAdressDate.geteAddress1());
    wb.findElement(By.name("email2")).click();
    wb.findElement(By.name("email2")).clear();
    wb.findElement(By.name("email2")).sendKeys(newAdressDate.geteAddress2());
    wb.findElement(By.name("bday")).click();
    new Select(wb.findElement(By.name("bday"))).selectByVisibleText(newAdressDate.getDayBirsday());
    wb.findElement(By.name("bday")).click();
    wb.findElement(By.name("bmonth")).click();
    new Select(wb.findElement(By.name("bmonth"))).selectByVisibleText(newAdressDate.getMouseBirsday());
    wb.findElement(By.name("bmonth")).click();
    wb.findElement(By.name("byear")).click();
    wb.findElement(By.name("byear")).clear();
    wb.findElement(By.name("byear")).sendKeys(newAdressDate.getYearBirsday());
    wb.findElement(By.name("notes")).click();
    wb.findElement(By.name("notes")).clear();
    wb.findElement(By.name("notes")).sendKeys(newAdressDate.getComents());
  }

  private void gotoNewAddress() {
    wb.findElement(By.linkText("add new")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wb.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wb.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wb.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
