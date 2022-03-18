public class Static {
  static int currentYear = 2022;

  Static() {
    ++Static.currentYear;
  }

  public static void print() {
    System.out.println("The currentYear is " + currentYear);
  }

  static void printString(String str) {
    System.out.println(str);
  }
}
