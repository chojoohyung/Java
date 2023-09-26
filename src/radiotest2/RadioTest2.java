package radiotest2;

import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class RadioTest2 extends JFrame {
	
	public RadioTest2() {
		
		String[] cts = {"North","Center","South"};
		JPanel[] pan = new JPanel[cts.length];
		String[] lblstr = {"이름","주소","성별","취미"};
		JLabel[] lbl = new JLabel[lblstr.length];
		String[] checkstr = {"놀기","여행","영화","코딩"};
		JCheckBox[] check = new JCheckBox[checkstr.length];
		
		for (int i = 0; i < pan.length; i++) {
			pan[i]= new JPanel();
			add(cts[i],pan[i]);
		}
		
		for (int i = 0; i < check.length; i++) {
			lbl[i] = new JLabel(lblstr[i]);
			check[i] = new JCheckBox(checkstr[i]);
		}
		
		ButtonGroup gr = new ButtonGroup();
		JTextField t1  = new JTextField(10);
		JTextField t2 = new JTextField(20);
		JRadioButton rb1 = new JRadioButton("남자",true);
		JRadioButton rb2 = new JRadioButton("여성");
		
		gr.add(rb1);
		gr.add(rb2);
		
		pan[0].add(lbl[0]);
		pan[0].add(t1);
		
		pan[0].add(lbl[1]);
		pan[0].add(t2);
		
		pan[1].add(lbl[2]);
		pan[1].add(rb1);
		pan[1].add(rb2);
		
		pan[2].add(lbl[3]);
		
		for (int i = 0; i < check.length; i++) {
			pan[2].add(check[i]);
		}
		
		
		
		
		
		
		setTitle("개인정보 입력");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,350,500,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioTest2();
		

	}

}
