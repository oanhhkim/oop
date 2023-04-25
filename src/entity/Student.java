package entity;

import java.util.Date;

public class Student {

  private int id;
  private String name;
  private float grade;
  private String dob;

  public Student() {
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

  @Override
  public String toString() {
    return "B19DCCN" + id + " " + name + " " + grade + " " + dob;
  }
}
