package com.asset.dto;



import java.sql.Date;

public class AssetRequest {
	
	private int allocationId;
	private int assetId;
	private int empNo;
	private Date allocationDate;
	private Date releaseDate;
	
	public int getAllocationId() {
		return allocationId;
	}
	public void setAllocationId(int allocationId) {
		this.allocationId = allocationId;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public Date getAllocationDate() {
		return allocationDate;
	}
	public void setAllocationDate(Date allocationDate) {
		this.allocationDate = allocationDate;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Asset_Request [allocationId=" + allocationId + ", assetId=" + assetId + ", empNo=" + empNo
				+ ", allocationDate=" + allocationDate + ", releaseDate=" + releaseDate + "]";
	}
	
	
	
}

