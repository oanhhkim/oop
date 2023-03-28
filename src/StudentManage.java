import java.util.Scanner;

public class StudentManage {

  public static Scanner scanner = new Scanner(System.in);

  public void add(Student student) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ma sinh vien: ");
    student.setMaSv(Integer.parseInt(scanner.nextLine()));
    System.out.print("Nhap ho va ten: ");
    student.setName(scanner.nextLine());
    System.out.print("Nhap dia chi: ");
    student.setAddress(scanner.nextLine());
    System.out.print("Nhap so dien thoai: ");
    student.setPhoneNumber(scanner.nextLine());
  }

  public void display(Student student) {
    add(student);
    System.out.println(student);


  }

}
