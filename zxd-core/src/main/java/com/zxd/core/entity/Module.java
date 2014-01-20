package com.zxd.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Module {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(nullable=false)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String code;
	
}
