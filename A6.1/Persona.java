import java.util.*;
import javax.swing.JOptionPane;
/* Author: Arturo Sosa Carrillo
Date: 01/02/19.
Descr: A6.1 */
public class Persona{
  private static String nombre, direccion, telefono;

  public static void print(){
    Persona p1 = new Persona("Arturo", "Ajusco", "55-1304-9190");
    JOptionPane.showMessageDialog(null, "Dombre: "+nombre+"\nDirección: "+direccion+"\nTeléfono: "+telefono);
  }

  public Persona(  String n, String d, String t){
    this.nombre = n;
    this.direccion = d;
    this.telefono = t;
  }
}
