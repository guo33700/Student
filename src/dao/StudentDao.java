package dao;

import java.util.List;

import entity.StudentManger;

public interface StudentDao {
	//��ѯѧ����Ϣ
	List<StudentManger> selectAll();
	//����ѧ����Ϣ
		int add(StudentManger stu);
	}
	
