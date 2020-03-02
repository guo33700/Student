package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.scene.control.skin.ListViewSkin;

import entity.StudentManger;
import service.StudentService;
import service.impl.StudentServiceImpl;
@WebServlet("/Index")
public class SelectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("Utf-8");
		StudentService se = new StudentServiceImpl();
		List<StudentManger> list = se.selectAll();
		req.getSession().setAttribute("list", list);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
