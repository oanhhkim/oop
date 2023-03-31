package comparator;

import entity.Student;
import java.util.Comparator;

public class CompareByStudentIdAsc implements Comparator<Student> {
  @Override
  public int compare(Student o1, Student o2) {
    return Integer.compare(o1.getMaSv(), o2.getMaSv());
  }
}
