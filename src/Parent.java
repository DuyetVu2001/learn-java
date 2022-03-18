public class Parent {
  String name;
  int age;

  Parent() {
  }

  Parent(String name) {
    this.name = name;
  }

  Parent(String name, int age) {
    this.name = name;
    this.age = ++age;
  }

  void print() {
    System.out.println("name = " + name + "\n" + "age = " + age);
  }

  @Override
  public String toString() {
    return "Parent [name=" + name + ", age=" + age + "]";
  }
}
