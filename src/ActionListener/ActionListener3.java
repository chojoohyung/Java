package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionListener3 extends JFrame implements ActionListener{
	JButton btn;
	JLabel lbl = new JLabel("문자열이 연결되어요~");
	JPanel pan1,pan2;
	String s;
	JTextField tf1,tf2;
	
	public ActionListener3() {
		pan1 = new JPanel();
		pan2 = new JPanel();
		
		btn = new JButton("연결");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		btn.addActionListener(this);
		
		add("North",pan1);
		add("Center",pan2);
		add("South",lbl);
		
		pan1.add(btn);
		pan2.add(tf1);
		pan2.add(tf2);
		
		
		setTitle("버튼을 활용한 액션리스너 연습3");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600,150,500,400);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new ActionListener3();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			s = tf1.getText()+""+tf2.getText();
			lbl.setText(s);
		}
		
	}

}
