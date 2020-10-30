import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
public class GUI_DEMO {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Demo Frame");
      JPanel panel = new JPanel();
      frame.getContentPane();
      JButton button = new JButton("Demo Button");
      Dimension size = button.getPreferredSize();
      button.setBounds(300, 180, size.width, size.height);
      panel.setLayout(null);
      panel.add(button);
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setSize(500, 300);
      frame.setVisible(true);
   }
}

