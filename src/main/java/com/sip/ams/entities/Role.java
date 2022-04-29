package com.sip.ams.entities;

	import javax.persistence.*;
	@Entity
	@Table(name = "role")
	public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private int id;
	@Column(name = "role")
	private String role; public int getId() { return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	
	public Role() {
		super();
	}
	public Role(String role) {
		super();
		this.role = role;
	}
	public String getRole() {
	return role;
	}
	public void setRole(String role) {
	this.role = role;
	}
	}


