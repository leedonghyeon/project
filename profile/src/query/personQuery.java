package query;

public class personQuery {

	private String insertPersonInfo = "INSERT INTO Person(myname,birth,email,major,phone) VALUES (?,?,?,?,?)";
	private String SelectPersonInfoAboutMyname = "SELECT MYNAME,BIRTH,EMAIL,PHONE,MAJOR FROM PERSON WHERE MYNAME = ?";
	private String updatePersonBirth = "UPDATE Person SET BIRTH = ? WHERE MYNAME = ?";
	
	public String getUpdatePersonBirth() {
		return updatePersonBirth;
	}
	
	public String getSelectPersonInfoAboutMyname() {
		return SelectPersonInfoAboutMyname;
	}
	
	public String getInsertPersonInfo() {
		return insertPersonInfo;
	}
}
