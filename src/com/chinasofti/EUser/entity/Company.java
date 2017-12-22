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
@Table(name="t_company")
public class Company {
		private Integer company_id;
		private String company_uuid;
		private String company_name;
		private String company_address;
		private String company_information;
		private String company_contact;
		private String contact_phone;
		private String telephone;
		private String qq;
		private Integer coperation_state;
		private Information_Sources information_Sources;//公司对信息来源，多对一
		private Set<Com_Con_Record> com_Con_Records= new HashSet<Com_Con_Record>();//联系企业对联系记录，一对多
		private Set<Position> positions= new HashSet<Position>();//公司对岗位，多对多
		private Set<Student> students= new HashSet<Student>();//公司对学生，一对多
		public Company() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Company(Integer company_id, String company_uuid,
				String company_name, String company_address,
				String company_information, String company_contact,
				String contact_phone, String telephone, String qq,
				Integer coperation_state,
				Information_Sources information_Sources, Set<Position> positions) {
			super();
			this.company_id = company_id;
			this.company_uuid = company_uuid;
			this.company_name = company_name;
			this.company_address = company_address;
			this.company_information = company_information;
			this.company_contact = company_contact;
			this.contact_phone = contact_phone;
			this.telephone = telephone;
			this.qq = qq;
			this.coperation_state = coperation_state;
			this.information_Sources = information_Sources;
			this.positions = positions;
		}

		public Company(Integer company_id, String company_uuid,
				String company_name, String company_address,
				String company_information, String company_contact,
				String contact_phone, String telephone, String qq,
				Integer coperation_state,
				Information_Sources information_Sources
			) {
			super();
			this.company_id = company_id;
			this.company_uuid = company_uuid;
			this.company_name = company_name;
			this.company_address = company_address;
			this.company_information = company_information;
			this.company_contact = company_contact;
			this.contact_phone = contact_phone;
			this.telephone = telephone;
			this.qq = qq;
			this.coperation_state = coperation_state;
			this.information_Sources = information_Sources;

		}
		
		public Company(Integer company_id, String company_uuid,
				String company_name) {
			super();
			this.company_id = company_id;
			this.company_uuid = company_uuid;
			this.company_name = company_name;
		}

		

		@Override
		public String toString() {
			return "Company [company_id=" + company_id + ", company_uuid="
					+ company_uuid + ", company_name=" + company_name
					+ ", company_address=" + company_address
					+ ", company_information=" + company_information
					+ ", company_contact=" + company_contact
					+ ", contact_phone=" + contact_phone + ", telephone="
					+ telephone + ", qq=" + qq + ", coperation_state="
					+ coperation_state + "]";
		}

		@Id
		@GeneratedValue
		public Integer getCompany_id() {
			return company_id;
		}
		public void setCompany_id(Integer company_id) {
			this.company_id = company_id;
		}
		public String getCompany_uuid() {
			return company_uuid;
		}
		public void setCompany_uuid(String company_uuid) {
			this.company_uuid = company_uuid;
		}
		public String getCompany_name() {
			return company_name;
		}
		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}
		public String getCompany_address() {
			return company_address;
		}
		public void setCompany_address(String company_address) {
			this.company_address = company_address;
		}
		public String getCompany_information() {
			return company_information;
		}
		public void setCompany_information(String company_information) {
			this.company_information = company_information;
		}
		public String getCompany_contact() {
			return company_contact;
		}
		public void setCompany_contact(String company_contact) {
			this.company_contact = company_contact;
		}
		public String getContact_phone() {
			return contact_phone;
		}
		public void setContact_phone(String contact_phone) {
			this.contact_phone = contact_phone;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getQq() {
			return qq;
		}
		public void setQq(String qq) {
			this.qq = qq;
		}
		public Integer getCoperation_state() {
			return coperation_state;
		}
		public void setCoperation_state(Integer coperation_state) {
			this.coperation_state = coperation_state;
		}
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name="information_id")
		public Information_Sources getInformation_Sources() {
			return information_Sources;
		}
		public void setInformation_Sources(Information_Sources information_Sources) {
			this.information_Sources = information_Sources;
		}
		@OneToMany(fetch=FetchType.EAGER)
		@JoinColumn(name="company_id")
		public Set<Com_Con_Record> getCom_Con_Records() {
			return com_Con_Records;
		}
		public void setCom_Con_Records(Set<Com_Con_Record> com_Con_Records) {
			this.com_Con_Records = com_Con_Records;
		}
		@ManyToMany(fetch=FetchType.EAGER)
		@JoinTable(name="company_position",joinColumns=@JoinColumn(name="company_id"),inverseJoinColumns=@JoinColumn(name="position_id"))
		public Set<Position> getPositions() {
			return positions;
		}
		public void setPositions(Set<Position> positions) {
			this.positions = positions;
		}
		@OneToMany(fetch=FetchType.EAGER)
		@JoinColumn(name="company_id")
		public Set<Student> getStudents() {
			return students;
		}

		public void setStudents(Set<Student> students) {
			this.students = students;
		}
		
		
		
}
