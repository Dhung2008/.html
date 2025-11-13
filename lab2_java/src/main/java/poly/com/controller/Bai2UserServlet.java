package poly.com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Bai2UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        req.setAttribute("message", "welcome to fpt poly");
        Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Nguyễn Văn A");
        map.put("gender", "male");
        map.put("country", "viet nam");
        req.setAttribute("user", map);
        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }
}