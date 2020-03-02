package dao;

import java.util.List;

import entity.StudentManger;

public interface StudentDao {
	//查询学生信息
	List<StudentManger> selectAll();
	//增加学生信息
		int add(StudentManger stu);
	}
	
