package com.sbs.springboot.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Chapter")
@Table(name = "chapter")
public class Chapter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9107741146828661691L;

	/**
	 * 
	 */

	@Id
	@GeneratedValue
	Long cId;

	String totalNoPages;
	String chapterName;

/*	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id" ,nullable=false)
	Course course;*/

	
	

	/**
	 * @return the cId
	 */
	public Long getcId() {
		return cId;
	}

	/**
	 * @param cId the cId to set
	 */
	public void setcId(Long cId) {
		this.cId = cId;
	}

	/**
	 * @return the totalNoPages
	 */
	public String getTotalNoPages() {
		return totalNoPages;
	}

	/**
	 * @param totalNoPages
	 *            the totalNoPages to set
	 */
	public void setTotalNoPages(String totalNoPages) {
		this.totalNoPages = totalNoPages;
	}

	/**
	 * @return the chapterName
	 */
	public String getChapterName() {
		return chapterName;
	}

	/**
	 * @param chapterName
	 *            the chapterName to set
	 */
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Chapter [id=" + cId + ", totalNoPages=" + totalNoPages + ", chapterName=" + chapterName + "]";
	}
	/*
	 * public Chapter(Long id, String totalNoPages, String chapterName) {
	 * super(); this.id = id; this.totalNoPages = totalNoPages; this.chapterName
	 * = chapterName; }
	 */

	/**
	 * @return the course
	 */
	/*public Course getCourse() {
		return course;
	}

	*//**
	 * @param course the course to set
	 *//*
	public void setCourse(Course course) {
		this.course = course;
	}*/
	
	

}
