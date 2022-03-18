
/**
 * ===============================================================================
 */
/**
 * @interface
 *            a template that can be applied to a class.
 *            similar to inheritance, but specifies what a class must implement.
 *            classes can apply more than one interface, inheritance is limited
 *            to one parent class.
 */
import package1.A;

public class App {
    public static void main(String[] args) throws Exception {
        A a = new A();

        System.out.println();
        a.sayHello();
        System.out.println(A.FINALLY);
        a.sleeping();
    }
}

// /**
// *
// ===============================================================================
// */
// /**
// * @encapsulation
// * attributes of a class will be hidden or private,
// * Can be accessed only through getter and setter methods
// * You should not use public or protected modifier for attributes
// */
// public class App {
// public static void main(String[] args) throws Exception {
// Encapsulation e = new Encapsulation();
// e.setName("Duyet");
// e.setAge(22);
// System.out.println();
// System.out.println(e.getAge());
// System.out.println(e.toString());
// }
// }

// /**
// *
// ===============================================================================
// */
// /**
// * @abstract
// * abstract classes can't be instantiated, but can have a subclass
// * abstract methods are declared without an implementation
// */
// public class App {
// public static void main(String[] args) throws Exception {
// // Vehicle vehicle = new Vehicle();
// Car car = new Car();

// System.out.println("\n");
// car.go();
// System.out.println(car.name);
// }
// }

// /**
// *
// ===============================================================================
// */
// /**
// * @inheritance
// * @super-keyword
// * - keyword refers to the super class (parent class) of an
// * object similar to the "this" keyword
// */
// public class App {
// public static void main(String[] args) throws Exception {
// Parent p = new Parent("parent");
// Children children = new Children("Duyet", 20, "Thao", 170);

// System.out.println("\ntoString():");
// System.out.println(children.toString());
// System.out.println(p.toString());

// System.out.println("\nPrint method:");
// children.print();
// }
// }

// /**
// *
// ===============================================================================
// */
// /**
// * static keyword is used to declare a class variable or method as static
// which
// * means it can be accessed without creating an object of the class in which
// it
// * is declared.
// */
// public class App {
// public static void main(String[] args) throws Exception {
// Static s = new Static();

// System.out.println('\n');
// Static.print();
// Static.printString("Hello");
// }
// }

// /**
// *
// ===============================================================================
// */
// // ? objects OOP - Constructors - Overload constructors - (toString) -
// // ? override methods - array of objects - object passing
// public class App {
// public static void main(String[] args) throws Exception {
// Laptop laptop1 = new Laptop("Macbook Pro", "Apple", 2.1, 2019);
// Laptop laptop2 = new Laptop("Macbook Pro", "Apple", 2.1);
// Laptop laptop3 = new Laptop("Macbook Pro", "Apple");
// Laptop laptop4 = new Laptop("Macbook Pro");
// Laptop laptop5 = new Laptop();

// System.out.println(laptop1.toString());
// System.out.println(laptop2.toString());
// System.out.println(laptop3.toString());
// System.out.println(laptop4.toString());
// System.out.println(laptop5.toString());

// // ? array of objects
// Laptop[] laptops = { (new Laptop("Macbook Pro", "Apple", 2.1, 2019)),
// (new Laptop("Macbook Pro", "Apple", 2.1)),
// (new Laptop("Macbook Pro", "Apple")),
// (new Laptop("Macbook Pro")),
// (new Laptop()) };

// System.out.println("==============================");

// for (Laptop laptop : laptops) {
// System.out.println(laptop.toString());
// }

// // ? object passing
// Laptop laptop6 = new Laptop("Bravo 15");
// MSI msi = new MSI(laptop6, "Black");

// msi.print();
// }
// }

// /**
// *
// ===============================================================================
// */
// // ? Overload methods
// /**
// * printf
// * <p>
// * %c - character
// * <p>
// * %s - string
// * <p>
// * %d - integer
// * <p>
// * %f - float
// * <p>
// * %b - boolean
// */
// public class App {
// static int add(int a, int b) {
// System.out.println("add(int, int)");
// return a + b;
// }

// static double add(double a, double b) {
// System.out.println("add(double, double)");
// return a + b;
// }

// static int add(int a, int b, int c) {
// System.out.println("add(int, int, int)");
// return a + b + c;
// }

