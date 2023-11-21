package com.admin.servlet;

import java.io.IOException;

import com.dao.BookDao;
import com.dao.BookDaoImpl;
import com.dao.DaoFactory;
import com.db.DbConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delete_books")
public class BookDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			int id = Integer.parseInt(req.getParameter("id"));
			
			BookDao dao = DaoFactory.INSTANCE.setConnection(DbConnect.getConn()).getBookDao();
			
			//BookDaoImpl dao = new BookDaoImpl(DbConnect.getConn());
			boolean f= dao.deleteBooks(id);
			
			HttpSession session = req.getSession();
			
			if (f) {
				
				session.setAttribute("succMsg", "Book delete successfully");
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
