import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui_App {
public Gui_App() {
	JFrame jfrm = new JFrame("Elgamal digital signature verifier");
	
	jfrm.setLayout(new CardLayout());
	
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	jfrm.setSize(500,500);
	
	// Title label section start
	
	JLabel jlb = new JLabel("CSE-1007 CRYPTOWARE");
	
	jfrm.add(jlb);
	
	// Title label section ending
	JTextField jtf = new JTextField("Please Enter your text here");
	
	jtf.setText(jtf.getBounds().x+" "+jtf.getBounds().y);
	jfrm.add(jtf);
	
	jfrm.setVisible(true);
}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Gui_App();
			}
		});

	}

}
