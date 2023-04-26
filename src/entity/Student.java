package entity;

public class Student {

  private int id;
  private String name;
  private float grade;
  private String dob;
  private static int s_id = 100;

  public Student(String name, float grade, String dob) {
  }

  public Student(int id, String name, float grade, String dob) {
    this.id = id;
    this.name = name;
    this.grade = grade;
    this.dob = dob;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getGrade() {
    return grade;
  }

  public void setGrade(float grade) {
    this.grade = grade;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public static int getS_id() {
    return s_id;
  }

  public static void setS_id(int s_id) {
    Student.s_id = s_id;
  }

  @Override
  public String toString() {
    return "B19DCCN" + id + " " + name + " " + grade + " " + dob;
  }
}
