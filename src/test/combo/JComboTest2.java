package test.combo;


import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboTest2 extends JFrame  implements ItemListener{
	JComboBox<String> comboFood, comboDrink;
	JLabel lblFood, lblDrink;

	public JComboTest2() {
		JPanel panA = new JPanel();
		JPanel panB = new JPanel(new GridLayout(1,2,20,20));
		
		JLabel lblF = new JLabel("식사");
		JLabel lblD = new JLabel("음료");
		ImageIcon iconA = new ImageIcon("img/m0.jpg");
		ImageIcon iconB = new ImageIcon("img/d0.jpg");
		lblFood = new JLabel(iconA);
		lblDrink = new JLabel(iconB);
	
		
		
		String[] itemF = {"삼겹살","초밥","국밥","파스타","회"};
		String[] itemD = {"콜라","사이다","맥주","소주","사케"};
		
		comboFood = new JComboBox<String>(itemF);
		comboDrink = new JComboBox<String>(itemD);
		
		comboFood.addItemListener(this);
		comboDrink.addItemListener(this);
		
		panA.add(lblF); panA.add(comboFood);
		panA.add(lblD); panA.add(comboDrink);
		panB.add(lblFood); panB.add(lblDrink);
		
		
		
		add("North",panA);
		add("Center",panB);
		
		
		
		
		setTitle("내가 혼자 해보기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 150, 500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JComboTest2();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int selectIndex = 0;
		ImageIcon icon = null;
		Object combo = e.getSource();
		if(combo == comboFood) {
			selectIndex = comboFood.getSelectedIndex();
			icon  =new ImageIcon("img/m"+selectIndex+".jpg");
			lblFood.setIcon(icon);
			
		}else{
			selectIndex = comboDrink.getSelectedIndex();
			icon = new ImageIcon("img/d"+selectIndex+".jpg");
			lblDrink.setIcon(icon);
			
		}
		
	}



};


