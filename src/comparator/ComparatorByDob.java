package comparator;

import entity.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class ComparatorByDob implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
//    Date dob1 = null;
    Date dob1;
    try {
      dob1 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getDob());
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    Date dob2;
    try {
      dob2 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getDob());
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    return dob1.compareTo(dob2);
  }
}
