package service;

import java.util.ArrayList;
import java.util.List;

import entity.StudentManger;

public interface StudentService {
	//��ѯ
	List<StudentManger> selectAll();
	//����
	int add(StudentManger stu);
}
