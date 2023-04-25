import management.StudentManage;
import util.ScannerUtil;

public class Main {

  public static void main(String[] args) {
    StudentManage manage = new StudentManage();
    while (true) {
      System.out.println("Choose one:");
      System.out.println("1. Nhập sinh viên");
      System.out.println("2. DSSV sắp xếp theo ngày sinh");
      System.out.println("3. DSSV sắp xếp theo điểm");
      System.out.println("4. DSSV sắp xếp theo tên");
      int choice = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
      switch (choice) {
        case 0:
          System.out.println("EXIT");
          System.exit(0);
        case 1:
          manage.studentList();
          break;
        case 2:
          manage.arrangeByDateOfBirth();
          break;
        case 3:
          manage.arrangeByGrade();
          break;
        case 4:
          manage.arrangeByName();
          break;
      }
    }
  }
}