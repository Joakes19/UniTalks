
public class Role{
	int roleID;//This mirrors the admin ID the administration rights email
	String roleName;//Name of the role e.g. COMP208 lecturer
	int groupID;//The group that the role pertains to e.g. the ID of the group.
	//This ID allows for control of both the group chat and forum from one role object
	
	public Role(int inputRoleID, String inputRoleName, int inputGroupID){
		roleID = inputRoleID;
		roleName = inputRoleName;
		groupID = inputGroupID;
	}
	
	public int getRoleID(){
		return roleID;
	}
	
	public String getRoleName(){
		return roleName;
	}
	
	public int getGroupID(){
		return groupID;
	}
	
	public void setRoleID(int newRoleID){
		roleID = newRoleID;
	}
	
	public void setRoleName(String newRoleName){
		roleName = newRoleName;
	}
	
	public void setGroupID(int newGroupID){
		groupID = newGroupID;
	}
}