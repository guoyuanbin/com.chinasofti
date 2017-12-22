package com.chinasofti.EUser.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_intention")
public class Intention {
	private Integer intention_id;
	private String intention_uuid;
	private String intention_name;
	private Set<Student> students= new HashSet<Student>();//求职意向对学生，一对多
	private Set<Position> positions= new HashSet<Position>();//就业意向对职位，一对多
	
	public Intention() {
		
	}
	
	public Intention(Integer intention_id, String intention_uuid,
			String intention_name) {
		super();
		this.intention_id = intention_id;
		this.intention_uuid = intention_uuid;
		this.intention_name = intention_name;
	}

	public Intention(Integer intention_id, String intention_uuid,
			String intention_name, Set<Student> students,
			Set<Position> positions) {
		super();
		this.intention_id = intention_id;
		this.intention_uuid = intention_uuid;
		this.intention_name = intention_name;
		this.students = students;
		this.positions = positions;
	}

	@Override
	public String toString() {
		return "Intention [intention_id=" + intention_id + ", intention_uuid="
				+ intention_uuid + ", intention_name=" + intention_name
				+ ", students=" + students + ", positions=" + positions + "]";
	}
	@Id
	@GeneratedValue
	public Integer getIntention_id() {
		return intention_id;
	}

	public void setIntention_id(Integer intention_id) {
		this.intention_id = intention_id;
	}

	public String getIntention_uuid() {
		return intention_uuid;
	}

	public void setIntention_uuid(String intention_uuid) {
		this.intention_uuid = intention_uuid;
	}

	public String getIntention_name() {
		return intention_name;
	}

	public void setIntention_name(String intention_name) {
		this.intention_name = intention_name;
	}
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="intention_id")
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="intention_id")
	public Set<Position> getPositions() {
		return positions;
	}

	public void setPositions(Set<Position> positions) {
		this.positions = positions;
	}
	
	
}
