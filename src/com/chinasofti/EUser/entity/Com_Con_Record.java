package com.chinasofti.EUser.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="t_record")
public class Com_Con_Record {
		private Integer record_id;
		private String record_uuid;
		private String record_time;
		private String record_result;
		private Teacher teacher;//联系记录对就业老师，多对一
		private Company company;//联系记录对联系企业，多对一
		public Com_Con_Record() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Com_Con_Record(Integer record_id, String record_uuid,
				String record_time, String record_result, Teacher teacher,
				Company company) {
			super();
			this.record_id = record_id;
			this.record_uuid = record_uuid;
			this.record_time = record_time;
			this.record_result = record_result;
			this.teacher = teacher;
			this.company = company;
		}

		@Id
		@GeneratedValue
		public Integer getRecord_id() {
			return record_id;
		}
		public void setRecord_id(Integer record_id) {
			this.record_id = record_id;
		}
		public String getRecord_uuid() {
			return record_uuid;
		}
		public void setRecord_uuid(String record_uuid) {
			this.record_uuid = record_uuid;
		}
		public String getRecord_time() {
			return record_time;
		}
		public void setRecord_time(String record_time) {
			this.record_time = record_time;
		}
		public String getRecord_result() {
			return record_result;
		}
		public void setRecord_result(String record_result) {
			this.record_result = record_result;
		}
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name="teacher_id")
		public Teacher getTeacher() {
			return teacher;
		}
		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name="company_id")
		public Company getCompany() {
			return company;
		}
		public void setCompany(Company company) {
			this.company = company;
		}
		
}
