import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ma sinh vien: ");
    student.setMaSv(scanner.nextInt());
//    student.setMaSv(Integer.parseInt(scanner.nextLine()));
    scanner.nextLine();
    System.out.print("Nhap ho va ten: ");
    student.setName(scanner.nextLine());
    System.out.print("Nhap dia chi: ");
    student.setAddress(scanner.nextLine());
    System.out.print("Nhap so dien thoai: ");
    student.setPhoneNumber(scanner.nextLine());
    System.out.println(student);

  }
}
