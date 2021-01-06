package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewAdressDate;

public class NumberModificationTest extends TestBase{


  @Test(enabled = false)
  public void testNumberModification() throws Exception {
    applicationMenager.getNavigationHelper().gotoHome();
    applicationMenager.getNavigationHelper().gotoEditAddress();
    applicationMenager.getAddressFormHelper().fillNewAdressForm(new NewAdressDate("ttname", "ttmiddle", "ttlast", null, "ttnicke", "tttitle", "ttcompany", "ttaddress at the test", "444555", "44445555", "445544", "44455554", "4545@444.44", "4445@445.45", "4", "April", "4444", "444 nnn hhh", false));
applicationMenager.getNavigationHelper().gotoAddressUpdate();
    applicationMenager.getNavigationHelper().gotoHome();
   // applicationMenager.getNavigationHelper().gotoLogAut();
  }

}
