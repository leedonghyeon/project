package test;

import java.sql.Connection;
import java.sql.ResultSet;

import DBControl.personControl;
import connect.OracleConnect;
import model.person;
public class Person_test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleConnect oraConn = new OracleConnect();
		
		Connection conn = oraConn.connect();
		
		if ( conn != null) System.out.println("Oracle Connect Success");
		else System.out.println("Oracle Connect Fail");
		
		
		person prof = new person();
		personControl is = new personControl();
		
		prof.setBirth("a");
		prof.setMyname("b");
		prof.setEmail("c");
		prof.setMajor("d");
		prof.setPhone("e");
		
		is.insertPersonInfo(conn, prof);
		
//		SelectUpdate ud = new SelectUpdate();
//		ud.updatePersonBirth(conn,"1992년 2월2일", "june");
//	
		
//		profile pf =new profile();
//		pf.setMyname("june");
//		System.out.println(pf.getMyname());
//		pf.setBirth("1992년1월1일");
//		System.out.println(pf.getBirth());
//		
		
	}

}
