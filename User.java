
public class User{
	String userName, userAddress, userEmail;
	int userID;
	Login userLogin;
	ArrayList<Role> roles;
	
	public User(String inputUserName, String inputUserAddress, String inputUserEmail, int inputUserID, Login inputUserLogin, ArrayList<Role> inputRoles){
		userName = inputUserName;
		userAddress = inputUserAddress;
		userEmail = inputUserEmail;
		userID = inputUserID;
		userLogin = inputUserLogin;
		roles = inputRoles;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getUserAddress(){
		return userAddress;
	}
	
	public String getUserEmail(){
		return userEmail;
	}
	
	public int getUserID(){
		return userID;
	}
	
	public ArrayList<Role> getRoles(){
		return roles;
	}
	
	public void setUserName(String newUserName){
		userName = newUserName;
	}
	
	public void setUserAddress(String newUserAddress){
		userAddress = newUserAddress;
	}
	
	public void setUserEmail(String newUserEmail){
		userEmail = newUserEmail;
	}
	
	public void setUserID(int newUserID){
		userID = newUserID;
	}
	
	public void setRoles(ArrayList<Role> newRoles){
		roles = newRoles;
	}
}