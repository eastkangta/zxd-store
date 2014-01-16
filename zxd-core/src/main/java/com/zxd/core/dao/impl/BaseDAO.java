package com.zxd.core.dao.impl;

import java.util.List;

import com.zxd.core.dao.AbstractBaseDAO;
import com.zxd.core.entity.User;


public class BaseDAO <Entity> extends AbstractBaseDAO{
	
	public void add(Entity entity){
		super.entityManager.persist(entity);
	}
	
	public void delete(Entity entity){
		super.entityManager.remove(entity);
	}
	
	public void update(Entity entity){
		super.entityManager.merge(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<Entity> getList(Entity queryEntity) {
		return (List<Entity>) super.entityManager.find(User.class, queryEntity);
	}
}
