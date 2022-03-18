public class Children extends Parent {
  String girlFriend;
  int height;

  Children() {
  }

  Children(String name) {
    super(name);
  }

  Children(String name, int age) {
    super(name, age);
  }

  Children(String name, int age, String girlFriend) {
    super(name, age);
    this.girlFriend = girlFriend;
  }

  Children(String name, int age, String girlFriend, int height) {
    super(name, age);
    this.girlFriend = girlFriend;
    this.height = height;
  }

  @Override
  void print() {
    super.print();
    System.out.println("girlFriend = " + girlFriend + "\n" + "height = " + height);
  }

  @Override
  public String toString() {
    return "Children [girlFriend=" + girlFriend + ", height=" + height + ", name=" + name + ", age=" + age + "]";
  }
}
