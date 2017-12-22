package com.chinasofti.EUser.Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.chinasofti.EUser.entity.Company;
import com.chinasofti.EUser.entity.Student;
import com.chinasofti.EUser.entity.T_Class;

public class TestMybatis {
	
			@Test
			public void getOneStudent(){
					SqlSession session=MybatisUtile.getSqlSession(false);
				
					String sql1="com.chinasofti.EUser.companyMapper.getOneStudent";
					//Student student = session.selectOne(sql1, 83);
					List<Student> selectList = session.selectList(sql1);
					System.out.println(selectList.get(0).getT_class().getTeacher().getTeacher_name());
					//System.out.println(student.getT_class().getTeacher().getTeacher_name());
				
			}
			@Test
			public void updateStudent(){
					SqlSession session=MybatisUtile.getSqlSession(false);
				
					String sql1="com.chinasofti.EUser.companyMapper.queryT_Class";
					String sql2="com.chinasofti.EUser.companyMapper.updateStu";
					String sql3="com.chinasofti.EUser.companyMapper.queryOneStu";
					T_Class tclass = session.selectOne(sql1, "TYEEC-SZ-UI-20170626-02");
					System.out.println(tclass.getClass_id());
					Student student = session.selectOne(sql3, "111");
					student.setT_class(tclass);
					System.out.println(1111);
					int i = session.update(sql2, student);
					System.out.println(i);
			}
			
}
