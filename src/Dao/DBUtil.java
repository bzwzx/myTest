package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {
	
	public DataSource getDataSource() {
		DataSource ds=new ComboPooledDataSource();
		return ds;
	}
	
	public Connection getConn() {
		Connection conn=null;
		try {
			conn = getDataSource().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	//执行增删改
	public int executeUpdate(String sql,Object...params) {
		int num=0;
		Connection conn=getConn();
		QueryRunner runner=new QueryRunner();
		try {
			num=runner.update(conn, sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;		
	}
	
	//统计个数
	public int getCount(String sql,Class clazz,Object...params) {
		int num=0;
		Connection conn=getConn();
		QueryRunner runner=new QueryRunner();
		try {
			Object obj=runner.query(conn, sql, new ScalarHandler(), params);
			num=Integer.parseInt(obj.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
	
	//查询单个对象
	public <T> T getObject(String sql,Class clazz,Object...params) {
		//得到连接
		Connection conn=getConn();
		QueryRunner runner=new QueryRunner();
		try {
			return (T) runner.query(conn, sql, new BeanHandler<Class>(clazz), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//查询多个对象
	public List getObjects(String sql,Class clazz,Object...params) {
//		Connection conn=getConn();
//		QueryRunner runner=new QueryRunner();
		QueryRunner runner=new QueryRunner(getDataSource());
		try {
			//return runner.query(conn, sql, new BeanListHandler<Class>(clazz), params);
			return runner.query(sql, new BeanListHandler<Class>(clazz), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
