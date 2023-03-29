import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {

  public static Scanner scanner = new Scanner(System.in);
  public List<Student> list;
  public StudentManage(){
    list = new ArrayList<>();
  }

  public void add() {
    Student student = new Student();
    System.out.print("Nhap ma sinh vien: ");
    int maSv = Integer.parseInt(scanner.nextLine());
    System.out.print("Nhap ho va ten: ");
    String name = scanner.nextLine();
    System.out.print("Nhap dia chi: ");
    String address = scanner.nextLine();
    System.out.print("Nhap so dien thoai: ");
    String phoneNumber = scanner.nextLine();
//    return new Student(maSv, name, address, phoneNumber);
    list.add(new Student(student.getMaSv(),student.getName(),student.getAddress(), student.getPhoneNumber()));
  }

  public void display(){
    System.out.println("Danh sách sinh viên: ");
    System.out.println(list);
  }

  public void arrangeByMaSv(){

  }
}
