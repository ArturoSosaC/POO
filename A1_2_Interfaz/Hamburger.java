import java.util.*;
import javax.swing.JOptionPane;

public class Hamburger implements PriceRelatable{
  protected boolean grande;

  public Car(boolean modelo){
    this.grande = modelo;
  }

  public int getPrice(){
    if (grande)
      return 50;
    return 30;
  }

}
