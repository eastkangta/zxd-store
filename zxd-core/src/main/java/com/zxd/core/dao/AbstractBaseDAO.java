package com.zxd.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class AbstractBaseDAO{
	
	@PersistenceContext(name ="storePU")
	public EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
}
