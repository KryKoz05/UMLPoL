package com.UCPoL.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.Set;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "user")
public class User {
	@Id
	private String id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private boolean token;
	@DBRef
	private Set<com.UCPoL.spring.mongo.api.model.Role> roles;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.id = username;}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public boolean getToken() {
		return token;
	}
	public void setToken(boolean token) {
		this.token = token;
	}
	public Set<com.UCPoL.spring.mongo.api.model.Role> getRoles() {
	    return roles;
	}

	public void setRoles(Set<com.UCPoL.spring.mongo.api.model.Role> roles) {
	    this.roles = roles;
	}
	
	
	
	
}
