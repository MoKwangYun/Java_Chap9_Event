package 연습;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class 예제4 extends JFrame{
JLabel la = new JLabel("Hello");
	
	예제4(){
		setTitle("Mouse 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		MyMouseListener ml = new MyMouseListener();
		la.addMouseListener(ml);
		la.addMouseMotionListener(ml);
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		
		setVisible(true);
		setSize(300, 300);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	
	public static void main(String[] args) {
		new 예제4();
	}

}
