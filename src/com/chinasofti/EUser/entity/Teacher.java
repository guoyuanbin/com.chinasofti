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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_teacher")
public class Teacher {
		private Integer teacher_id;
		private String teacher_uuid;
		private String teacher_name;
		private Integer teacher_sex;
		private String teacher_phone;
		private Integer teacher_state;
		
		private Role role;//角色表
		private EUser user;//老师对用户，一对一
		
		private Set<Com_Con_Record> com_Con_Records= new HashSet<Com_Con_Record>();//就业老师对企业联系记录，一对多
		public Teacher() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Teacher(Integer teacher_id, String teacher_uuid,
				String teacher_name, Integer teacher_sex, String teacher_phone,
				Integer teacher_state, Role role, EUser user,
				 Set<Com_Con_Record> com_Con_Records) {
			super();
			this.teacher_id = teacher_id;
			this.teacher_uuid = teacher_uuid;
			this.teacher_name = teacher_name;
			this.teacher_sex = teacher_sex;
			this.teacher_phone = teacher_phone;
			this.teacher_state = teacher_state;
			this.role = role;
			this.user = user;
		
			this.com_Con_Records = com_Con_Records;
		}


		public Teacher(String teacher_uuid, String teacher_name,
				String teacher_phone, Integer teacher_sex,
				Integer teacher_state, Role role) {
			super();
			this.teacher_uuid = teacher_uuid;
			this.teacher_name = teacher_name;
			this.teacher_sex = teacher_sex;
			this.teacher_phone = teacher_phone;
			this.teacher_state = teacher_state;
			this.role = role;
		}





		public Teacher(Integer teacher_id, String teacher_uuid,
				String teacher_name) {
			super();
			this.teacher_id = teacher_id;
			this.teacher_uuid = teacher_uuid;
			this.teacher_name = teacher_name;
		}

		@Id
		@GeneratedValue
		public Integer getTeacher_id() {
			return teacher_id;
		}
		public void setTeacher_id(Integer teacher_id) {
			this.teacher_id = teacher_id;
		}
		
		public String getTeacher_uuid() {
			return teacher_uuid;
		}
		public void setTeacher_uuid(String teacher_uuid) {
			this.teacher_uuid = teacher_uuid;
		}
		public String getTeacher_name() {
			return teacher_name;
		}
		public void setTeacher_name(String teacher_name) {
			this.teacher_name = teacher_name;
		}
		public Integer getTeacher_sex() {
			return teacher_sex;
		}
		public void setTeacher_sex(Integer teacher_sex) {
			this.teacher_sex = teacher_sex;
		}
		public String getTeacher_phone() {
			return teacher_phone;
		}
		public void setTeacher_phone(String teacher_phone) {
			this.teacher_phone = teacher_phone;
		}
		public Integer getTeacher_state() {
			return teacher_state;
		}
		public void setTeacher_state(Integer teacher_state) {
			this.teacher_state = teacher_state;
		}
		@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="role_id")
		public Role getRole() {
			return role;
		}
		public void setRole(Role role) {
			this.role = role;
		}
		@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="user_id")
		public EUser getUser() {
			return user;
		}
		public void setUser(EUser user) {
			this.user = user;
		}
		
	
		@OneToMany(fetch=FetchType.EAGER)
		@JoinColumn(name="teacher_id")
		public Set<Com_Con_Record> getCom_Con_Records() {
			return com_Con_Records;
		}
		public void setCom_Con_Records(Set<Com_Con_Record> com_Con_Records) {
			this.com_Con_Records = com_Con_Records;
		}
		
}
