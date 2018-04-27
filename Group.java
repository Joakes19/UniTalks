
public class Group{
	int groupID;
	String groupName;
	ArrayList<int> userIDs;
	GroupType groupType;
	
	public Group(int inputGroupID, String inputGroupName, ArrayList<int> inputUserIDs, GroupType inputGroupType){
		groupID = inputGroupID;
		groupName = inputGroupName;
		userIDs = inputUserIDs;
		groupType = inputGroupType;
	}
	
	public ArrayList<int> getMemberIDs(){
		return userIDs;
	}
	
	public int getGroupID(){
		return groupID;
	}
	
	public String getGroupName(){
		return groupName;
	}
	
	public GroupType getGroupType(){
		return groupType;
	}
	
	public void setMembers(ArrayList<int> newUserIDs){
		userIDs = newUserIDs;
	}
	
	public void setGroupID(int newGroupID){
		groupID = newGroupID;
	}
	
	public void setGroupName(String newGroupName){
		groupName = newGroupName;
	}
	
	public void setGroupType(GroupType newGroupType){
		groupType = newGroupType;
	}
}