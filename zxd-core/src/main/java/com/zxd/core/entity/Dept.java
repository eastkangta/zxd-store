package com.zxd.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dept {
	@Id
	@Column(nullable=false)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column
	private String name ;
	
	@Column
	private String parentDeptId;
	
	@Column
	private Integer level;
}
