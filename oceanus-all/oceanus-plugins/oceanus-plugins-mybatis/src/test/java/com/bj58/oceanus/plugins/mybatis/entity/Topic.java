package com.bj58.oceanus.plugins.mybatis.entity;

import com.bj58.oceanus.client.orm.annotation.Column;

public class Topic {

    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "forum")
    private long forum;

    @Column(name = "order")
    private long sequence;

    public Topic() {
    }

    public Topic(long id, String title, String content, long forum, long sequence) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.forum = forum;
        this.sequence = sequence;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getForum() {
        return forum;
    }

    public void setForum(long forum) {
        this.forum = forum;
    }

    @Override
    public String toString() {
        return "Topic [id=" + id + ", title=" + title + ", content=" + content + "]" + ", forum=" + forum + "]"+ ", sequence=" + sequence + "]";
    }

}
