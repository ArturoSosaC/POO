import javax.swing.JOptionPane;
/* Author: Arturo Sosa Carrillo
Date: 29/01/19.
Descr: 4.1 */
public class Calculadora{
  public static void main (String[] args) {
    print("2 +2 = ", sum(2, 2));
    print("345 - 32 = ", resta(345, 32));
    print("45 x 15 = ", mult(45, 15));
    print("657.3 ÷ 30.8 = ", div(657.3, 30.8));
    print("√345.435 = ", sqrt(345.435));
    print("12^4 = ", pot(12, 4));
  }

  public static void print(String inicio, int a){
    JOptionPane.showMessageDialog(null, inicio+a);
  }

  public static void print(String inicio, double a){
    JOptionPane.showMessageDialog(null, inicio+a);
  }

  public static int sum(int a, int b){
    return a+b;
  }

  public static double sum(double a, double b){
    return a+b;
  }

  public static int resta(int a, int b){
    return a-b;
  }

  public static double resta(double a, double b){
    return a+b;
  }

  public static int mult(int a, int b){
    return a*b;
  }

  public static double mult(double a, double b){
    return a*b;
  }

  public static int div(int a, int b){
   return a/b;
 }

  public static double div(double a, double b){
    return a/b;
  }

  public static int sqrt(int a) {
    int b;
    int res = a/2;
    do {
      b = res;
      res = (b + (a/b))/2;
    } while ((b - res)!=0);
    return res;
  }

  public static double sqrt(double a) {
    double b;
    double res = a/2;
    do {
      b = res;
      res = (b + (a/b))/2;
    } while ((b - res)!=0);
    return res;
  }

  public static int pot(int a, int b){
    int r = a;
    for(int con=1; con<b; con++)
      r = r*a;
    return r;
  }

  public static double pot(double a, double b){
    double r = a;
    for(int con=1; con<b; con++)
      r = r*a;
    return r;
  }
}
