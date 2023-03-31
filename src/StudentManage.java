import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManage extends ScannerUtil {

  private List<Student> list;

  public StudentManage() {
    list = new ArrayList<>();
  }

  public void add() {
    int maSv;
    do {
      System.out.print("Nhâp mã sinh viên: ");
      maSv = Integer.parseInt(scanner.nextLine());
    } while (!checkingStudentId(maSv));
    System.out.print("Nhập họ tên: ");
    String name = scanner.nextLine();
    System.out.print("Nhập địa chỉ: ");
    String address = scanner.nextLine();
    String phoneNumber;
    do {
      System.out.print("Nhập số điện thoại: ");
      phoneNumber = scanner.nextLine();
    } while (!checkingPhoneNumber(phoneNumber));

    list.add(new Student(maSv, name, address, phoneNumber));
  }

  public void studentList() {
    System.out.print("Nhập số lượng sinh viên: ");
    int test = Integer.parseInt(scanner.nextLine());
    for (int i = 1; i <= test; i++) {
      add();
    }
  }

  public void arrangeByMaSv() {
    Collections.sort(list);
    for (Student s : list) {
      System.out.println(s);
    }
  }

  private boolean checkingStudentId(int maSv) {
    if (maSv <= 0) {
      return false;
    }
    return true;
  }

  private boolean checkingPhoneNumber(String phoneNumber) {
    if (phoneNumber.length() != 7) {
      return false;
    }
    return true;
  }
}
