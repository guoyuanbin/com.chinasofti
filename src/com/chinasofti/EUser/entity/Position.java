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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_position")
public class Position {
		private Integer position_id;
		private String position_uuid;
		private String position_name;
		private Intention intention;//职位对就业意向，多对一
		private Set<Company> companies= new HashSet<Company>();//职位对公司多对多
		private Set<Work> works= new HashSet<Work>();//职位对工作内容一对多
		public Position() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Position(Integer position_id, String position_uuid,
				String position_name) {
			super();
			this.position_id = position_id;
			this.position_uuid = position_uuid;
			this.position_name = position_name;
	
		}
		@Override
		public String toString() {
			return "Position [position_id=" + position_id + ", position_uuid="
					+ position_uuid + ", position_name=" + position_name
					+ ", intention=" + intention + ", companies=" + companies
					+ ", works=" + works + "]";
		}
		@Id
		@GeneratedValue
		public Integer getPosition_id() {
			return position_id;
		}
		public void setPosition_id(Integer position_id) {
			this.position_id = position_id;
		}
		public String getPosition_uuid() {
			return position_uuid;
		}
		public void setPosition_uuid(String position_uuid) {
			this.position_uuid = position_uuid;
		}
		public String getPosition_name() {
			return position_name;
		}
		public void setPosition_name(String position_name) {
			this.position_name = position_name;
		}
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name="intention_id")
		public Intention getIntention() {
			return intention;
		}
		public void setIntention(Intention intention) {
			this.intention = intention;
		}
		@ManyToMany(cascade=CascadeType.ALL)
		@JoinTable(name="company_position",joinColumns=@JoinColumn(name="position_id"),inverseJoinColumns=@JoinColumn(name="company_id"))
		public Set<Company> getCompanies() {
			return companies;
		}
		public void setCompanies(Set<Company> companies) {
			this.companies = companies;
		}
		@OneToMany(fetch=FetchType.EAGER)
		@JoinColumn(name="position_id")
		public Set<Work> getWorks() {
			return works;
		}
		public void setWorks(Set<Work> works) {
			this.works = works;
		}
		
}
