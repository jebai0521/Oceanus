package com.bj58.oceanus.plugins.mybatis.entity;

import com.bj58.oceanus.client.orm.annotation.Column;

public class Forum {
	
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="topic_counnt")
	private int topicCounnt;
	
	public Forum() {}
	
	public Forum(long id, String name, int topicCounnt) {
		this.id = id;
		this.name = name;
		this.topicCounnt = topicCounnt;
	}
        
        public Forum(long id, String name) {
		this.id = id;
		this.name = name;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTopicCount() {
		return topicCounnt;
	}

	public void setTopicCount(int topicCounnt) {
		this.topicCounnt = topicCounnt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", topicCounnt=" + topicCounnt + "]";
	}

}
