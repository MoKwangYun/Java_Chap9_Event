import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class KeyCharEx extends JFrame{
	KeyCharEx(){
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Temp");
		c.add(la);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				System.out.println("ehla");
				switch(e.getKeyChar()) {
					case '\n':
						la.setText("Enter");
						break;
					case 'b':
						c.setBackground(Color.BLACK);
						break;
					case 'r':
						c.setBackground(Color.RED);
						break;
					default:
						la.setText("Else");
				}
			}
		});
		
		setVisible(true);
		setSize(500,500);
		c.requestFocus(); //원래는 입력을 받지 않는 컨텐트 팬에 포커스를 주는 메소드
						  //무조건 setVisible(true) 이후에 작성

	}
	
	public static void main(String[] args) {
		new KeyCharEx();
	}
}
