package mousemotion;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseMotionListener2 extends JFrame {
	JLabel lbl = new JLabel("이것은 내부클래스로 MouseListener 클래시 구현");
	public MouseMotionListener2() {
		JPanel pan = new JPanel();
		
		pan.add(lbl);
		add("North",pan);
		
		addMouseMotionListener (new FrameMousetMotionListener(lbl));
		
		setTitle("내부 클래스 마우스 리스너 클래시 구현");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800,350,200,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new MouseMotionListener2();
	}

}
