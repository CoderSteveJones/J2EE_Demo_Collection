/*
* Test01.java
* Version 1.0.0
* Created on 2019年3月7日
* Copyright QuickCodes.net
*
*/
package com.ym.c3p0;
import java.sql.SQLException;
import java.util.List;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ym.domain.User;

/**
 * @author Ben
 * @version 1.0.0
 * @since 
 * 创建时间：2019年3月7日
 * 功能描述：
 */
public class Test01 {

	@Test
	public void testC3P0() throws SQLException {
		
		QueryRunner queryRunner = new QueryRunner(new ComboPooledDataSource());
			    
	    // 增
//	    queryRunner.update("insert into t_user values (4 , ? , ? )", "aa" ,"hhh");

	    // 删
//	    queryRunner.update("delete from t_user where id = ?", 2);

	    // 改
//	    queryRunner.update("update t_user set username = ? where id = ?", 1 , "没炒粉");
	    
	    // 查单个数据
		User u1 = queryRunner.query("select * from t_user where id = ?",new BeanHandler<User>(User.class), 1);
		System.out.println(u1.getUsername());
	
		// 查询多个数据
	    List<User> list = queryRunner.query("select * from t_user", new BeanListHandler<User>(User.class));
		for (User user : list) {
			String name = user.getUsername();
			System.out.println(name);
		}
		
	}
	
}
