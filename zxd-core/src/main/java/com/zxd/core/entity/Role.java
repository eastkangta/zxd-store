package com.zxd.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

@Entity
public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable=false)
	//@GeneratedValue(strategy= GenerationType.AUTO )
	private String id;
	
	@Column
	private String name; //角色名称
	
	/*@OneToMany(targetEntity=ModuleGroup.class)
	@JoinTable(	
	
			//uniqueConstraints 防止重复列
			uniqueConstraints=@UniqueConstraint(columnNames={"moduleGroupId","moduleGroupId"}),
			joinColumns=@JoinColumn(name="roleId"),
			inverseJoinColumns=@JoinColumn(name="moduleGroupId")
			)	
	private List<ModuleGroup> moduleGroups;*/

}
