package com.example.loginDemo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_Details")
public class UserDtls {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name = "Name")
		private String fullname;
		private String fathername;
		private String gender;
		private String dob;
		private String address;
		private String email;
		private String password;
		
		
		
		public String getFathername() {
			return fathername;
		}
		public void setFathername(String fathername) {
			this.fathername = fathername;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "UserDtls [id=" + id + ", fullname=" + fullname + ", fathername=" + fathername + ", gender=" + gender
					+ ", dob=" + dob + ", address=" + address + ", email=" + email + ", password=" + password + "]";
		}

}
