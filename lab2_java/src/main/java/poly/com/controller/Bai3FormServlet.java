package poly.com.controller;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/Bai3FormServlet", "/form/ud","/form/create"})
public class Bai3FormServlet extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException, ServletException {
Map<String, Object> map = new HashMap<>();
map.put("fullname", "Lê Anh Tú");
map.put("gender", true);
map.put("country", "vn");
req.setAttribute("user", map);
req.getRequestDispatcher("/form/form.jsp").forward(req, resp);
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException, ServletException {
	// TODO Auto-generated method stub
	String uri=req.getRequestURI();
	if (uri.contains("/form/ud"))
	{
	String fullname=req.getParameter("fullname");
	System.out.print(fullname);
	String gender=req.getParameter("gender");
	String country=req.getParameter("country");

		Map<String, Object> map = new HashMap<>();
		map.put("fullname", fullname);
		map.put("gender", gender);
		map.put("country", country);
		req.setAttribute("user", map);
		req.setAttribute("capnhat", "update success");
		req.getRequestDispatcher("/form/form.jsp").forward(req, resp);
		}
		else if (uri.contains("/form/create"))
		{
			String fullname=req.getParameter("fullname");
			String gender=req.getParameter("gender");
			String country=req.getParameter("country");
			Map<String, Object> map = new HashMap<>();
			map.put("fullname", fullname);
			map.put("gender", gender);
			map.put("country", country);
			req.setAttribute("user", map);
			req.getRequestDispatcher("/form/themmoi.jsp").forward (req, resp);
		}
	}
	}




 