package com.admin.servlet;

import java.io.IOException;

import com.dao.BookDao;
import com.dao.BookDaoImpl;
import com.dao.DaoFactory;
import com.db.DbConnect;
import com.entity.BookDtls;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;

@WebServlet("/edit_books")
public class EditBooksServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String bookName = req.getParameter("bname");
			String author = req.getParameter("author");
			String price = req.getParameter("price");
			String status = req.getParameter("bstatus");

			
			
			BookDtls b = new BookDtls();
			b.setBookId(id);
			b.setBookName(bookName);
			b.setAuthor(author);
			b.setPrice(price);
			b.setStatus(status);
			
			BookDao dao = DaoFactory.INSTANCE.setConnection(DbConnect.getConn()).getBookDao();
			/* BookDaoImpl dao = new BookDaoImpl(DbConnect.getConn()); */
			boolean f = dao.updateEditBooks(b);
			
			HttpSession session = req.getSession();
					
			if (f) {
				
				session.setAttribute("succMsg", "Book update successfully");
				resp.sendRedirect("admin/all_books.jsp");
				
			} else {
				session.setAttribute("failedMsg", "Something wrong on server");
				resp.sendRedirect("admin/all_books.jsp");
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
