package com.zxd.core.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ModuleGroup {
	
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Long id;
	
	@Column
	private String name ;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Temporal(TemporalType.DATE)
	private Date updateDate;
	
	
	@OneToMany
	@JoinTable(joinColumns={@JoinColumn(name="moduleGroupId")}, inverseJoinColumns ={@JoinColumn(name="moduleId")})
	private Set<Module> modules ;
}
