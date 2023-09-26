package combo;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Combo extends JFrame implements ItemListener {
	JComboBox<String> comboMeal, comboDrink;
	JLabel lblMeal, lblDrink;
	
 public Combo() {
	 JPanel panN = new JPanel();
	 JPanel panC = new JPanel(new GridLayout(1,2,20,20));
	 
	 JLabel lblM = new JLabel("식사: ");
	 JLabel lblD = new JLabel("음료: ");
	 ImageIcon iconM = new ImageIcon("img/m0.jpg");
	 ImageIcon iconD = new ImageIcon("img/d0.jpg");
	 lblMeal = new JLabel(iconM);
	 lblDrink = new JLabel(iconD);
	 String[] itemM = {"삼겹살","초밥","국밥","파스타","회"};
	 String[] itemD = {"콜라","사이다","소주","맥주","사케"};
	 
	 comboMeal = new JComboBox<String>(itemM);
	 comboDrink = new JComboBox<String>(itemD);
	 
	comboMeal.addItemListener(this);
	comboDrink.addItemListener(this);
	 
	 panN.add(lblM); panN.add(comboMeal);
	 panN.add(lblD); panN.add(comboDrink);
	 panC.add(lblMeal); panC.add(lblDrink);
	 
	 
	 add("North",panN);
	 add("Center",panC);
	 
	
	
	 
	setTitle("ComboBox");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(600,150,500,400);
	setVisible(true);
}

	public static void main(String[] args) {
		new Combo();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int selectIndex = 0;
		ImageIcon icon = null;
		Object combo = e.getSource();
		if(combo == comboMeal) {
			selectIndex = comboMeal.getSelectedIndex();
			icon = new ImageIcon("img/m"+selectIndex+".jpg");
			lblMeal.setIcon(icon);
		}
		else {
				selectIndex = comboDrink.getSelectedIndex();
				icon = new ImageIcon("img/d"+selectIndex+".jpg");
				lblDrink.setIcon(icon);
			}
		}
		
	}
	
	


