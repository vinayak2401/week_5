
class Shape {
  String colour;
  String filled;
}

class Rectangle extends Shape {
  float width = 0;
  float height = 0;
  float area = 0;

  void get_area() {

    area = width * height;
  }

  void display() {
    System.out.println("Colour:" + colour);
    System.out.println("Filled:" + filled);
    System.out.println("Width:" + width);
    System.out.println("Height:" + height);
    System.out.println("Area:" + area);
  }

}

class InheritanceShape {
  public static void main(String args[]) {
    Rectangle obj = new Rectangle();
    obj.colour = "Blue";
    obj.filled = "Yes";
    obj.width=6;
    obj.height=8;
    obj.get_area();
    obj.display();
  }
}