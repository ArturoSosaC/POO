import java.util.*;
import javax.swing.JOptionPane;

public class Car implements PriceRelatable{
  protected boolean advanced;

  public Car(boolean modelo){
    this.advanced = modelo;
  }

  public int getPrice(){
    if (advanced)
      return 100000;
    return 50000;
  }

}
