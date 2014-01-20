package com.zxd.core.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Long id;
	
	@Column
	private String name ;
	
	@Column
	private String password;
	
	@ManyToOne
	@JoinColumn(name="deptId")
	private Dept dept;
	
	@OneToMany
	@JoinTable(joinColumns=@JoinColumn(name="userId"),inverseJoinColumns=@JoinColumn(name="roleId"))
	private Set<Role> roles;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
}
