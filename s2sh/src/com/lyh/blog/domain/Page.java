package com.lyh.blog.domain;
// Generated 2017-5-23 17:13:52 by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * Page generated by hbm2java
 */
public class Page implements java.io.Serializable {

	private Integer pid;
	private String title;
	private String description;
	private String content;
	private String htmlUrl;
	private Integer comment;
	private Integer pageview=0;
	private Date time;
	private String tag;
	private String isprivate;
	private String head_url;

	public Page() {
	}
	
	public String getHead_url() {
		return head_url;
	}

	public void setHead_url(String head_url) {
		this.head_url = head_url;
	}

	public Page(String title, String description, String content, String htmlUrl, Integer comment, Integer pageview,
			Date time, String tag, String isprivate) {
		this.title = title;
		this.description = description;
		this.content = content;
		this.htmlUrl = htmlUrl;
		this.comment = comment;
		this.pageview = pageview;
		this.time = time;
		this.tag = tag;
		this.isprivate = isprivate;
	}



	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHtmlUrl() {
		return this.htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public Integer getComment() {
		return this.comment;
	}

	public void setComment(Integer comment) {
		this.comment = comment;
	}

	public Integer getPageview() {
		return this.pageview;
	}

	public void setPageview(Integer pageview) {
		this.pageview = pageview;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getIsprivate() {
		return this.isprivate;
	}

	public void setIsprivate(String isprivate) {
		this.isprivate = isprivate;
	}

}