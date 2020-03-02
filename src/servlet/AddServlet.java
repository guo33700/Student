package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.StudentManger;
import service.StudentService;
import service.impl.StudentServiceImpl;
@WebServlet("/Add")
public class AddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		StudentService se = new StudentServiceImpl();
		StudentManger stu = new StudentManger();
		String name = req.getParameter("name");
		int age  = Integer.parseInt(req.getParameter("age"));
		String id = req.getParameter("id");
		String address = req.getParameter("address");
		
		stu.setName(name);
		stu.setAge(age);
		stu.setId(id);
		stu.setAddress(address);System.out.println(name);
		int temp = se.add(stu);
		System.out.println(temp);
		resp.sendRedirect("Index");
	}
	
}
