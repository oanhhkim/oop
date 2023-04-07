package Entity;

import Util.ScannerUtil;

public class Triangle extends Shape {

  private float edge1;
  private float edge2;
  private float edge3;

  public Triangle() {
    this.edge1 = edge1;
    this.edge2 = edge2;
    this.edge3 = edge3;
  }

  public float getEdge1() {
    return edge1;
  }

  public void setEdge1(float edge1) {
    this.edge1 = edge1;
  }

  public float getEdge2() {
    return edge2;
  }

  public void setEdge2(float edge2) {
    this.edge2 = edge2;
  }

  public float getEdge3() {
    return edge3;
  }

  public void setEdge3(float edge3) {
    this.edge3 = edge3;
  }

  @Override
  public void input() {
    do {
      System.out.println("Nhập lần lượt ba cạnh của một tam giác: ");
      edge1 = Float.parseFloat(ScannerUtil.SCANNER.nextLine());
      edge2 = Float.parseFloat(ScannerUtil.SCANNER.nextLine());
      edge3 = Float.parseFloat(ScannerUtil.SCANNER.nextLine());
    } while (!checkingInput(edge1, edge2, edge3));
  }

  @Override
  public void calculatePerimeter() {
    System.out.println("Chu vi: " + (edge1 + edge2 + edge3));
  }

  @Override
  public void calculateArea() {
    float p = (float) ((edge1 + edge2 + edge3) / 2);
    float s = (float) Math.sqrt(p * (p - edge1) * (p - edge2) * (p - edge3));
    System.out.println("Diện tích: " + s);
  }

  private boolean checkingInput(float edge1, float edge2, float edge3) {
    if (edge1 > 0 && edge2 > 0 && edge3 > 0) {
      if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
        return true;
      }
    }
    return false;
  }
}
