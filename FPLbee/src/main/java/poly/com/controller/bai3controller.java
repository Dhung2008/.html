package poly.com.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet({"/crud/them","/crud/xoa","/crud/sua"})
public class bai3controller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String url=req.getRequestURI();
		if (url.contains("/crud/them"))
			resp.getWriter().println("<h1>Creating a new record...</h1>");
		else if (url.contains("crud/xoa"))
			resp.getWriter().println("<h1>Xóa dữ liệu...</h1>");
		else 
			resp.getWriter().println("<h1>sửa...</h1>");
	}
}
