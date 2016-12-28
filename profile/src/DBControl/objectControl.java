package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import query.objectQuery;
import query.personQuery;
import model.ob;
import model.person;

public class objectControl {
	
	objectQuery objQry = new objectQuery();
	
	
	public void selectObjectInfo(Connection conn,ob obj){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{

			pstmt = conn.prepareStatement(objQry.getinsertObjectInfo());
			
			pstmt.setString(1, obj.getObject1());
			pstmt.setString(2, obj.getObject2());
			pstmt.setString(3, obj.getObject3());
			pstmt.setInt(4, obj.getNumbers());

			
			System.out.println("object1 : " + obj.getObject1() + "\t object2 : " + obj.getObject2()+ "\t object3 : " + obj.getObject3()+"numbers : " + obj.getNumbers());
			
			pstmt.executeUpdate();
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Insert End");
		}
	}
	
	public void insertObjectInfo(Connection conn,int numbers,String object1){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{

			pstmt = conn.prepareStatement(objQry.getinsertObjectInfo());
			
			pstmt.setInt(1, numbers);
			pstmt.setString(2, object1);

			System.out.println("numbers : " + numbers + "\t object1 : " + object1);
			
			pstmt.executeUpdate();
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Insert End");
		}
		
	}
		
	
	
	public void updateObjectInfo(Connection conn,ob obj){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(objQry.getupdateObjectInfo());
			
			pstmt.setString(1, obj.getObject1());
			pstmt.setInt(4, obj.getNumbers());
	
			System.out.println("object1 : " + obj.getObject1() + "\t numbers : " + obj.getNumbers());
			
			pstmt.executeUpdate();
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Update End");
		}
		
	}
	public void DeleteObjectInfo(Connection conn,int numbers){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(objQry.getDeleteObjectInfo());
			
			
			pstmt.setInt(1, numbers);

			System.out.println("delete numbers : " + numbers  );
			
			pstmt.executeUpdate();
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Delete End");
		}
	}
}