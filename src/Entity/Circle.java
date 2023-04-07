package Entity;

import Util.ScannerUtil;

public class Circle extends Shape {

  private float radius;
  private static final float PI = 3.14F;

  public Circle() {
    this.radius = radius;
  }

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  @Override
  public void input() {
    do {
      System.out.print("Nhập bán kính: ");
      radius = Float.parseFloat(ScannerUtil.SCANNER.nextLine());
    } while (!checkingInput(radius));

  }

  @Override
  public void calculatePerimeter() {
    System.out.println("Chu vi: " + (radius * 2 * PI));
  }

  @Override
  public void calculateArea() {
    System.out.println("Diện tích: " + (radius * radius * PI));
  }

  private boolean checkingInput(float radius) {
    if (radius < 0) {
      return false;
    }
    return true;
  }
}
