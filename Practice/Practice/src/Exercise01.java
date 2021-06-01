import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Exercise01 extends JFrame{
	Exercise01(){
		setTitle("Exercise01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		
		c.add(jb1);
		c.add(jb2);
		
		jb1.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You Pressed: " + e.getActionCommand());
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You Pressed: " + e.getActionCommand());
			}
		});
		
		setVisible(true);
		setSize(300,300);

	}
	
	public static void main(String[] args) {
		new Exercise01();
	}
}