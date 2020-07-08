package com.asset.dao;



import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.asset.dto.Asset;
import com.asset.dto.AssetRequest;
import com.asset.dto.Employee;
import com.asset.dto.User;
import com.asset.repository.URL;

public class AssetDAOJDBCimpl  implements AssetDAO{

	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	URL url=new URL();
	User u = null;                             
    AssetRequest ar=null;
    Asset ast=null;


	@Override
	public User login(String userName, String password, String usertype) {


		try {


			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);
			
			String sql = "select * from User where userName= ? AND  password=? AND  usertype=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			pstmt.setString(3, usertype);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				u=new User();
				
				u.setUserName(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setUsertype(rs.getString("usertype"));
				
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return u;
	}




	@Override
	public boolean createUser(User u) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);
			
			String query="insert into User values(?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,u.getUserId());
			pstmt.setString(2,u.getUserName());
			pstmt.setString(3,u.getPassword());
			pstmt.setString(4,u.getUsertype());


			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

		return false;
	}

	@Override
	public boolean updateUser(User u) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);

			String sql="update User set username=?,password=?,usertype=? where userid =?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1,u.getUserName());
			pstmt.setString(2,u.getPassword());
			pstmt.setString(3,u.getUsertype());
			pstmt.setInt(4,u.getUserId());
			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}


		return false;
	}


	@Override
	public boolean deleteUser(int userId) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);

			String sql="delete from User where userId=? ";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,userId);

			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public boolean addEmployee(Employee e) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);

			String query="insert into Employee values(?, ?, ?, ?, ?,?)";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, e.getEmpNo());
			pstmt.setString(2, e.getEname());
			pstmt.setString(3, e.getJob());
			pstmt.setInt(4, e.getMgr());
			pstmt.setDate(5, e.getHireDate());
			pstmt.setInt(6,e.getDeptId());
			

			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
		finally {

			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			}
		}

		return false;
	}

	@Override
	public boolean updateEmployee(Employee e) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);
			
			String sql="update employee set ename =?, job =?, mgr=?, deptId =?  where empNo =?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, e.getEname());
			pstmt.setString(2, e.getJob());
			pstmt.setInt(3, e.getMgr());
			pstmt.setInt(4, e.getDeptId());
			pstmt.setInt(5, e.getEmpNo());

			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
		finally {

			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			}
		}
		return false;
	}


	@Override
	public boolean deleteEmployee(int empNo) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);

			String sql="delete from Employee where empNo = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, empNo);

			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}


		catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public boolean createAsset(Asset a) {

		try {

			
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);
			
			String query="insert into Asset values(?,?,?,?,?)";

			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,a.getAssetId());
			pstmt.setString(2,a.getAssetName());
			pstmt.setString(3,a.getDes());
			pstmt.setInt(4,a.getQuantity());
			pstmt.setString(5,a.getStatus());

			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

		return false;
	}

	@Override
	public boolean updateAsset(Asset a) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con=DriverManager.getConnection(dburl);

			String sql="update Asset set assetName=?,quantity=?,status=? where assetId =?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1,a.getAssetName());
			pstmt.setInt(2,a.getQuantity());
			pstmt.setString(3,a.getStatus());
			pstmt.setInt(4,a.getAssetId());
			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteAsset(int assetId, String assetName) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con=DriverManager.getConnection(dburl);
			String sql="delete from Asset where assetId=? and assetName=? ";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,assetId);
			pstmt.setString(2, assetName);

			int count=pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

		return false;
	}

	public boolean requestAsset(AssetRequest r) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);

			String query = "insert into AssetRequest values(?,?,?,?,?)";
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1,r.getAllocationId());
			pstmt.setInt(2,r.getAssetId());
			pstmt.setInt(3,r.getEmpNo());
			pstmt.setDate(4, r.getAllocationDate());
			pstmt.setDate(5,r.getReleaseDate());

			int count = pstmt.executeUpdate();
			if (count > 0) 
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;

	}

	@Override
	public List<AssetRequest> fetchRequest() {
		List<AssetRequest> lst=new ArrayList<AssetRequest>();
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);



			stmt=con.createStatement();
			String query="select * from AssetRequest";
			rs=stmt.executeQuery(query);
			
			while(rs.next()) 
			{    
				AssetRequest ar=new AssetRequest();
				
				ar.setAllocationId(rs.getInt("AllocationId"));
				ar.setAssetId(rs.getInt("AssetId"));
				ar.setEmpNo(rs.getInt("Empno"));
				ar.setAllocationDate(rs.getDate("AllocationDate"));
				ar.setReleaseDate(rs.getDate("ReleaseDate"));
				
				lst.add(ar);
				
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) 
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) 
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lst;
	}

	




	@Override
	public List<Asset> fetchAllocatedAsset() {

		List<Asset> lst=new ArrayList<Asset>();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);


			stmt=con.createStatement();
			String query="select * from Asset where status='allocated'";
			rs=stmt.executeQuery(query);
			
			while(rs.next()) 
			{    
				Asset a=new Asset();
				a.setAssetId(rs.getInt("AssetId"));
				a.setAssetName(rs.getString("AssetName"));
				a.setDes(rs.getString("Des"));
				a.setQuantity(rs.getInt("Quantity"));
				a.setStatus(rs.getString("Status"));
				lst.add(a);
				return lst;
				
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			if(con!=null) 
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) 
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	



	
	
	@Override
	public List<Asset> statusRequest() {
		List<Asset> lst=new ArrayList<Asset>();
		
		Asset as = new Asset();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);

			

			stmt=con.createStatement();
			String query="select * from Asset ";
			rs=stmt.executeQuery(query);
			
			while(rs.next()) 
			{    
				Asset a=new Asset();
				a.setAssetId(rs.getInt("AssetId"));
				a.setAssetName(rs.getString("AssetName"));
				a.setDes(rs.getString("Des"));
				a.setQuantity(rs.getInt("Quantity"));
				a.setStatus(rs.getString("Status"));
				lst.add(a);
				
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) 
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) 
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lst;
	}


	
	
	
	

	@Override
	public List<Asset> fetchUnallocatedAsset() {
		List<Asset> lst=new ArrayList<Asset>();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Asset_Management?user=root&password=root";
			con =DriverManager.getConnection(dburl);



			stmt=con.createStatement();
			String query="select * from Asset where status='unallocated'";
			rs=stmt.executeQuery(query);
			
			while(rs.next()) 
			{    
				Asset a=new Asset();
				a.setAssetId(rs.getInt("AssetId"));
				a.setAssetName(rs.getString("AssetName"));
				a.setDes(rs.getString("Des"));
				a.setQuantity(rs.getInt("Quantity"));
				a.setStatus(rs.getString("Status"));
				lst.add(a);
				
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) 
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) 
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lst;
	}

	
}



	










