package book.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import book.dao.BookDAO;
import book.dao.JDBCConnector;
import book.view.BookInsertView;
import book.view.BookSearchView;
import book.view.BookUpdateView;
import book.vo.BookVO;

public class BookController extends JFrame {
	Connection con; 
	BookDAO dao;
	BookSearchView searchPan ;
	ArrayList<BookVO> bookVOList;
	JComboBox<String> comboSearch;
	BookInsertView insertPan;
	BookUpdateView updatePan;
	JTable table;
	static final int YES = 0;
	
	public BookController() {
		JTabbedPane tab = new JTabbedPane();
		//DB연결
		 con = JDBCConnector.getCon();
		 dao = new BookDAO();
		 //도서검색
		 searchPan = new BookSearchView();
		 bookVOList =  dao.select(searchPan.getSearchWord(),0);
		 for (int i = 0; i < bookVOList.size(); i++) {
			System.out.println(bookVOList.get(i));
		}
		 searchPan.setBookVOList(bookVOList);
		 searchPan.initView();
		 JButton btnSearch = searchPan.getBtnSearch();
		 comboSearch = searchPan.getComboSearch();
		 btnSearch.addActionListener(btnL);
		 //도서추가
		 insertPan = new BookInsertView();
		 bookVOList = dao.select( "", 0);
		 insertPan.setBookVOList(bookVOList);
		 insertPan.initView();
		 JButton btnAdd = insertPan.getBtnAdd();
		 btnAdd.addActionListener(btnAddL);
		 
		 //도서 수정
		 updatePan = new BookUpdateView();
		 bookVOList = dao.select( "", 0);
		 updatePan.setBookVOList(bookVOList);
		 updatePan.initView();
		 table = updatePan.getTable();
		 table.addMouseListener(tableL);
		 JButton btnUpdate = updatePan.getBtnUpdate();
		 btnUpdate.addActionListener(btnUpdateL);
		 
		 
		 
		 tab.add("도서검색",searchPan);
		 tab.add("도서추가",insertPan);
		 tab.add("도서수정 및 삭제",updatePan);
		 add(tab);
		 
		setTitle("도서관리시스템");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 500, 600, 500);
		setVisible(true);
	}
	
	 ActionListener btnL = new ActionListener() {
		 
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 
			 bookVOList =  dao.select( searchPan.getSearchWord(),comboSearch.getSelectedIndex());
			 searchPan.setBookVOList(bookVOList);
			 searchPan.putSearchResult();
			 searchPan.initView();
			 
		 }
	 };

	 ActionListener btnAddL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			BookVO vo = insertPan.neededInsertData();
			dao.insert(vo);
			 bookVOList = dao.select( "", 0);
			 insertPan.setBookVOList(bookVOList);
			 insertPan.putSearchResult();
			 updatePan.setBookVOList(bookVOList);
			updatePan.putSearchResult();
			searchPan.setBookVOList(bookVOList);
			searchPan.putSearchResult();
			 
		}
	};
	
	ActionListener btnUpdateL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			BookVO vo = updatePan.neededUpdateData();
			dao.Update(vo);
			bookVOList = dao.select("", 0);
			updatePan.setBookVOList(bookVOList);
			updatePan.putSearchResult();
			insertPan.setBookVOList(bookVOList);
			insertPan.putSearchResult();
			searchPan.setBookVOList(bookVOList);
			searchPan.putSearchResult();
			
		}
	};
	
	MouseAdapter tableL = new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 1) {
			int row = table.getSelectedRow();
			updatePan.setTextField(row);
			}
			if(e.getClickCount() == 2) {
				int result = JOptionPane.showConfirmDialog(BookController.this, "정말로 삭제하시겠습니까?","삭제여부",JOptionPane.WARNING_MESSAGE);
				if(result==YES) {
					BookVO vo = updatePan.neededUpdateData();
					dao.delete(vo);
					bookVOList = dao.select("", 0);
					searchPan.setBookVOList(bookVOList);
					searchPan.putSearchResult();
					insertPan.setBookVOList(bookVOList);
					insertPan.putSearchResult();
					updatePan.setBookVOList(bookVOList);
					updatePan.putSearchResult();
				
				}
			}
		};
	};
	
	/*static final int SEARCH_PAN= null;
	static final int INSERT_PAN= null;
	static final int UPDATE_PAN= null;
	
	public void updateView(JPanel pan, int panType) {
		BookSearchView sPan;
		BookInsertView iPan;
		BookUpdateView upan;
		switch (panType) {
			case SEARCH_PAN:
			
			break;

			case INSERT_PAN:
			
			break;
			case UPDATE_PAN:
				
				((BookUpdateView)pan).setBookVOList(bookVOList);
				((BookUpdateView)pan).putSearchResult();
			
			break;
		}

		
	}*/

	public static void main(String[] args) {
		new BookController();

	}

}
