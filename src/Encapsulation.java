public class Encapsulation {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() > 0) {
      this.name = name;
    }
    System.out.println("Name is not valid");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Encapsulation [name=" + name + ", age=" + age + "]";
  }
}
