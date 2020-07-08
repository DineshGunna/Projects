package com.asset.services;


import java.util.List;

import com.asset.dao.AssetDAO;
import com.asset.dao.AssetDAOJDBCimpl;
import com.asset.dto.Asset;
import com.asset.dto.AssetRequest;
import com.asset.dto.Employee;
import com.asset.dto.User;

public class AssetServiceJDBCimpl implements AssetService{

	AssetDAO impl=new AssetDAOJDBCimpl();
	@Override
	public User login(String userName, String password, String usertype) {
		
	User us=impl.login(userName, password, usertype);	
		if(us!=null)
		{
			return us;
		}
		return null;
	}

	@Override
	public boolean createUser(User u) {
		
		boolean b=impl.createUser(u);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(User u) {
		boolean b=impl.updateUser(u);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(int userId) {
		boolean b=impl.deleteUser(userId);
		if(b==true)
		{
			return true;
		}
		return false;
	}


	@Override
	public boolean addEmployee(Employee e) {
		boolean b=impl.addEmployee(e);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e) {
		boolean b=impl.updateEmployee(e);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int empNo) {
		boolean b=impl.deleteEmployee(empNo);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean createAsset(Asset a) {
		boolean b=impl.createAsset(a);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAsset(Asset a) {
		boolean b=impl.updateAsset(a);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAsset(int assetId, String assetName) {
		boolean b=impl.deleteAsset(assetId, assetName);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean requestAsset(AssetRequest r) {
		boolean b=impl.requestAsset(r);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	
	@Override
	public List<Asset> statusRequest() {
		List<Asset> ast=impl.statusRequest();	
		if(ast!=null)
		{
			return ast;
		}
		return null;
	}
	
	
	@Override
	public   List<AssetRequest> fetchRequest() {
		List<AssetRequest> ar=impl.fetchRequest();	
		if(ar!=null)
		{
			return ar;
		}
		return null;
	}

	
	
	
	
	@Override
	public List<Asset> fetchAllocatedAsset() {
		 List<Asset> ast=impl.fetchAllocatedAsset();	
		if(ast!=null)
		{
			return ast;
		}
		return null;
	}

	@Override
	public List<Asset> fetchUnallocatedAsset() {
		List<Asset> ast=impl.fetchUnallocatedAsset();	
		if(ast!=null)
		{
			return ast;
		}
		return null;
	}

	
}
