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
@Table(name="t_student")
public class Student {
		private Integer student_id;
		private String student_uuid;
		private String student_name;
		private Integer sex;
		private Integer age;
		private String student_phone;
		private String sfz_id;
		private String birthday;
		private String native_place;//籍贯
		private String address;//现住址
		private String qq;
		private String email;
		private String emergency_contact;//紧急联系人
		private String  emergency_phone;
		private Integer english_class;
		private Integer japanese_class;
		private String school;
		private String major;
		private String education;
		private Integer finish_state;//学生状态
		private String finish_time;//毕业时间
		private T_Class t_class;//学生里面班级的引用，多对一
		private Intention intention;//学生对求职意向，多对一
		private String inclass_time;//
		private String close_time;
		private String payment_time;
		private String intention_place;
		private Company company;//学生对工作岗位，多对一
		private Teacher teacher;//学生对就业老师，多对一
		private String juniorTeacherName;//初级老师名字
		private String juniorWrittenExam;//初级老师名字
		private String juniorProjectExam;//初级老师名字
		private String juniorTeacherSuggest;//初级老师名字
		private String middleTeacherName;//中级老师名字
		private String middleWrittenExam;//中级老师名字
		private String middleProjectExam;//中级老师名字
		private String middleTeacherSuggest;//中级老师名字
		private String seniorTeacherName;//高级老师名字
		private String seniorWrittenExam;//高级老师名字
		private String seniorProjectExam;//高级老师名字
		private String seniorTeacherSuggest;//高级老师名字
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public Student(Integer student_id, String student_uuid,
				String student_name, Integer sex, Integer age,
				String student_phone, String sfz_id, String birthday,
				String native_place, String address, String qq, String email,
				String emergency_contact, String emergency_phone,
				Integer english_class, Integer japanese_class, String school,
				String major, String education, Integer finish_state,
				String finish_time, T_Class t_class, Intention intention,
				String inclass_time, String close_time, String payment_time,
				String intention_place, Teacher teacher,
				String juniorTeacherName, String juniorWrittenExam,
				String juniorProjectExam, String juniorTeacherSuggest,
				String middleTeacherName, String middleWrittenExam,
				String middleProjectExam, String middleTeacherSuggest,
				String seniorTeacherName, String seniorWrittenExam,
				String seniorProjectExam, String seniorTeacherSuggest) {
			super();
			this.student_id = student_id;
			this.student_uuid = student_uuid;
			this.student_name = student_name;
			this.sex = sex;
			this.age = age;
			this.student_phone = student_phone;
			this.sfz_id = sfz_id;
			this.birthday = birthday;
			this.native_place = native_place;
			this.address = address;
			this.qq = qq;
			this.email = email;
			this.emergency_contact = emergency_contact;
			this.emergency_phone = emergency_phone;
			this.english_class = english_class;
			this.japanese_class = japanese_class;
			this.school = school;
			this.major = major;
			this.education = education;
			this.finish_state = finish_state;
			this.finish_time = finish_time;
			this.t_class = t_class;
			this.intention = intention;
			this.inclass_time = inclass_time;
			this.close_time = close_time;
			this.payment_time = payment_time;
			this.intention_place = intention_place;
			this.teacher = teacher;
			this.juniorTeacherName = juniorTeacherName;
			this.juniorWrittenExam = juniorWrittenExam;
			this.juniorProjectExam = juniorProjectExam;
			this.juniorTeacherSuggest = juniorTeacherSuggest;
			this.middleTeacherName = middleTeacherName;
			this.middleWrittenExam = middleWrittenExam;
			this.middleProjectExam = middleProjectExam;
			this.middleTeacherSuggest = middleTeacherSuggest;
			this.seniorTeacherName = seniorTeacherName;
			this.seniorWrittenExam = seniorWrittenExam;
			this.seniorProjectExam = seniorProjectExam;
			this.seniorTeacherSuggest = seniorTeacherSuggest;
		}



