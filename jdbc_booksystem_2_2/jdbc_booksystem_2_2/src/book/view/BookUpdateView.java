package book.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import book.vo.BookVO;

public class BookUpdateView extends JPanel {


	ArrayList<BookVO> bookVOList;
	JPanel panN;
	JTable table;
	DefaultTableModel model;
	String searchWord;
	JPanel panS = new JPanel(new GridLayout(4,4));
	String[] header = {"도서번호","도서명","저자명","출판사","가격","분류명"};
	String[] combostr = {"IT도서", "소설","비소설","경제","사회"};
	JLabel[] lbls = new JLabel[header.length];
	JTextField[] tf = new JTextField[lbls.length-1];
	JComboBox<String> comoboCategory = new JComboBox<String>(combostr);
	JButton btnUpdate = new JButton("도서수정");
	
	
	
	public BookUpdateView(){
		setLayout(new BorderLayout(10,10));

		for (int i = 0; i < header.length; i++) {
			lbls[i] = new JLabel(header[i]);
			panS.add(lbls[i]);
			if(i < header.length-1) {
				tf[i] = new JTextField();
				panS.add(tf[i]);				
			}else {
				panS.add(comoboCategory);
			}
		}
		
		tf[0].setEditable(false);
		
		for (int i = 0; i < 3; i++) {
			panS.add(new JLabel(""));
			
		}
		panS.add(btnUpdate);
	}
	
	public void setTextField(int row) {
			for (int i = 0; i < tf.length; i++) {
			tf[i].setText(model.getValueAt(row,i)+"");
		}	
			comoboCategory.setSelectedItem(model.getValueAt(row, 5));
		
	}
	
	public void initView() {
		
		model = new DefaultTableModel(header, bookVOList.size()) {
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	};
	
	putSearchResult();
	
	table = new JTable(model);
	table.getColumnModel().getColumn(0).setPreferredWidth(50);
	table.getColumnModel().getColumn(1).setPreferredWidth(200);
	table.getColumnModel().getColumn(4).setPreferredWidth(50);
	table.getColumnModel().getColumn(5).setPreferredWidth(50);
	
	JScrollPane scroll = new JScrollPane(table);
	
	add("Center",scroll);
	add("South",panS);
	}
	public void putSearchResult() {
		model.setRowCount(bookVOList.size());
		BookVO vo = null;
		for (int i = 0; i < bookVOList.size(); i++) {
			vo = bookVOList.get(i);
			model.setValueAt(vo.getIsbn(), i, 0);
			model.setValueAt(vo.getName(), i, 1);
			model.setValueAt(vo.getAuthor(), i, 2);
			model.setValueAt(vo.getPublish(), i, 3);
			model.setValueAt(vo.getPrice(), i, 4);
			model.setValueAt(vo.getCategory_name(), i, 5);
			
			
		}
	}
	
	public void setBookVOList(ArrayList<BookVO> bookVOList) {
		this.bookVOList = bookVOList;
		
	}
	
	public JButton getBtnUpdate() {
		return btnUpdate;
	}
	

	
	public BookVO neededUpdateData() {
		BookVO vo = new BookVO();
		vo.setIsbn(Integer.parseInt(tf[0].getText()));
		vo.setName(tf[1].getText());
		vo.setAuthor(tf[2].getText());
		vo.setPublish(tf[3].getText());
		vo.setPrice(Integer.parseInt(tf[4].getText()));
		vo.setCategory_name((String)comoboCategory.getSelectedItem());
		return vo;
	}
public void initData() {
	for(int i = 0; i< tf.length; i++) {
		tf[i].setText("");
	}
	comoboCategory.setSelectedIndex(0);
}

public JTable getTable() {
	return table;
}

	
	
}
