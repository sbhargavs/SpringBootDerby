package com.sbs.springboot.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Course")
@Table(name ="course")
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4418056278349817111L;

	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name ="name")
	private String name;
	@Column(name ="details")
	private String details;

	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name ="course_id")
	private Set<Chapter> chapters =new HashSet<Chapter>();
	
	public Course() {
		super();
	}

	public Course(Long id, String name, String details,Set<Chapter> chapters) {
		super();
		Id = id;
		this.name = name;
		this.details = details;
		this.chapters= chapters;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	/**
	 * @return the chapterList
	 */
	public Set<Chapter> getChapters() {
		return chapters;
	}

	/**
	 * @param chapterList
	 *            the chapterList to set
	 */
	public void setChapterList(Set<Chapter> chapters) {
		this.chapters = chapters;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", details=" + details + ", chapters=" + chapters + "]";
	}


	
	
}
