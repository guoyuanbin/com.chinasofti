package com.chinasofti.EUser.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_work")//工作内容表
public class Work {
		private Integer work_id;
		private String work_uuid;
		private String money;
		private String work_content;
		private Position position;//工作内容对职位，多对一
	
		public Work() {
		
		}

	

		public Work(Integer work_id, String work_uuid, String money,
				String work_content, Position position) {
			super();
			this.work_id = work_id;
			this.work_uuid = work_uuid;
			this.money = money;
			this.work_content = work_content;
			this.position = position;
		}



		
		@Override
		public String toString() {
			return "Work [work_id=" + work_id + ", work_uuid=" + work_uuid
					+ ", money=" + money + ", work_content=" + work_content
					+ ", position=" + position + "]";
		}



		@Id
		@GeneratedValue
		public Integer getWork_id() {
			return work_id;
		}

		public void setWork_id(Integer work_id) {
			this.work_id = work_id;
		}

		public String getWork_uuid() {
			return work_uuid;
		}

		public void setWork_uuid(String work_uuid) {
			this.work_uuid = work_uuid;
		}

		public String getMoney() {
			return money;
		}

		public void setMoney(String money) {
			this.money = money;
		}

		public String getWork_content() {
			return work_content;
		}

		public void setWork_content(String work_content) {
			this.work_content = work_content;
		}
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="position_id")
		public Position getPosition() {
			return position;
		}

		public void setPosition(Position position) {
			this.position = position;
		}


		
}
