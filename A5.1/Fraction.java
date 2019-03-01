import java.util.*;
import javax.swing.JOptionPane;
/* Author: Arturo Sosa Carrillo
Date: 29/01/19.
Descr: 4.1 */
public class Fraction{
  private int numerator, denominator;

  public static void main (String[] args) {
    Fraction f1 = new Fraction(30, 18);
    Fraction f2 = new Fraction(15, 2);
    Fraction f3 = f1.mult(f2);
    f3.print(null, null);
    f3.simplify();
    f3.print();
  }


  public void print(String inicio, String fin){
    if(denominator==1)
      JOptionPane.showMessageDialog(null, inicio+numerator+fin);
    else
      JOptionPane.showMessageDialog(null, inicio+numerator+"/"+denominator+fin);
  }

  public Fraction(){
    numerator = 1;
    denominator = 1;
  }
  public Fraction(int numerator, int denominator){
    this.numerator = numerator;
    if (denominator==0)
      JOptionPane.showMessageDialog(null, "Error");
    else
    this.denominator = denominator;
  }

  public int getNum(){
    return numerator;
  }
  public int getDen(){
    return denominator;
  }

  public Fraction mult(Fraction f2){
    int nRes = numerator*f2.getNum();
    int dRes = denominator*f2.getDen();
    Fraction result = new Fraction(nRes, dRes);
    return result;
  }

  public void simplify(){
    int con=2, max;
    if (denominator<=numerator)
      max=denominator;
      max=numerator;
    while(con<=max){
      if(numerator%con==0 && denominator%con==0){
        numerator /= con;
        denominator /= con;
      }
      else
        con++;
    }
  }

}
