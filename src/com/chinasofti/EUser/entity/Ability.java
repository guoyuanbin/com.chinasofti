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
import javax.persistence.Table;
@Entity
@Table(name="t_ability")
public class Ability {
		private Integer ability_id;
		private String ability_uuid;
		private String ability_name;
		private String ability_url;
		private Set<Role> roles =new HashSet<Role>();//职能对角色是多对多
		public Ability() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Ability(Integer ability_id, String ability_uuid,
				String ability_name, String ability_url, Set<Role> roles) {
			super();
			this.ability_id = ability_id;
			this.ability_uuid = ability_uuid;
			this.ability_name = ability_name;
			this.ability_url = ability_url;
			this.roles = roles;
		}
		
		public Ability(String ability_uuid, String ability_name,
				String ability_url) {
			super();
			this.ability_uuid = ability_uuid;
			this.ability_name = ability_name;
			this.ability_url = ability_url;
		}
		@Override
		public String toString() {
			return "Ability [ability_id=" + ability_id + ", ability_uuid="
					+ ability_uuid + ", ability_name=" + ability_name
					+ ", ability_url=" + ability_url + ", roles=" + roles + "]";
		}
		@Id
		@GeneratedValue
		public Integer getAbility_id() {
			return ability_id;
		}
		public void setAbility_id(Integer ability_id) {
			this.ability_id = ability_id;
		}
		public String getAbility_uuid() {
			return ability_uuid;
		}
		public void setAbility_uuid(String ability_uuid) {
			this.ability_uuid = ability_uuid;
		}
		public String getAbility_name() {
			return ability_name;
		}
		public void setAbility_name(String ability_name) {
			this.ability_name = ability_name;
		}
		public String getAbility_url() {
			return ability_url;
		}
		public void setAbility_url(String ability_url) {
			this.ability_url = ability_url;
		}
		@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinTable(name="role_ability",joinColumns=@JoinColumn(name="ability_id"),inverseJoinColumns=@JoinColumn(name="role_id"))
		public Set<Role> getRoles() {
			return roles;
		}
		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}
		
}