		public Student(Integer student_id, String student_uuid,
				String student_name, Integer sex, Integer age,
				String student_phone, String sfz_id, String birthday,
				String native_place, String address, String qq, String email,
				String emergency_contact, String emergency_phone,
				Integer english_class, Integer japanese_class, String school,
				String major, String education, Integer finish_state,
				String finish_time, T_Class t_class, Intention intention,
				String inclass_time, String close_time, String payment_time,
				String intention_place, Company company, Teacher teacher,
				String juniorTeacherName, String juniorWrittenExam,
				String juniorProjectExam, String juniorTeacherSuggest,
				String middleTeacherName, String middleWrittenExam,
				String middleProjectExam, String middleTeacherSuggest,
				String seniorTeacherName, String seniorWrittenExam,
				String seniorProjectExam, String seniorTeacherSuggest) {
			super();
			this.student_id = student_id;
			this.student_uuid = student_uuid;
			this.student_name = student_name;
			this.sex = sex;
			this.age = age;
			this.student_phone = student_phone;
			this.sfz_id = sfz_id;
			this.birthday = birthday;
			this.native_place = native_place;
			this.address = address;
			this.qq = qq;
			this.email = email;
			this.emergency_contact = emergency_contact;
			this.emergency_phone = emergency_phone;
			this.english_class = english_class;
			this.japanese_class = japanese_class;
			this.school = school;
			this.major = major;
			this.education = education;
			this.finish_state = finish_state;
			this.finish_time = finish_time;
			this.t_class = t_class;
			this.intention = intention;
			this.inclass_time = inclass_time;
			this.close_time = close_time;
			this.payment_time = payment_time;
			this.intention_place = intention_place;
			this.company = company;
			this.teacher = teacher;
			this.juniorTeacherName = juniorTeacherName;
			this.juniorWrittenExam = juniorWrittenExam;
			this.juniorProjectExam = juniorProjectExam;
			this.juniorTeacherSuggest = juniorTeacherSuggest;
			this.middleTeacherName = middleTeacherName;
			this.middleWrittenExam = middleWrittenExam;
			this.middleProjectExam = middleProjectExam;
			this.middleTeacherSuggest = middleTeacherSuggest;
			this.seniorTeacherName = seniorTeacherName;
			this.seniorWrittenExam = seniorWrittenExam;
			this.seniorProjectExam = seniorProjectExam;
			this.seniorTeacherSuggest = seniorTeacherSuggest;
		}

	
	
	


