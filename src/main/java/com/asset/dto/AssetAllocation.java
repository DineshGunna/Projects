package com.asset.dto;

public class AssetAllocation {
	

		private String allocationId ;
		private String assetId  ;
		private String empNo ;
		private String allocationDate ;
		private String releaseDate ;
		public String getAllocationId() {
			return allocationId;
		}
		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
		}
		public String getAssetId() {
			return assetId;
		}
		public void setAssetId(String assetId) {
			this.assetId = assetId;
		}
		public String getEmpNo() {
			return empNo;
		}
		public void setEmpNo(String empNo) {
			this.empNo = empNo;
		}
		public String getAllocationDate() {
			return allocationDate;
		}
		public void setAllocationDate(String allocationDate) {
			this.allocationDate = allocationDate;
		}
		public String getReleaseDate() {
			return releaseDate;
		}
		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}
		@Override
		public String toString() {
			return "Asset_Allocation [allocationId=" + allocationId + ", assetId=" + assetId + ", empNo=" + empNo
					+ ", allocationDate=" + allocationDate + ", releaseDate=" + releaseDate + "]";
		}
		

	}
