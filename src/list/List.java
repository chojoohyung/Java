package list;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class List extends JFrame {
	
	public List() {
		setLayout(new FlowLayout());			 // 공간이 부족할 시 아래쪽 배치
		JLabel lbl = new JLabel("과일 선택");
		String[] fruit = {"사과","복숭아","샤인머스캣","배"};
		JList<String> list = new JList<String>(fruit);
		
		add(lbl);
		add(list);
		
		
		setTitle("List");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600,150,300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new List();

	}

}
