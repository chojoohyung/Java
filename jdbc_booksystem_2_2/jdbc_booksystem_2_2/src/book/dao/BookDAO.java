package book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import book.vo.BookVO;

public class BookDAO {
	ArrayList<BookVO> bookVOList;
	String[] SearchColName = { "name", "publish", "author" };

	public ArrayList<BookVO> select(String searchWord, int comboSearchIndex) {
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		bookVOList = new ArrayList<BookVO>();
		try {
			String sql = "SELECT isbn, name, publish, author, price, category_name from book,category where book.category=category.category_id and "
					+ SearchColName[comboSearchIndex] + " like?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + searchWord + "%");
			rs = pstmt.executeQuery();  //select문 실행하려면 executeQuerty
			while (rs.next()) {
				BookVO vo = new BookVO();
				vo.setIsbn(rs.getInt("Isbn"));
				vo.setName(rs.getString("name"));
				vo.setPublish(rs.getString("publish"));
				vo.setAuthor(rs.getString("Author"));
				vo.setPrice(rs.getInt("price"));
				vo.setCategory_name(rs.getString("category_name"));

				bookVOList.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bookVOList;
	}

	public void insert(BookVO vo) {
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;

		String sql = "insert into book values(?, ?, ?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getIsbn());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPublish());
			pstmt.setString(4, vo.getAuthor());
			pstmt.setInt(5, vo.getPrice());
			int categoryId = 0;
			switch (vo.getCategory_name()) {
			case "IT도서":
				categoryId = 10;
				break;
			case "소설":
				categoryId = 20;
				break;
			case "비소설":
				categoryId = 30;
				break;
			case "경제":
				categoryId = 40;
				break;
			case "사회":
				categoryId = 50;
				break;
			}
			pstmt.setInt(6, categoryId);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void Update(BookVO vo) {
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;

		String sql = "update book  set name=?, publish=?, author=?, price=?, category=? where isbn=?";
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPublish());
			pstmt.setString(3, vo.getAuthor());
			pstmt.setInt(4, vo.getPrice());
			int categoryId = 0;
			switch (vo.getCategory_name()) {
			case "IT도서":
				categoryId = 10;
				break;
			case "소설":
				categoryId = 20;
				break;
			case "비소설":
				categoryId = 30;
				break;
			case "경제":
				categoryId = 40;
				break;
			case "사회":
				categoryId = 50;
				break;
			}
			pstmt.setInt(5, categoryId);
			pstmt.setInt(6, vo.getIsbn());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void delete(BookVO vo) {
		Connection con = JDBCConnector.getCon();
		PreparedStatement pstmt = null;

		String sql = "delete from book where isbn=?;";
		try {
			pstmt = con.prepareStatement(sql);
			
			
			pstmt.setInt(1, vo.getIsbn());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
}
