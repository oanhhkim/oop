public class Student {

  private int code;
  private String name;
  private String address;
  private String phoneNumber;

  public Student() {
  }

  public Student(int code, String name, String address, String phoneNumber) {
    this.code = code;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
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
    return code + ' ' +  name + ' ' + address + ' ' + phoneNumber + ' ';
  }


}

