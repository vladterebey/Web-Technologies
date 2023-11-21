package com.admin.servlet;

import java.io.File;
import java.io.IOException;

import com.dao.BookDao;
import com.dao.DaoFactory;
import com.db.DbConnect;
import com.entity.BookDtls;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@WebServlet("/add_books")
@MultipartConfig
public class BooksAdd extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String bookName = req.getParameter("bname");
			String author = req.getParameter("author");
			String price = req.getParameter("price");
			String category = req.getParameter("bcategory");
			String status = req.getParameter("bstatus");
			Part part = req.getPart("bimg");
			String filePath = part.getSubmittedFileName();
			
			BookDtls b = new BookDtls(bookName, author, price, category, status, filePath, "admin");
			 
			//BookDaoImpl dao = new BookDaoImpl(DbConnect.getConn());
			
			BookDao dao = DaoFactory.INSTANCE.setConnection(DbConnect.getConn()).getBookDao();
			
			boolean f = dao.addBooks(b);
			
			HttpSession session = req.getSession();
			
			if (f) {
				
				String path = getServletContext().getRealPath("") + "book";
				
				System.out.println(path);
				
				File file = new File(path);
				
				part.write(path + File.separator + filePath);
				
				session.setAttribute("succMsg", "Book Add Successfully");
				resp.sendRedirect("admin/add_books.jsp");
			} else {
				session.setAttribute("failedMsg", "Something wrong on Server");
				resp.sendRedirect("admin/add_books.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
