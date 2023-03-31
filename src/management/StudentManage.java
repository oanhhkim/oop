package management;

import comparator.CompareByStudentIdAsc;
import entity.Student;
import java.util.ArrayList;
import java.util.List;
import util.ScannerUtil;

public class StudentManage {

  private static final int LENGTH_OF_PHONE_NUMBER = 7;
  private static final int LIMIT_OF_STUDENT_ID = 0;
  private List<Student> list;

  public StudentManage() {
    list = new ArrayList<>();
  }

  public void add() {
    int maSv;
    do {
      System.out.print("Nhâp mã sinh viên: ");
      maSv = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
    } while (!checkingStudentId(maSv));
    System.out.print("Nhập họ tên: ");
    String name = ScannerUtil.SCANNER.nextLine();
    System.out.print("Nhập địa chỉ: ");
    String address = ScannerUtil.SCANNER.nextLine();
    String phoneNumber;
    do {
      System.out.print("Nhập số điện thoại: ");
      phoneNumber = ScannerUtil.SCANNER.nextLine();
    } while (!checkingPhoneNumber(phoneNumber));

    list.add(new Student(maSv, name, address, phoneNumber));
  }

  public void studentList() {
    System.out.print("Nhập số lượng sinh viên: ");
    int test = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
    for (int i = 0; i < test; i++) {
      add();
    }
  }

  public void arrangeByMaSv() {
    List<Student> sortList = list;
    sortList.sort(new CompareByStudentIdAsc());
    for (Student student : sortList) {
      System.out.println(student);
    }
  }

  private boolean checkingStudentId(int maSv) {
    if (maSv <= LIMIT_OF_STUDENT_ID) {
      return false;
    }
    return true;
  }

  private boolean checkingPhoneNumber(String phoneNumber) {
    if (phoneNumber.length() != LENGTH_OF_PHONE_NUMBER) {
      return false;
    }
    return true;
  }
}
