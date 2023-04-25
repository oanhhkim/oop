package comparator;

import entity.Student;
import java.util.Comparator;

public class ComparatorByDob implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getDob().compareTo(o2.getDob());
  }
}