// public static void main(String[] args) throws Exception {
// System.out.println(add(1, 2));
// System.out.println(add(1.0, 2.0));

// System.out.printf("%,+13.2f\n", add(100.0, 200000.0));

// Integer i = 100;

// }
// }

// /**
// *
// ===============================================================================
// */
// // ArrayList 2D - for each loop - method
// import java.util.ArrayList;

// import javax.swing.JOptionPane;

// public class App {
// public static void main(String[] args) throws Exception {
// ArrayList<ArrayList<String>> groceryStore = new
// ArrayList<ArrayList<String>>();

// ArrayList<String> bakeryList = new ArrayList<String>();
// bakeryList.add("Bread");
// bakeryList.add("Cake");
// bakeryList.add("Cookie");

// ArrayList<String> fruitList = new ArrayList<String>();
// fruitList.add("Apple");
// fruitList.add("Orange");
// fruitList.add("Banana");

// groceryStore.add(bakeryList);
// groceryStore.add(fruitList);

// JOptionPane.showMessageDialog(null, groceryStore);

// // for each loop method
// print2DArrayList(groceryStore);
// }

// // method to print out the grocery store
// static void print2DArrayList(ArrayList<ArrayList<String>> listOfList) {
// for (ArrayList<String> list : listOfList) {
// for (String item : list) {
// System.out.println(item);
// }
// }
// }
// }

// /**
// *
// ===============================================================================
// */
// // ArrayList
// import java.util.ArrayList;

// public class App {
// public static void main(String[] args) throws Exception {
// ArrayList<String> list = new ArrayList<String>();

// list.add("Hello");
// list.add("World");
// list.add("!");

// list.set(0, "Hi");
// list.remove(2);
// list.clear();

// for (int i = 0; i < list.size(); i++) {
// System.out.print(list.get(i) + ' ');
// }
// }
// }

// /**
// *
// ===============================================================================
// */
// // Wrapper class
// public class App {
// public static void main(String[] args) throws Exception {
// Boolean isDebug = false;
// Character c = 'a';
// Integer i = 1;
// Long l = 2L;
// Float f = 3.0F;
// Double d = 4.0;
// String s = "5";
// }
// }

// /**
// *
// ===============================================================================
// */
// // String methods
// public class App {
// public static void main(String[] args) throws Exception {
// String name = "Duyet";
// String name2 = "Duyet";

// name.equals("anObject");
// name.equalsIgnoreCase("anotherString");
// name.length();
// name.charAt(2);
// name.indexOf('e');
// name.isEmpty();
// name.toUpperCase();
// name.toLowerCase();
// name.trim();
// name.replace('e', 'a');

// System.out.println(name == name2);
// }
// }

// /**
// *
// ===============================================================================
// */
// // Random
// import java.util.Random;

// public class App {
// public static void main(String[] args) throws Exception {
// Random r = new Random();

// int x = r.nextInt(6) + 1;
// double y = r.nextDouble(3);

// System.out.println(x);
// System.out.println(y);
// }
// }

// /**
// ===============================================================================
// */
// // GUI - parse Int/Double to String
// import javax.swing.JOptionPane;

// public class App {
// public static void main(String[] args) throws Exception {
// String name = JOptionPane.showInputDialog("What is your name?");
// int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
// double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are
// you?"));

// JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
// JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
// JOptionPane.showMessageDialog(null, "You are " + height + " metes tall.");
// }
// }

// /**
// ===============================================================================
// */
// // ép kiểu, gán giá trị trong biểu thức
// public class App {
// public static void main(String[] args) throws Exception {
// int x = 10, y = 20, z;

// System.out.println((double) x / 3);
// System.out.println((double) x / (z = 3));
// System.out.println(z = 3);
// }
// }

// /**
// ===============================================================================
// */
// // Input - Scanner - Delete line break at the end of the line (\n)
// import java.util.Scanner;

// public class App {
// public static void main(String[] args) throws Exception {
// Scanner scanner = new Scanner(System.in);

// System.out.println("What is your name?");
// String name = scanner.nextLine();

// System.out.println("How old are you?");
// int age = scanner.nextInt();

// System.out.println("Where do you live?");
// scanner.nextLine();
// String location = scanner.nextLine();

// System.out.println("Hello, " + name + "!");
// System.out.println("You are " + age + " years old.");
// System.out.println("You live in " + location + ".");
// }
// }
