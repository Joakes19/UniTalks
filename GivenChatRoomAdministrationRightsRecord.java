import java.sql.*;
import java.util.*;

public class GivenChatRoomAdministrationRightsRecord{
	int ClientID, ChatRoomID, AdministrationRightsID;
	public GivenChatRoomAdministrationRightsRecord(int inputClientID, int inputChatRoomID, int inputAdministrationRightsID){
		ClientID = inputClientID;
		ChatRoomID = inputChatRoomID;
		AdministrationRightsID = inputAdministrationRightsID;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getChatRoomID(){
		return ChatRoomID;
	}
	
	public int getAdministrationRightsID(){
		return AdministrationRightsID;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setChatRoomID(int newChatRoomID){
		ChatRoomID = newChatRoomID;
	}
	
	public void setAdministrationRightsID(int newAdministratioRightsID){
		AdministrationRightsID = newAdministratioRightsID;
	}
}