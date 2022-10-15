package mouselistener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListener1 extends JFrame implements MouseListener {
	JLabel lbl;
	
	
	public MouseListener1() {
		JPanel panN = new JPanel();
		lbl = new JLabel("마우스를 동작해보세요");
		add("North",panN);
		panN.add(lbl);
		addMouseListener(this);
		
		setTitle("마우스리스너 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600,150,500,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MouseListener1();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		lbl.setText("마우스가 클릭됐습니다");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lbl.setText("마우스가 눌러졌습니다");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		lbl.setText("마우스가 떨어졌습니다");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		lbl.setText("마우스가 들어왔습니다");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		lbl.setText("마우스가 나갔습니다");
		
	}

}
