package mousemotion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseMotion extends JFrame implements MouseMotionListener {
	JLabel lbl;
	
	public MouseMotion() {
		JPanel pan = new JPanel();
		lbl = new JLabel("마우스를 동작해보세요");
		addMouseMotionListener(this);
		add("Center",pan);
		pan.add(lbl);
		

		
		setTitle("마우스모션");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800,150,500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseMotion();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		lbl.setText("마우스가 드래그 됩니다 >>"+e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lbl.setText("마우스가 움직입니다 >>"+e.getX()+","+e.getY());
		
	}




	

}
