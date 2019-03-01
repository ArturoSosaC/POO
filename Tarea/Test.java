import java.util.*;
import javax.swing.JOptionPane;

public class Test {
  public static void main (String[] args) {
    Cuadrado a = new Cuadrado(Double.parseDouble(JOptionPane.showInputDialog(null, "Elija el tamaño del\nlado del cuadrado")));
    JOptionPane.showMessageDialog(null, "Perimetro: "+a.getPerimeter()+"\nÁrea: "+a.getArea(), a.getText(), 1);
  }
}
