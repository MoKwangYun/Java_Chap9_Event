import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MyPhoe extends JFrame{
	private JPanel lcdJPanel; // 위쪽의 출력창
	private JTextArea lcdJTextArea; // 출력창에 위치할 텍스트 상자
	private String lcdOutput = ""; // 텍스트 상자에 출력될 문자열을 임시 저장
	private JPanel keyJPanel; // 아래쪽의 버튼창
	private JButton keyJButton[]; // 버튼창에 위치할 15개의 JButton 배열
	
	MyPhoe(){
		setTitle("MyPhoe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		lcdJPanel = new JPanel();
		c.add(lcdJPanel,BorderLayout.NORTH);
		lcdJPanel.setLayout( new GridLayout( 1, 1));
		
		lcdJTextArea = new JTextArea(lcdOutput, 5, 10);
		lcdJPanel.add(lcdJTextArea);
		
		keyJPanel = new JPanel();
		
		keyJPanel.setLayout(new GridLayout(5,3));
		
		keyJButton = new JButton[15];
		String key[] = {"Send", "clr", "End", "1", "2", "3", "4", "5", "6", "7", "8", "9", "=", "0", "#"};
		for(int i = 0; i<key.length;i++) {
			keyJButton[i] = new JButton(key[i]);
			keyJPanel.add(keyJButton[i]);
			keyJButton[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton btn = (JButton)e.getSource();
						String value = btn.getText();
						
						
						if(value.equals("Send")) {
							lcdOutput = lcdOutput.concat("\n"+"전화를 거는 중..."+"\n");
							lcdJTextArea.setText(lcdOutput);
						}
						else if(value.equals("clr")) {
							if(lcdOutput.length()== 0)
								lcdOutput = "";
							else
							{
								int length = lcdOutput.length();
								lcdOutput = lcdOutput.substring(0, length -1);
							}
							
							lcdJTextArea.setText(lcdOutput);
						}
						else if(value.equals("End")) {
							lcdOutput="";
							lcdJTextArea.setText(lcdOutput);
						}
						else {
							lcdOutput = lcdOutput.concat(value);
							lcdJTextArea.setText(lcdOutput);
						}
				}
			});
		}
		
		
		c.add(keyJPanel);
		
		setSize(300,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyPhoe();
	}
}
