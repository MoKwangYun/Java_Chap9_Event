import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MouseListenerEx extends JFrame{
	JLabel jl = new JLabel("Hello");
	MouseListenerEx(){
		setTitle("MouseListener ????");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				jl.setLocation(x,y);
			}
		});

		c.setLayout(null);
		
		jl.setLocation(30,30);
		jl.setSize(50,20);
		c.add(jl);
		
		
		
		
		
		setVisible(true);
		setSize(200,200);
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
