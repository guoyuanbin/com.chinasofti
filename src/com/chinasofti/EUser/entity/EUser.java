package com.chinasofti.EUser.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class EUser {
		private Integer user_id;
		private String user_uuid;
		private String username;
		private String password;
		private Teacher teacher;//用户对老师，一对一
		public EUser() {
			super();
			// TODO Auto-generated constructor stub
		}
		public EUser(Integer user_id, String user_uuid, String username,
				String password, Teacher teacher) {
			super();
			this.user_id = user_id;
			this.user_uuid = user_uuid;
			this.username = username;
			this.password = password;
			this.teacher = teacher;
		}
		
		
		public EUser(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		
		
		public EUser(String user_uuid, String username, String password) {
			super();
			this.user_uuid = user_uuid;
			this.username = username;
			this.password = password;
		}
		
		
		public EUser(String username) {
			super();
			this.username = username;
		}
		@Override
		public String toString() {
			return "User [user_id=" + user_id + ", user_uuid=" + user_uuid
					+ ", username=" + username + ", password=" + password
					+ ", teacher=" + teacher + "]";
		}
		
		@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="user_id")
		public Teacher getTeacher() {
			return teacher;
		}
		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}
		@Id
		@GeneratedValue
		public Integer getUser_id() {
			return user_id;
		}
		public void setUser_id(Integer user_id) {
			this.user_id = user_id;
		}
		public String getUser_uuid() {
			return user_uuid;
		}
		public void setUser_uuid(String user_uuid) {
			this.user_uuid = user_uuid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
		
}
