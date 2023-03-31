package entity;

public class Student {

  private int maSv;
  private String name, address, phoneNumber;

  public Student() {
  }

  public Student(int maSV, String name, String address, String phoneNumber) {
    this.maSv = maSV;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public int getMaSv() {
    return maSv;
  }

  public void setMaSv(int maSv) {
    this.maSv = maSv;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return maSv + " " + name + " " + address + " " + phoneNumber + " ";
  }
}

