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
@Table(name="t_sources")
public class Information_Sources {
		private Integer information_id;
		private String information_uuid;
		private String information_name;
		private Set<Company> companies= new HashSet<Company>();//信息来源对公司，一对多
		public Information_Sources() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Information_Sources(Integer information_id,
				String information_uuid, String information_name
			) {
			super();
			this.information_id = information_id;
			this.information_uuid = information_uuid;
			this.information_name = information_name;
		
		}
		@Override
		public String toString() {
			return "Information_Sources [information_id=" + information_id
					+ ", information_uuid=" + information_uuid
					+ ", information_name=" + information_name + ", companies="
					+ companies + "]";
		}
		@Id
		@GeneratedValue
		public Integer getInformation_id() {
			return information_id;
		}
		public void setInformation_id(Integer information_id) {
			this.information_id = information_id;
		}
		public String getInformation_uuid() {
			return information_uuid;
		}
		public void setInformation_uuid(String information_uuid) {
			this.information_uuid = information_uuid;
		}
		public String getInformation_name() {
			return information_name;
		}
		public void setInformation_name(String information_name) {
			this.information_name = information_name;
		}
		@OneToMany(fetch=FetchType.EAGER)
		@JoinColumn(name="information_id")
		public Set<Company> getCompanies() {
			return companies;
		}
		public void setCompanies(Set<Company> companies) {
			this.companies = companies;
		}

		
}
