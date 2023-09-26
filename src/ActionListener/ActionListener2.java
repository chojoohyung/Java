package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListener2 extends JFrame implements ActionListener {
	JButton btn1, btn2 ;
	JLabel lbl = new JLabel("버튼을 선택하세요");
	
	public ActionListener2() {
		JPanel pan = new JPanel();
		btn1 = new JButton("남자");
		btn2 = new JButton("여자");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add("North",pan);
		pan.add(btn1);
		pan.add(btn2);
		pan.add(lbl);

		setTitle("버튼을 활용한 키리스너 연습2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600,150,500,400);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) 
			lbl.setText("남자를 선택하였습니다");
		if(e.getSource() == btn2) 
			lbl.setText("여자를 선택하였습니다");
		
		
	}

	public static void main(String[] args) {
		new ActionListener2();
	}


}
