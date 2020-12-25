package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.NewAdressDate;

public class NumberCreationTest extends TestBase {


  @Test
  public void testNumberCreation() throws Exception {
    applicationMenager.getNavigationHelper().gotoNewAddress();
   applicationMenager.getAddressFormHelper().fillNewAdressForm(new NewAdressDate("ttname", "ttmiddle", "ttlast", "ttnicke", "tttitle", "ttcompany", "ttaddress at the test", "444555", "44445555", "445544", "44455554", "4545@444.44", "4445@445.45", "4", "April", "4444", "444 nnn hhh"));
    applicationMenager.submitNewAddress("(//input[@name='submit'])[2]");
    applicationMenager.getNavigationHelper().gotoHome();
    applicationMenager.getNavigationHelper().gotoLogAut();
  }


}
