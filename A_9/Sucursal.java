import java.util.*;
import javax.swing.JOptionPane;
/* Author: Arturo Sosa Carrillo
Date: 12/02/19.
Descr:  */
public class Sucursal extends Person{
  private Sucursal(){}
  private String nombre;
  public Sucursal(String nombre){
    this.nombre = nombre;
  }

  public void retiro(double cantidad, Cliente c){
    JOptionPane.showMessageDialog(null, "Sucursal "+nombre+": dando "+cantidad+" a "+c.getName());
  }
}
