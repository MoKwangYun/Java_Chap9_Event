import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Exercise02 extends JFrame{
	Exercise02(){
		setTitle("Exercise02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,3));
		for(int i = 0;i<12;i++) {
			JLabel la = new JLabel(Integer.toString(i));
			la.setBackground(Color.WHITE);
			la.setOpaque(true);
			c.add(la);
			
			la.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					int r = (int)(Math.random()*256);
					int g = (int)(Math.random()*256);
					int b = (int)(Math.random()*256);
					
					la.setBackground(new Color(r,g,b));
					
				}
			});
		}
		
		setVisible(true);
		setSize(200,200);
	}
	
	public static void main(String[] args) {
		new Exercise02();
	}

}
