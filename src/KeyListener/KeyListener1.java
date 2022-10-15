package KeyListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListener1 extends JFrame implements KeyListener {
	JLabel lbl = new JLabel("키보드를 이용하여 키를 입력해보세요");
	
	public KeyListener1() {
	JPanel pan = new JPanel();
	addKeyListener(this);
	add("Center",pan);
	pan.add(lbl);


	
	setTitle("키리스너 연습");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(600,150,500,400);
	setVisible(true);

	}
	public static void main(String[] args) {
		new KeyListener1();

	}
	@Override
	public void keyTyped(KeyEvent e) {
		lbl.setText("문자키가 입력되었습니다: "+e.getKeyChar());
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		lbl.setText("키가 눌러졌습니다: "+e.getKeyText(e.getKeyCode()));
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		lbl.setText("키가 떼어졌습니다: "+e.getKeyText(e.getKeyCode()));
		
	}

}
