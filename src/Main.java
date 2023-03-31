import entity.Student;
import management.StudentManage;

public class Main {

  public static void main(String[] args) {
    StudentManage manage = new StudentManage();
    manage.studentList();
    manage.arrangeByMaSv();
  }
}
