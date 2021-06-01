import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MyPhoe extends JFrame{
	private JPanel lcdJPanel; // ������ ���â
	private JTextArea lcdJTextArea; // ���â�� ��ġ�� �ؽ�Ʈ ����
	private String lcdOutput = ""; // �ؽ�Ʈ ���ڿ� ��µ� ���ڿ��� �ӽ� ����
	private JPanel keyJPanel; // �Ʒ����� ��ưâ
	private JButton keyJButton[]; // ��ưâ�� ��ġ�� 15���� JButton �迭
	
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
							lcdOutput = lcdOutput.concat("\n"+"��ȭ�� �Ŵ� ��..."+"\n");
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