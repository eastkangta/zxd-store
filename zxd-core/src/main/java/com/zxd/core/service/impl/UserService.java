package com.zxd.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxd.core.dao.IUserDAO;
import com.zxd.core.entity.User;
import com.zxd.core.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Resource
	private IUserDAO userDAO;

	@Override
	@Transactional
	public void addUser(User user) {
		userDAO.add(user);
	}
	
	
	public IUserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
