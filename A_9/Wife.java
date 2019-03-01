import java.util.*;
import javax.swing.JOptionPane;
/* Author: Arturo Sosa Carrillo
Date: 12/02/19.
Descr: #Sexo */
public class Wife extends Person{
  private Husband h;

  private Wife(){}
  public Wife(String name){
    super(name);
  }

  public void getMarried(Husband h){
    if(h != this.h){
      this.h = h;
      h.getMarried(this);
    }
  }

  public void giveLove(){
    JOptionPane.showMessageDialog(null, "Soy "+getName()+" y amo a "+h.getName());
  }
}
