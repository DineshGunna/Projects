package com.asset.dto;

public class User {

	
		private int userId;
		private String userName;
		private String password;
		private String usertype;
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsertype() {
			return usertype;
		}
		public void setUsertype(String usertype) {
			this.usertype = usertype;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", usertype=" + usertype + "]";
		}
	

	}
