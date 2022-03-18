public class Laptop {
  String name;
  String brand;

  /**
   * weight in kg
   */
  double weight;
  int year;

  Laptop() {
  }

  Laptop(String name) {
    this.name = name;
  }

  Laptop(String name, String brand) {
    this.name = name;
    this.brand = brand;
  }

  Laptop(String name, String brand, double weight) {
    this.name = name;
    this.brand = brand;
    this.weight = weight;
  }

  Laptop(String name, String brand, double weight, int year) {
    this.name = name;
    this.brand = brand;
    this.weight = weight;
    this.year = year;
  }

  @Override
  public String toString() {
    return name + " " + brand + " " + weight + " " + year;
  }
}
