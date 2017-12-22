package com.chinasofti.EUser.Test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * 
 * @author Administrator
 *@MybatisUtile 自动提交工具类
 */
public class MybatisUtile {

	private static SqlSessionFactory sqlSessionFactory=null;

		static {
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(MybatisUtile.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
	
	}
		public static SqlSession getSqlSession(boolean flag){
			//这里调用ibatis封装的方法，通过flag判断，调用自动提交还是手动提交
			return sqlSessionFactory.openSession(flag);
		}
//		public static SqlSession getSqlSession(){
//			//这里调用ibatis封装的方法，通过flag判断，调用自动提交还是手动提交
//			System.out.println(1111);
//			return sqlSessionFactory.openSession();
//		}
}
