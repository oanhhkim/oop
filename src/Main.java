import entity.Shape;
import entity.Square;

public class Main {

  public static void main(String[] args) {
    Shape square = new Square();
    square.input();
    square.perimeter();
    square.area();
  }
}