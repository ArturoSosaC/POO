
public class Cuadrado implements Figures{
  protected double lado;

  public Cuadrado(double lado){
    this.lado = lado;
  }

  public double getPerimeter(){
    return 4*lado;
  }

  public double getArea(){
    return lado*lado;
  }

  public String getText(){
    return "Cuadrado";
  }

}
