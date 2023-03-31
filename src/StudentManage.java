import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManage extends ScannerUtil {

  private List<Student> list;

  public StudentManage() {
    list = new ArrayList<>();
  }

  public void add() {
    System.out.print("Nhâp mã sinh viên: ");
    int maSv = Integer.parseInt(scanner.nextLine());
    System.out.print("Nhập họ và tên: ");
    String name = scanner.nextLine();
    System.out.print("Nhập địa chỉ: ");
    String address = scanner.nextLine();
    System.out.print("Nhập số điện thoại: ");
    checkingPhoneNumber();
    String phoneNumber = scanner.nextLine();
    list.add(new Student(maSv, name, address, phoneNumber));
  }

  public void ds() {
    int t = Integer.parseInt(scanner.nextLine());
    for (int i = 1; i <= t; i++) {
      add();
    }
  }

  public void display() {
    System.out.println("Danh sách sinh viên: ");
    System.out.println(list);
  }


  public void arrangeByMaSv() {
    Collections.sort(list);
    for (Student s : list) {
      System.out.println(s);
    }
  }

//  private boolean checkStudentId() {
//
//  }

  private boolean checkingPhoneNumber() {
    String phoneNumber = "\\d{7}";
    String input = scanner.nextLine();
    if(!input.matches(phoneNumber)){
      return false;
    }
    return true;
  }
}
