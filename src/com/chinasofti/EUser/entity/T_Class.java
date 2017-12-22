package com.chinasofti.EUser.entity;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "t_class")
public class T_Class {
	private Integer class_id;
	private String class_uuid;
	private String class_name;
	private Integer class_state;
	private String bzr_name;// 班主任名字
	private String start_time;
	private Teacher teacher;// 班级对任课老师，多对一
	

	public T_Class() {
		super();
	}

	public T_Class(Integer class_id, String class_uuid, String class_name,
			String bzr_name, String start_time) {
		super();
		this.class_id = class_id;
		this.class_uuid = class_uuid;
		this.class_name = class_name;
		this.bzr_name = bzr_name;
		this.start_time = start_time;
	}
	public T_Class(Integer class_id, String class_uuid, String class_name,
			Integer class_state, String bzr_name, String start_time,
			Teacher teacher) {
		super();
		this.class_id = class_id;
		this.class_uuid = class_uuid;
		this.class_name = class_name;
		this.class_state = class_state;
		this.bzr_name = bzr_name;
		this.start_time = start_time;
		this.teacher = teacher;

	}


	@Override
	public String toString() {
		return "T_Class [class_id=" + class_id + ", class_uuid=" + class_uuid
				+ ", class_name=" + class_name + ", class_state=" + class_state
				+ ", bzr_name=" + bzr_name + ", start_time=" + start_time
				+ ", teacher=" + teacher + "]";
	}

	@Id
	@GeneratedValue
	public Integer getClass_id() {
		return class_id;
	}

	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}

	public String getClass_uuid() {
		return class_uuid;
	}

	public void setClass_uuid(String class_uuid) {
		this.class_uuid = class_uuid;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public Integer getClass_state() {
		return class_state;
	}

	public void setClass_state(Integer class_state) {
		this.class_state = class_state;
	}

	public String getBzr_name() {
		return bzr_name;
	}

	public void setBzr_name(String bzr_name) {
		this.bzr_name = bzr_name;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



}
