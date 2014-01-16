package com.zxd.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ModuleGroup {
	
	@Id
	@Column(nullable=false)
	private String id;
	
	@Column
	private String name ;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Temporal(TemporalType.DATE)
	private Date updateDate;
	
	/*@ManyToOne(targetEntity=Role.class)
	private Role role;*/
	
	
	/*@ManyToMany
	@JoinTable(	
				uniqueConstraints=@UniqueConstraint(columnNames={"moduleGroupId","moduleId"}),
				joinColumns=@JoinColumn(name="moduleGroupId"),
				inverseJoinColumns=@JoinColumn(name="moduleId")
				)		
	private List<Module> modules ;*/
}
