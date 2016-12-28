package query;

public class objectQuery {

	private String insertObjectInfo = "INSERT INTO ob VALUES (?,?,?,?)";
	private String SelectObjectInfo = "SELECT FROM ob WHERE numbers = ?";
	private String updateObjectInfo = "UPDATE ob SET object1 = ? WHERE numbers = ?";
	private String DeleteObjectInfo = "DELETE FROM Ob WHERE numbers  = ?";
	public String getupdateObjectInfo() {
		return updateObjectInfo;
	}
	
	public String getSelectObjectInfo() {
		return SelectObjectInfo;
	}
	
	public String getinsertObjectInfo() {
		return insertObjectInfo;
	}
	public String getDeleteObjectInfo() {
		return DeleteObjectInfo; 
	}
}
