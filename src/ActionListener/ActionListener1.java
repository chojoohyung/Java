package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListener1 extends JFrame implements ActionListener{
	JButton btn ;
	JLabel lbl = new JLabel("버튼을 클릭해보세요");
	
	public ActionListener1() {
		

	btn = new JButton("버튼");
	JPanel pan = new JPanel();
	btn.setSize(70, 30);
	add("North",pan);
	pan.add(btn);
	pan.add(lbl);
	btn.addActionListener(this);
	
	
	setTitle("버튼을 활용한 액션리스너 연습");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(600,150,500,400);
	setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		lbl.setText("버튼이 클릭되었습니다");
		
	}
	
	public static void main(String[] args) {
		new ActionListener1();

	}



}