		@Override
		public String toString() {
			return "Student [student_id=" + student_id + ", student_uuid="
					+ student_uuid + ", student_name=" + student_name
					+ ", sex=" + sex + ", age=" + age + ", student_phone="
					+ student_phone + ", sfz_id=" + sfz_id + ", birthday="
					+ birthday + ", native_place=" + native_place
					+ ", address=" + address + ", qq=" + qq + ", email="
					+ email + ", emergency_contact=" + emergency_contact
					+ ", emergency_phone=" + emergency_phone
					+ ", english_class=" + english_class + ", japanese_class="
					+ japanese_class + ", school=" + school + ", major="
					+ major + ", education=" + education + ", finish_state="
					+ finish_state + ", finish_time=" + finish_time
					+ ", t_class=" + t_class + ", intention=" + intention
					+ ", inclass_time=" + inclass_time + ", close_time="
					+ close_time + ", payment_time=" + payment_time
					+ ", intention_place=" + intention_place + ", company="
					+ company + ", teacher=" + teacher + ", juniorTeacherName="
					+ juniorTeacherName + ", juniorWrittenExam="
					+ juniorWrittenExam + ", juniorProjectExam="
					+ juniorProjectExam + ", juniorTeacherSuggest="
					+ juniorTeacherSuggest + ", middleTeacherName="
					+ middleTeacherName + ", middleWrittenExam="
					+ middleWrittenExam + ", middleProjectExam="
					+ middleProjectExam + ", middleTeacherSuggest="
					+ middleTeacherSuggest + ", seniorTeacherName="
					+ seniorTeacherName + ", seniorWrittenExam="
					+ seniorWrittenExam + ", seniorProjectExam="
					+ seniorProjectExam + ", seniorTeacherSuggest="
					+ seniorTeacherSuggest + ", getStudent_id()="
					+ getStudent_id() + ", getStudent_uuid()="
					+ getStudent_uuid() + ", getStudent_name()="
					+ getStudent_name() + ", getSex()=" + getSex()
					+ ", getAge()=" + getAge() + ", getStudent_phone()="
					+ getStudent_phone() + ", getSfz_id()=" + getSfz_id()
					+ ", getBirthday()=" + getBirthday()
					+ ", getNative_place()=" + getNative_place()
					+ ", getAddress()=" + getAddress() + ", getQq()=" + getQq()
					+ ", getEmail()=" + getEmail()
					+ ", getEmergency_contact()=" + getEmergency_contact()
					+ ", getEmergency_phone()=" + getEmergency_phone()
					+ ", getEnglish_class()=" + getEnglish_class()
					+ ", getJapanese_class()=" + getJapanese_class()
					+ ", getSchool()=" + getSchool() + ", getMajor()="
					+ getMajor() + ", getEducation()=" + getEducation()
					+ ", getFinish_state()=" + getFinish_state()
					+ ", getFinish_time()=" + getFinish_time()
					+ ", getT_class()=" + getT_class() + ", getIntention()="
					+ getIntention() + ", getInclass_time()="
					+ getInclass_time() + ", getClose_time()="
					+ getClose_time() + ", getPayment_time()="
					+ getPayment_time() + ", getIntention_place()="
					+ getIntention_place() + ", getCompany()=" + getCompany()
					+ ", getTeacher()=" + getTeacher()
					+ ", getJuniorTeacherName()=" + getJuniorTeacherName()
					+ ", getJuniorWrittenExam()=" + getJuniorWrittenExam()
					+ ", getJuniorProjectExam()=" + getJuniorProjectExam()
					+ ", getJuniorTeacherSuggest()="
					+ getJuniorTeacherSuggest() + ", getMiddleTeacherName()="
					+ getMiddleTeacherName() + ", getMiddleWrittenExam()="
					+ getMiddleWrittenExam() + ", getMiddleProjectExam()="
					+ getMiddleProjectExam() + ", getMiddleTeacherSuggest()="
					+ getMiddleTeacherSuggest() + ", getSeniorTeacherName()="
					+ getSeniorTeacherName() + ", getSeniorWrittenExam()="
					+ getSeniorWrittenExam() + ", getSeniorProjectExam()="
					+ getSeniorProjectExam() + ", getSeniorTeacherSuggest()="
					+ getSeniorTeacherSuggest() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}



