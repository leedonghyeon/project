package test;

import java.sql.Connection;
import java.sql.ResultSet;


import DBControl.objectControl;
//import DBcontrol.SelectUpdate;

//import DBcontrol.SelectPerson;
import connect.OracleConnect;
import model.ob;
public class Object_test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleConnect oraConn = new OracleConnect();
		
		Connection conn = oraConn.connect();
		
		if ( conn != null) System.out.println("Oracle Connect Success");
		else System.out.println("Oracle Connect Fail");
		
		ob obj = new ob();
		objectControl is = new objectControl();
		
		
		obj.setObject1("");
		obj.setObject2("");
		obj.setObject3("");
		obj.setNumbers(5);
		
		objectControl de = new objectControl();
		de.DeleteObjectInfo(conn, 4);
		
		objectControl ins = new objectControl();
		ins.insertObjectInfo(conn, 5, "aa");
		
	}

}	
