package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionListenerplus extends JFrame implements ActionListener{
	JButton btn;
	JLabel lbl = new JLabel("문자열이 연결되어요~");
	JPanel pan1,pan2;
	String s;
	JTextField tf1,tf2;
	
	public ActionListenerplus() {
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
		
		
		setTitle("버튼을 활용한 액션리스너로 더하기 하기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600,150,500,400);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new ActionListenerplus();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double d1, d2, d3;
		if(e.getSource() == btn) {
			d1 = Double.parseDouble(tf1.getText());
			d2 = Double.parseDouble(tf2.getText());
			d3 = d1 + d2;
			lbl.setText("덧셈결과는: "+d3);
		}
		
	}

}
