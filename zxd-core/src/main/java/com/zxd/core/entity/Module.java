package com.zxd.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Module {
	@Id
	@Column(nullable=false)
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String code;
}
