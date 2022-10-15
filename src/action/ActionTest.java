package action;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.BoldAction;


public class ActionTest extends JFrame {
protected static final int ITALIC = 0;
JLabel lbl;
JButton btn1, btn2;


public ActionTest() {
	lbl = new JLabel("버튼을 클릭해보세요");
	btn1 = new JButton("변경");
	JPanel pan = new JPanel();
	pan.add(btn1);
	add("North",pan);
	add("Center",lbl);
	
	btn1.addActionListener(btnListener);
	setTitle("ActionEvent 사용");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(1000,200,500,300);
	setVisible(true);
	
	
}

ActionListener btnListener = new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object eButton = e.getSource();
		if(eButton == btn1) {
			lbl.setText("버튼이 클릭되었습니다");
			Font font = new Font("맑은고딕",Font.BOLD,ITALIC);
		}
		
		
	}
};

	public static void main(String[] args) {
		new ActionTest();
		

	}

}
