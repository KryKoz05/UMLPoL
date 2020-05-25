package com.UCPoL.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "item")

public class Item {
	@Id
	private String id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	private String name;
	private String type;
	private String power;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.id = name;}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}

}
