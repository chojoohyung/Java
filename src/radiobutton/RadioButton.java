package radiobutton;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame {
	
	public RadioButton() {
	String[] str = {"수박","참외","메론","사과"};
	JRadioButton[] radios = new JRadioButton[str.length];
	JPanel pan = new JPanel();
	ButtonGroup gr = new ButtonGroup();
	
	for (int i = 0; i < radios.length; i++) {
		radios[i] = new JRadioButton(str[i]);
		gr.add(radios[i]);
		pan.add(radios[i]);
	}
	radios[0].setSelected(true);
	
	add("Center",pan);
		
	 setTitle("raidobutton");
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setBounds(200,350,400,200);
	 setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButton();
		

	}

}
