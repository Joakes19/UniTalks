import java.sql.*;
import java.util.*;

public class GivenForumAdministrationRightsRecord{
	int ClientID, ForumID, AdministrationRightsID;
	public GivenForumAdministrationRightsRecord(int inputClientID, int inputForumID, int inputAdministrationRightsID){
		ClientID = inputClientID;
		ForumID = inputForumID;
		AdministrationRightsID = inputAdministrationRightsID;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getForumID(){
		return ForumID;
	}
	
	public int getAdministrationRightsID(){
		return AdministrationRightsID;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setForumID(int newForumID){
		ForumID = newForumID;
	}
	
	public void setAdministrationRightsID(int newAdministratioRightsID){
		AdministrationRightsID = newAdministratioRightsID;
	}
}