package comparator;

import entity.Student;
import java.util.Comparator;

public class ComparatorByGrade implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return Integer.compare((int) o2.getGrade(), (int) o1.getGrade());
  }
}
