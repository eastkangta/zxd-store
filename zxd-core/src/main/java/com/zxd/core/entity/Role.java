package com.zxd.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Long  id;
	
	@Column
	private String name; //角色名称
	
	
	@OneToOne
	@JoinColumn(name="moduleGroupId")
	private ModuleGroup moduleGroup;
	
}
