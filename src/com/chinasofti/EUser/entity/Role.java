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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_role")
public class Role {
		private Integer role_id;
		private String role_uuid;
		private String role_name;
		private Set<Ability> abilities =new HashSet<Ability>();//角色对职能，多对多
		private Set<Teacher> teachers =new HashSet<Teacher>();//角色对老师，一对多
		public Role() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Role(Integer role_id, String role_uuid, String role_name,
				Set<Ability> abilities, Set<Teacher> teachers) {
			super();
			this.role_id = role_id;
			this.role_uuid = role_uuid;
			this.role_name = role_name;
			this.abilities = abilities;
			this.teachers = teachers;
		}
		
		public Role(String role_uuid, String role_name) {
			super();
			this.role_uuid = role_uuid;
			this.role_name = role_name;
		}
		@Override
		public String toString() {
			return "Role [role_id=" + role_id + ", role_uuid=" + role_uuid
					+ ", role_name=" + role_name + ", abilities=" + abilities
					+ ", teachers=" + teachers + "]";
		}
		@Id
		@GeneratedValue
		public Integer getRole_id() {
			return role_id;
		}
		public void setRole_id(Integer role_id) {
			this.role_id = role_id;
		}
		public String getRole_uuid() {
			return role_uuid;
		}
		public void setRole_uuid(String role_uuid) {
			this.role_uuid = role_uuid;
		}
		public String getRole_name() {
			return role_name;
		}
		public void setRole_name(String role_name) {
			this.role_name = role_name;
		}
		@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinTable(name="role_ability",joinColumns=@JoinColumn(name="role_id"),inverseJoinColumns=@JoinColumn(name="ability_id"))
		public Set<Ability> getAbilities() {
			return abilities;
		}
		public void setAbilities(Set<Ability> abilities) {
			this.abilities = abilities;
		}
		@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="role_id")
		public Set<Teacher> getTeachers() {
			return teachers;
		}
		public void setTeachers(Set<Teacher> teachers) {
			this.teachers = teachers;
		}
		
}
