package checkbox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBox extends JFrame {

	
	public CheckBox() {
		
		String[] str = {"수박","참외","메론","사과"}; //pan 안에 뜨는 항목들
		JCheckBox[] checks = new JCheckBox[str.length]; // 체크박스 위치[str]
		JPanel pan = new JPanel(); // 항목들이 들어갈 수 있는 창
		
		for (int i = 0; i < checks.length; i++) {
			checks[i] = new JCheckBox(str[i]);
			pan.add(checks[i]);
		}
		
		checks[0].setSelected(true);
		
		add("Center",pan);
		
		
		setTitle("checkbox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,350,400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBox();
		
	}
}
