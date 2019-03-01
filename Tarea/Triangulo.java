
public class Triangulo implements Figures{
  protected double a, b, c, h;

  public Triangulo(double a, b, c, h){
    this.a=a;
    this.b=b;
    this.c=c;
    this.h=h;
  }

  public double getPerimeter(){
    return a+b+c;
  }

  public double getArea(){
    return (b*h)/2;
  }

  public String getText(){
    return "Triángulo";
  }

}
