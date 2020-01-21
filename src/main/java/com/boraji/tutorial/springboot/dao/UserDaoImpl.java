package com.boraji.tutorial.springboot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void register(com.boraji.tutorial.springboot.model.User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.boraji.tutorial.springboot.model.User validateUser(com.boraji.tutorial.springboot.model.Login login) {
		// TODO Auto-generated method stub
		return null;
	}
   
}