package com.example.demo.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(max = 100)
	@Column(unique = true)
	private String title;

	@NotNull
	@Size(max = 200)
	private String description;

	@NotNull
	@Lob
	private String content;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Posted_At")
	private Date PostedAt = new Date();

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Last_Update_At")
	private Date lastUpdateAt = new Date();

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "Posts_Tags", joinColumns = { @JoinColumn(name = "Post_id") }, inverseJoinColumns = {
			@JoinColumn(name = "Tag_id") })
	private Set<Tag> tags = new HashSet<>();
	
	@Embedded
	Tag tag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPostedAt() {
		return PostedAt;
	}

	public void setPostedAt(Date postedAt) {
		PostedAt = postedAt;
	}

	public Date getLastUpdateAt() {
		return lastUpdateAt;
	}

	public void setLastUpdateAt(Date lastUpdateAt) {
		this.lastUpdateAt = lastUpdateAt;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	

}