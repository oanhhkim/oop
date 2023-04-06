import entity.Student;
import java.sql.SQLOutput;
import management.StudentManage;
import util.ScannerUtil;

public class Main {

  public static void main(String[] args) {
    StudentManage manage = new StudentManage();
    while (true) {
      System.out.println("------MENU------");
      System.out.println("1. Nhập sinh viên");
      System.out.println("2. Danh sách sinh viên");
      System.out.println("3. EXIT");
      int n = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
      switch (n) {
        case 0:
          System.out.println("EXIT");
          System.exit(0);
        case 1:
          manage.studentList();
          manage.add();
          break;
        case 2:
          manage.arrangeByMaSv();
          break;
        default:
          break;
      }
    }
  }
}
