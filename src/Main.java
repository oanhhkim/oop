import Entity.Circle;
import Entity.Rectangle;
import Entity.Shape;
import Entity.Triangle;
import Util.ScannerUtil;

public class Main {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle();
    Shape triangle = new Triangle();
    Shape circle = new Circle();
    while (true) {
      System.out.println("-------Chọn hình-------");
      System.out.println("1. Hình chữ nhật");
      System.out.println("2. Hình tam giác");
      System.out.println("3. Hình tròn");
      int choice = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
      switch (choice) {
        case 1:
          rectangle.input();
          rectangle.calculatePerimeter();
          rectangle.calculateArea();
          break;
        case 2:
          triangle.input();
          triangle.calculatePerimeter();
          triangle.calculateArea();
          break;
        case 3:
          circle.input();
          circle.calculatePerimeter();
          circle.calculateArea();
          break;
        default:
          break;
      }
    }
  }
}