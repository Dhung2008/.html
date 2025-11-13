package poly.com.controller;
import java.io.*;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.OnClose;
@WebServlet("/bai1shareservlet")
public class Bai1ShareServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
	req.setAttribute("message", "webcome fpoly");
    req.setAttribute("now", new Date(0));
    req.getRequestDispatcher("page.jsp").forward(req, resp);
}
}