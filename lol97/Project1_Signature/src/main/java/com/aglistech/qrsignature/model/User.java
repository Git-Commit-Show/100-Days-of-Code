package com.aglistech.qrsignature.model;

public class User {
	private Integer id;
	private String name;
	private String key;

	public User(Integer id, String name, String key) {
		super();
		this.id = id;
		this.name = name;
		this.key = key;
	}

	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
