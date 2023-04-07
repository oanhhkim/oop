package Entity;

import Util.ScannerUtil;

public class Rectangle extends Shape {

  private float width;
  private float height;

  public Rectangle() {
    this.width = width;
    this.height = height;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  @Override
  public void input() {
    do {
      System.out.print("Nhập chiều dài của hình chữ nhật: ");
      width = Float.parseFloat(ScannerUtil.SCANNER.nextLine());
      System.out.print("Nhập chiều rộng của hình chữ nhật: ");
      height = Float.parseFloat(ScannerUtil.SCANNER.nextLine());
    } while (!checkingInput(width, height));
  }

  @Override
  public void calculatePerimeter() {
    System.out.println("Chu vi: " + (width + height) * 2);
  }

  @Override
  public void calculateArea() {
    System.out.println("Diện tích: " + (width * height));
  }

  private boolean checkingInput(float width, float height) {
    if (width > 0 && height > 0) {
      if (width > height) {
        return true;
      }
    }
    return false;
  }
}
