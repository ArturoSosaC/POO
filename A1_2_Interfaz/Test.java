import java.util.*;
import javax.swing.JOptionPane;

public class Test {
  public static void main (String[] args) {
    Car a = new Car(true);
    Car b = new Car(false);
    House h1 = new House(3);
    Hamburger hm1 = new Hamburger(true);
    JOptionPane.showMessageDialog(null, a.isMoreExpensive(b));
  }
}
