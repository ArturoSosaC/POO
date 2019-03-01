import java.util.*;
import javax.swing.JOptionPane;
/* Author: Arturo Sosa Carrillo
Date: 12/02/19.
Descr: #Sexo */
public class Husband extends Person {
  private Wife w;

  public static void main (String[] args) {
    Husband h = new Husband("Juanito");
    Wife w = new Wife("Juanita");
    h.getMarried(w);
    h.giveLove();
    w.giveLove();
    Husband yo = new Husband("Arturo");
    yo.chale();
  }

  private Husband(){}
  public Husband(String name){
    super(name);
  }

  public void getMarried(Wife w){
    if(w != this.w){
      this.w = w;
      w.getMarried(this);
    }
  }

  public void giveLove(){
    JOptionPane.showMessageDialog(null, "Soy "+getName()+" y amo a "+w.getName());
  }

  public void chale(){
    JOptionPane.showMessageDialog(null, "Soy "+getName()+" y nadie me quiere");
  }
}
