package service.impl;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.StudentManger;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
StudentDao dao = new StudentDaoImpl();
	//²éÑ¯
	@Override
	public List<StudentManger> selectAll() {
		List<StudentManger> list = dao.selectAll() ;
		return list;
	}
	@Override
	//Ôö¼Ó
	public int add(StudentManger stu) {
		return dao.add(stu);
	}
	

}
