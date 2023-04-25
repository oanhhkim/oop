package management;

import comparator.ComparatorByDob;
import comparator.ComparatorByGrade;
import comparator.ComparatorByName;
import entity.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.ScannerUtil;

public class StudentManage {

  private static final int LENGTH_OF_STUDENT_ID = 10;
  private static final float MIN_LIMIT_OF_GRADE = 0;
  private static final float MAX_LIMIT_OF_GRADE = 10;
  private List<Student> list;

  public StudentManage() {
    list = new ArrayList<>();
  }

  public void add() {
    int id;
    do {
      System.out.print("Nhập mã sinh viên: ");
      id = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
    } while (!checkingStudentId(id));
    System.out.print("Nhập tên sinh viên: ");
    String name = ScannerUtil.SCANNER.nextLine();
    float grade;
    do {
      System.out.print("Nhập điểm: ");
      grade = Float.parseFloat(ScannerUtil.SCANNER.nextLine());
    } while (!checkingGradeInput(grade));
    String dob;
    dob = ScannerUtil.SCANNER.nextLine();
    list.add(new Student(id, name, grade, dob));
  }

  public void studentList() {
    System.out.print("Nhập số lượng sinh viên: ");
    int test = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
    for (int i = 0; i < test; i++) {
      add();
    }
  }

  public void arrangeByDateOfBirth() {
    List<Student> sort = list;
    sort.sort(new ComparatorByDob());
    for (Student st : sort) {
      System.out.println(st);
    }
  }

  public void arrangeByGrade() {
    List<Student> sort = list;
    sort.sort(new ComparatorByGrade());
    for (Student st : sort) {
      System.out.println(st);
    }
  }

  public void arrangeByName() {
    List<Student> sort = list;
    sort.sort(new ComparatorByName());
    for (Student st : sort) {
      System.out.println(st);
    }
  }

  public void checkingDob(String dob) {
  }


  public boolean checkingGradeInput(float grade) {
    if (grade < MIN_LIMIT_OF_GRADE && grade > MAX_LIMIT_OF_GRADE) {
      return false;
    }
    return true;
  }

  public String checkingGrade(float grade) {
    if (grade >= 9) {
      return "Giỏi";
    } else if (grade >= 7 & grade < 9) {
      return "Khá";

    } else if (grade >= 5 && grade < 7) {
      return "Trung bình";

    } else {
      return "Yếu";
    }
  }

  public boolean checkingStudentId(int id) {
    if (id <= LENGTH_OF_STUDENT_ID) {
      return false;
    }
    return true;
  }
}
