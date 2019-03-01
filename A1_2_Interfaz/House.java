import java.util.*;
import javax.swing.JOptionPane;

public class House implements PriceRelatable{
  protected int cuartos;

  public Car(boolean modelo){
    this.cuartos = modelo;
  }

  public int getPrice(){
      return 10000*cuartos;
  }

}
