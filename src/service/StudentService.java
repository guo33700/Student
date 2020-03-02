package service;

import java.util.ArrayList;
import java.util.List;

import entity.StudentManger;

public interface StudentService {
	//²éÑ¯
	List<StudentManger> selectAll();
	//Ôö¼Ó
	int add(StudentManger stu);
}
