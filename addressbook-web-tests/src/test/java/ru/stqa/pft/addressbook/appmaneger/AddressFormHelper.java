package ru.stqa.pft.addressbook.appmaneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.NewAdressDate;

public class AddressFormHelper extends HelperBase {

  public AddressFormHelper(WebDriver wd) {
    super(wd);
  }

  public void fillNewAdressForm(NewAdressDate newAdressDate) {
    type(By.name("firstname"), newAdressDate.getName());
    type(By.name("middlename"), newAdressDate.getMiddle());
    type(By.name("lastname"), newAdressDate.getLastname());
    type(By.name("nickname"), newAdressDate.getNickename());
    type(By.name("title"), newAdressDate.getTitle());
    type(By.name("company"), newAdressDate.getCompany());
    type(By.name("address"), newAdressDate.getAddress());
    type(By.name("home"), newAdressDate.getPhoneHome());
    type(By.name("mobile"), newAdressDate.getPhoneMobile());
    type(By.name("work"), newAdressDate.getPhoneWork());
    type(By.name("fax"), newAdressDate.getFax());
    type(By.name("email"), newAdressDate.geteAddress1());
    type(By.name("email2"), newAdressDate.geteAddress2());
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(newAdressDate.getDayBirsday());
    wd.findElement(By.name("bday")).click();
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(newAdressDate.getMouseBirsday());
    wd.findElement(By.name("bmonth")).click();
  type(By.name("byear"),newAdressDate.getYearBirsday());
   type(By.name("notes"),newAdressDate.getComents());
  }


}
