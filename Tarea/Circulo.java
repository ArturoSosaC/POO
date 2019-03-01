
public class Circulo implements Figures{
  protected double r;

  public Circulo(double radio){
    this.r = radio;
  }

  public double getPerimeter(){
    return r*6.28318530718;
  }

  public double getArea(){
    return 3.14159265359*r*r;
  }

  public String getText(){
    return "Círculo";
  }

}
