package textarea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextArea extends JFrame {
	
	public TextArea() {
		String[] str = {"North","Center","South"};
		JPanel[] pan = new JPanel[str.length];
		String[] lblstr = {"작성자:", "글제목:","내용:"};
		JLabel[] lbls = new JLabel[lblstr.length];
		
		for (int i = 0; i < pan.length; i++) {
			pan[i] = new JPanel();
			add(str[i],pan[i]);
			lbls[i] = new JLabel(lblstr[i]);
		}
		
		JTextField t1 = new JTextField(7);
		JTextField t2 = new JTextField(20);
		JTextArea area = new JTextArea(10,30);
		
		pan[0].add(lbls[0]); pan[0].add(t1);
		pan[1].add(lbls[1]); pan[1].add(t2);
		pan[2].add(lbls[2]); pan[2].add(area);
		
		
		
		setTitle("TextArea");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,350,500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextArea();

	}

}