		@Id
		@GeneratedValue
		public Integer getStudent_id() {
			return student_id;
		}
		public void setStudent_id(Integer student_id) {
			this.student_id = student_id;
		}
		public String getStudent_uuid() {
			return student_uuid;
		}
		public void setStudent_uuid(String student_uuid) {
			this.student_uuid = student_uuid;
		}
		public String getStudent_name() {
			return student_name;
		}
		public void setStudent_name(String student_name) {
			this.student_name = student_name;
		}
		public Integer getSex() {
			return sex;
		}
		public void setSex(Integer sex) {
			this.sex = sex;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getStudent_phone() {
			return student_phone;
		}
		public void setStudent_phone(String student_phone) {
			this.student_phone = student_phone;
		}
		public String getSfz_id() {
			return sfz_id;
		}
		public void setSfz_id(String sfz_id) {
			this.sfz_id = sfz_id;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public String getNative_place() {
			return native_place;
		}
		public void setNative_place(String native_place) {
			this.native_place = native_place;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getQq() {
			return qq;
		}
		public void setQq(String qq) {
			this.qq = qq;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmergency_contact() {
			return emergency_contact;
		}
		public void setEmergency_contact(String emergency_contact) {
			this.emergency_contact = emergency_contact;
		}
		public String getEmergency_phone() {
			return emergency_phone;
		}
		public void setEmergency_phone(String emergency_phone) {
			this.emergency_phone = emergency_phone;
		}
		public Integer getEnglish_class() {
			return english_class;
		}
		public void setEnglish_class(Integer english_class) {
			this.english_class = english_class;
		}
		public Integer getJapanese_class() {
			return japanese_class;
		}
		public void setJapanese_class(Integer japanese_class) {
			this.japanese_class = japanese_class;
		}
		public String getSchool() {
			return school;
		}
		public void setSchool(String school) {
			this.school = school;
		}
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public Integer getFinish_state() {
			return finish_state;
		}
		public void setFinish_state(Integer finish_state) {
			this.finish_state = finish_state;
		}
		public String getFinish_time() {
			return finish_time;
		}
		public void setFinish_time(String finish_time) {
			this.finish_time = finish_time;
		}
		
		//学生对班级，多对一，学生里有班级的引用

		public T_Class getT_class() {
			return t_class;
		}
		public void setT_class(T_Class t_class) {
			this.t_class = t_class;
		}
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name="intention_id")
		public Intention getIntention() {
			return intention;
		}
		public void setIntention(Intention intention) {
			this.intention = intention;
		}
		public String getInclass_time() {
			return inclass_time;
		}
		public void setInclass_time(String inclass_time) {
			this.inclass_time = inclass_time;
		}
		public String getClose_time() {
			return close_time;
		}
		public void setClose_time(String close_time) {
			this.close_time = close_time;
		}
		public String getPayment_time() {
			return payment_time;
		}
		public void setPayment_time(String payment_time) {
			this.payment_time = payment_time;
		}
		public String getIntention_place() {
			return intention_place;
		}
		public void setIntention_place(String intention_place) {
			this.intention_place = intention_place;
		}
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name="company_id")
		public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}

		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name="teacher_id")
		public Teacher getTeacher() {
			return teacher;
		}
		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}
		public String getJuniorTeacherName() {
			return juniorTeacherName;
		}
		public void setJuniorTeacherName(String juniorTeacherName) {
			this.juniorTeacherName = juniorTeacherName;
		}
		public String getJuniorWrittenExam() {
			return juniorWrittenExam;
		}
		public void setJuniorWrittenExam(String juniorWrittenExam) {
			this.juniorWrittenExam = juniorWrittenExam;
		}
		public String getJuniorProjectExam() {
			return juniorProjectExam;
		}
		public void setJuniorProjectExam(String juniorProjectExam) {
			this.juniorProjectExam = juniorProjectExam;
		}
		public String getJuniorTeacherSuggest() {
			return juniorTeacherSuggest;
		}
		public void setJuniorTeacherSuggest(String juniorTeacherSuggest) {
			this.juniorTeacherSuggest = juniorTeacherSuggest;
		}
		public String getMiddleTeacherName() {
			return middleTeacherName;
		}
		public void setMiddleTeacherName(String middleTeacherName) {
			this.middleTeacherName = middleTeacherName;
		}
		public String getMiddleWrittenExam() {
			return middleWrittenExam;
		}
		public void setMiddleWrittenExam(String middleWrittenExam) {
			this.middleWrittenExam = middleWrittenExam;
		}
		public String getMiddleProjectExam() {
			return middleProjectExam;
		}
		public void setMiddleProjectExam(String middleProjectExam) {
			this.middleProjectExam = middleProjectExam;
		}
		public String getMiddleTeacherSuggest() {
			return middleTeacherSuggest;
		}
		public void setMiddleTeacherSuggest(String middleTeacherSuggest) {
			this.middleTeacherSuggest = middleTeacherSuggest;
		}
		public String getSeniorTeacherName() {
			return seniorTeacherName;
		}
		public void setSeniorTeacherName(String seniorTeacherName) {
			this.seniorTeacherName = seniorTeacherName;
		}
		public String getSeniorWrittenExam() {
			return seniorWrittenExam;
		}
		public void setSeniorWrittenExam(String seniorWrittenExam) {
			this.seniorWrittenExam = seniorWrittenExam;
		}
		public String getSeniorProjectExam() {
			return seniorProjectExam;
		}
		public void setSeniorProjectExam(String seniorProjectExam) {
			this.seniorProjectExam = seniorProjectExam;
		}
		public String getSeniorTeacherSuggest() {
			return seniorTeacherSuggest;
		}
		public void setSeniorTeacherSuggest(String seniorTeacherSuggest) {
			this.seniorTeacherSuggest = seniorTeacherSuggest;
		}
			
		
		
		
		
}
