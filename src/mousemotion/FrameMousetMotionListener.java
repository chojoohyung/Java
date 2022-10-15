package mousemotion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class FrameMousetMotionListener implements MouseMotionListener{
	JLabel lbl;
 public FrameMousetMotionListener(JLabel lbl) {
	this.lbl = lbl;
}

@Override
public void mouseDragged(MouseEvent e) {
	lbl.setText("드래그가 됨"+e.getX()+","+e.getY());
	
}

@Override
public void mouseMoved(MouseEvent e) {
	lbl.setText("움직인다"+e.getX()+","+e.getY());
	
}

}
