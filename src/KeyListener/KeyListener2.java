package KeyListener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListener2 extends JFrame implements KeyListener{
	JButton btn = new JButton("버튼입니다");

	public KeyListener2() {
	setLayout(null);
	btn.setLocation(50,30);
	btn.setSize(70, 30);
	add(btn);
	addKeyListener(this);
	
	setTitle("버튼을 활용한 키리스너 연습");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(600,150,500,400);
	setVisible(true);
	requestFocus();
	}
			
	public static void main(String[] args) {
		new KeyListener2();

	}


	public void keyPressed(KeyEvent e) {
	int KeyCode = e.getKeyCode();
	
	switch(KeyCode) {
		case KeyEvent.VK_UP:
			btn.setLocation(btn.getX(),btn.getY()-10);
			break;
		case KeyEvent.VK_DOWN:
			btn.setLocation(btn.getX(),btn.getY()+10);
			break;
		case KeyEvent.VK_RIGHT:
			btn.setLocation(btn.getX()+10,btn.getY());
			break;
		case KeyEvent.VK_LEFT:
			btn.setLocation(btn.getX()-10,btn.getY());
			break;
		case KeyEvent.VK_F1:
			btn.setBackground(Color.yellow);
			break;
		case KeyEvent.VK_F2:
			btn.setBackground(Color.black);
			break;
	}
		
	}
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
