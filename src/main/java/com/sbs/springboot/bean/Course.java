package com.sbs.springboot.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	Long Id;
	
	@Column(name ="name")
	 String name;
	@Column(name ="details")
	String details;

	
	@OneToOne(mappedBy = "course", cascade = CascadeType.ALL, 
            fetch = FetchType.EAGER, optional = false)
	private Chapter chapter;

	public Course() {
		super();
	}

	public Course(Long id, String name, String details,Chapter chapter) {
		super();
		Id = id;
		this.name = name;
		this.details = details;
		this.chapter= chapter;
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
	public Chapter getChapter() {
		return chapter;
	}

	/**
	 * @param chapterList
	 *            the chapterList to set
	 */
	public void setChapterList(Chapter chapter) {
		this.chapter = chapter;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", details=" + details + ", chapter=" + chapter + "]";
	}

	
	
}
