package comparator;

import entity.Student;
import java.util.Comparator;

public class ComparatorByGrade implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return Integer.compare((int) o1.getGrade(), (int) o2.getGrade());
  }
}
