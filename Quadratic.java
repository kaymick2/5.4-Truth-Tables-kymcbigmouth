class Quadratic{
  private double a;
  private double b;
  private double c;
  public Quadratic (double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c; 
  }
  public double root1(){
    double first = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 *a);
    return first;
  }
  public double root2(){
    double second = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 *a);
    return second;
  }
}