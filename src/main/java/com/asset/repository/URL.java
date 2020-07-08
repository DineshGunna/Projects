package com.asset.repository;

public class URL {

	public String getUrl()
	{
		String url="jdbc:mysql://localhost:3306/Asset_Management";
		return url;
	}
	public String getDriver()
	{
		String path="com.jdbc.mysql.Driver";
		return path;
	}
	public String getProp()
	{
		String prop="C:/Users/elcot/Desktop/caps_training/Asset/DBCredentials.PROPERTIES";
		return prop;
		
	}
}