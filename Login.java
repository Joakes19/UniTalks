
public class Login{
	String userPassword;
	String loginUserID;//The username the user uses to login
	
	public Login(String inputUserPassword, String inputUserID){
		userPassword = inputUserPassword;
		loginUserID = inputUserID;
	}
	
	public String getUserPassword(){
		return userPassword;
	}
	
	public String getLoginUserID(){
		return loginUserID;
	}
	
	public void setUserPassword(String newUserPassword){
		userPassword = newUserPassword;
	}
	
	public void setUserID(String newUserID){
		loginUserID = newUserID;
	}
}