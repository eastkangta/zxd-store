package com.zxd.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.zxd.core.dao.IUserDAO;
import com.zxd.core.entity.User;


@Repository
public class UserDAO  extends BaseDAO<User> implements IUserDAO{
	@Override
	public void add(User user) {
		
		super.add(user);
	}
}
