package entity;

import Util.ScannerUtil;

public class Square extends Shape{
  private int edge;

  public Square() {
    this.edge = edge;
  }

  public int getEdge() {
    return edge;
  }

  public void setEdge(int edge) {
    this.edge = edge;
  }

  @Override
  public void input() {
    System.out.print("Nhập cạnh của hình vuông: ");
    edge = ScannerUtil.SCANNER.nextInt();
  }

  @Override
  public void perimeter() {
    System.out.println("Chu vi hình vuông là: "+ edge*4);
  }

  @Override
  public void area() {
    System.out.println("Diện tích hình vuông là: " + edge*edge);

  }
}
