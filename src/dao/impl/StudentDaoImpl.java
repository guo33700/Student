package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import entity.StudentManger;
import utils.DButils;

public class StudentDaoImpl implements StudentDao {
	@Override
	public List<StudentManger> selectAll() {
		//查询所有的数据
		List<StudentManger> list = new ArrayList<StudentManger>();
		try {
			String sql = "select * from student";
			ResultSet re = DButils.queryAll(sql, null);
			while(re.next()) {
				list.add(new StudentManger(re.getString(1), re.getInt(2), re.getString(3), re.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//增加
	@Override
	public int add(StudentManger stu) {
		String sql = "INSERT INTO student VALUES(?,?,?,?)";
		Object[] params = {stu.getName(),stu.getAge(),stu.getId(),stu.getAddress()};
		return DButils.updateAll(sql, params);
	}

}
