import java.util.*;
import javax.swing.JOptionPane;
/* Author: Arturo Sosa Carrillo
Date: 12/02/19.
Descr:  */
public class Cliente extends Person{
  public static void main (String[] args) {
    /*Sucursal sj = new Sucursal("San Juan");
    Sucursal sb = new Sucursal("San Benito");
    Cliente c = new Cliente("Pedro");*/
    Cliente c = new Cliente(JOptionPane.showInputDialog(null, "Favor de introducir su nombre"));
    double dinero = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca la cantidad que desea retirar"));
    Sucursal s = new Sucursal(JOptionPane.showInputDialog(null, "Introduzca el nombre de la Sucursal"));
    c.retirar(dinero, s);
    System.exit(0);
  }

  private Cliente(){}

  public Cliente(String nombre){
    super(nombre);
  }

  public void retirar(double cantidad, Sucursal s){
    s.retiro(cantidad, this);
  }
}
