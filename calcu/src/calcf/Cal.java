package calcf;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Cal extends JFrame implements ActionListener{
	String other[] = {"←","AC","±","÷","%","7","8","9","X","4","5","6",
			"-","1","2","3","+",".","0","="};
	
	JLabel zero;
	boolean state = true;
	int num1;
	int num2;
	int result;
	String yeon ="";
	String ininput="";
	

	
	public Cal(){
		
		zero = new JLabel("0",JLabel.RIGHT);
		JPanel main = new JPanel();

		JPanel btnview = new JPanel();
		
		int rows = 5, cols = 4;
		
		btnview.setLayout(new GridLayout(rows,cols));
		
		JButton button[] = new JButton[other.length];
		
		zero.setFont(new Font("맑은 고딕", Font.BOLD, 35)); 
	    zero.setBackground(Color.WHITE);
	    zero.setOpaque(true); 
		
		for(int i = 0; i<other.length; i++) {
			button[i] = new JButton(other[i]);
			button[i].setFont(new Font("맑은 고딕", Font.BOLD, 25)); 
			button[i].addActionListener(this);
		
			if (i == 0 || i == 1 )
	            button[i].setForeground(Color.RED);
	        if (i == 2 || i == 3 || i == 4 || i == 8 || i == 12 || i == 16)
	            button[i].setForeground(Color.BLUE);
		
		btnview.add(button[i]);
		}
		
		main.setLayout(new BorderLayout());
		add(zero,BorderLayout.CENTER);
		add(btnview, BorderLayout.SOUTH);
			
		setTitle("Java로 만든 계산기");
		setBounds(200,300,500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
	 String input = e.getActionCommand();
	 
	 if(input.equals("+")) {
		 num1 = num2;
		 yeon = "+";
		 ininput = "";
		 
	 } else if (input.equals("-")) {
		 num1 = num2;
		 yeon = "-";
		 ininput = "";
	 }else if (input.equals("÷")) {
		 num1 = num2;
		 yeon = "÷";
		 ininput = "";
	 }
	 else if (input.equals("X")) {
		 num1 = num2;
		 yeon = "X";
		 ininput = "";
	 }
	 else if (input.equals("±")) {
		 num1 = num2;
		 yeon = "±";
		 ininput = "";
		 zero.setText("-");
	 }
	 else if (input.equals("%")) {
		 num1 = num2;
		 yeon = "%";
		 ininput = "";
		 result = num1 / 100;
		 zero.setText(String.valueOf(result));
	 }
	 else if (input.equals("±")) {
	        num1 = num2;
	        yeon = "±";
	        ininput = "";
	        result = num1;
	        zero.setText(String.valueOf(result));
	        state = true;

	    }
	 else if (input.equals("AC")) {
		 ininput = "";
		 num1 = 0;
		 num2 = 0;
		 zero.setText("0");
	 }
	 else if (input.equals("←")) {
		 setBackSpace(getBackSpace().substring(0,getBackSpace().length()-1));
		 if(getBackSpace().length() < 1) {
			 ininput = "";
			 num2 = 0;
			 num1 = 0;
			 zero.setText("0");
		 }
	 }
	 else if (input.equals("=")) {
		 if(yeon.equals("+")) {
			 result = num1 + num2;
			 zero.setText(String.valueOf(result));
			 state = true;
			 
		 }
		 else if(yeon.equals("-")) {
			 result = num1 - num2;
			 zero.setText(String.valueOf(result));
			 state = true;
	 }
		 else if(yeon.equals("X")) {
			 result = num1 * num2;
			 zero.setText(String.valueOf(result));
			 state = true;
	 }
		 else if(yeon.equals("÷")) {
			 result = num1 / num2;
			 zero.setText(String.valueOf(result));
			 state = true;
	 }
	 
	 
	}else {
		if(state) {
			zero.setText("0");
			state = false;
			num1 = 0;
			num2 = 0;
			ininput = "";
		}
		ininput += e.getActionCommand();
		zero.setText(ininput);
		num2 = Integer.parseInt(ininput);
	}
	}


	private void setBackSpace(String s) {
		zero.setText(s);
	}
	private String getBackSpace() {	
		return zero.getText();
	}

	
	public static void main(String[] args) {
		new Cal();
		
}
}
