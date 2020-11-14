import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(
        "This program will calculate the roots of a quadratic equation.  Enter the coefficients of your quadratic.");
    System.out.print("a: ");
    double a = in.nextDouble();
    System.out.print("b: ");
    double b = in.nextDouble();
    System.out.print("c: ");
    double c = in.nextDouble();

    Quadratic quad = new Quadratic(a, b, c);

    if ((Math.pow(b, 2) - 4 * a * c) >= 0) {
      System.out.println("Your first root value is " + quad.root1());
      System.out.println("Your second root value is " + quad.root2());
    } else {
      System.out.println("Your value is screwy. Try again.");
    }
  }
}
