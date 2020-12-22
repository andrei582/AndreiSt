package ru.stqa.pft.addressbook.model;

public class NewAdressDate {
  private final String name;
  private final String middle;
  private final String lastname;
  private final String nickename;
  private final String title;
  private final String company;
  private final String address;
  private final String phoneHome;
  private final String phoneMobile;
  private final String phoneWork;
  private final String fax;
  private final String eAddress1;
  private final String eAddress2;
  private final String dayBirsday;
  private final String mouseBirsday;
  private final String yearBirsday;
  private final String coments;

  public NewAdressDate(String name, String middle, String lastname, String nickename, String title, String company, String address, String phoneHome, String phoneMobile, String phoneWork, String fax, String eAddress1, String eAddress2, String dayBirsday, String mouseBirsday, String yearBirsday, String coments) {
    this.name = name;
    this.middle = middle;
    this.lastname = lastname;
    this.nickename = nickename;
    this.title = title;
    this.company = company;
    this.address = address;
    this.phoneHome = phoneHome;
    this.phoneMobile = phoneMobile;
    this.phoneWork = phoneWork;
    this.fax = fax;
    this.eAddress1 = eAddress1;
    this.eAddress2 = eAddress2;
    this.dayBirsday = dayBirsday;
    this.mouseBirsday = mouseBirsday;
    this.yearBirsday = yearBirsday;
    this.coments = coments;
  }

  public String getName() {
    return name;
  }

  public String getMiddle() {
    return middle;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickename() {
    return nickename;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getPhoneHome() {
    return phoneHome;
  }

  public String getPhoneMobile() {
    return phoneMobile;
  }

  public String getPhoneWork() {
    return phoneWork;
  }

  public String getFax() {
    return fax;
  }

  public String geteAddress1() {
    return eAddress1;
  }

  public String geteAddress2() {
    return eAddress2;
  }

  public String getDayBirsday() {
    return dayBirsday;
  }

  public String getMouseBirsday() {
    return mouseBirsday;
  }

  public String getYearBirsday() {
    return yearBirsday;
  }

  public String getComents() {
    return coments;
  }
}
