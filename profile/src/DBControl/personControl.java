package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import query.personQuery;
import model.person;

public class personControl {
	
	personQuery person = new personQuery();

	public void insertPersonInfo(Connection conn,person prof){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{

			pstmt = conn.prepareStatement(person.getInsertPersonInfo());
			
			pstmt.setString(1, prof.getBirth() );
			pstmt.setString(2, prof.getMyname());
			pstmt.setString(3, prof.getEmail());
			pstmt.setString(4, prof.getMajor());
			pstmt.setString(5, prof.getPhone());
			
			System.out.println("name : " + prof.getMyname() + "\t birth : " + prof.getBirth()+ "\t email : " + prof.getEmail() + "\t major : " + prof.getMajor() + "\t phone : " + prof.getPhone() );
			
			pstmt.executeUpdate();
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Insert End");
		}
		
	}
	
	public ResultSet SelectPersonInfoAboutMyname(Connection conn, String myname){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
		pstmt = conn.prepareStatement(person.getSelectPersonInfoAboutMyname());
		
		pstmt.setString(1, myname); // input value
		
		rs = pstmt.executeQuery(); // query
		
		while(rs.next()){

			String birth = rs.getString("birth");
			String Myname = rs.getString("myname");
			
			System.out.println("\t birth : " +birth +"\t myname : " + myname );
		}
		
		}catch(Exception e){
		}
		return rs;
	}
	
	public void updatePersonBirth(Connection conn,String birth,String myname){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(person.getUpdatePersonBirth());
			
			pstmt.setString(1, birth);
			pstmt.setString(2, myname);
			System.out.println("birth : " + birth + "\t myname : " + myname );
			
			pstmt.executeUpdate();
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Update End");
		}
		
	}
}
