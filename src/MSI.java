public class MSI {
  Laptop laptop;
  String color;

  MSI(Laptop laptop, String color) {
    this.laptop = laptop;
    this.color = color;
  }

  void print() {
    System.out.println("MSI " + laptop.name + " is " + color);
  }
}
