import java.sql.*;
import java.util.*;

public class ChatRoomWriter extends DatabaseWriter{//Writes all information about chat rooms in the system
	void writeGivenChatRoomAdministrationRights(int ClientID, int ChatRoomID, int AdministrationRightsID){
		
	}
	
	void writeChatRoomAdministrationRights(boolean banRight,boolean muteRight,boolean kickRight){
		
	}
	
	void writeGroupChatParticipation(int clientID, int groupChatID){
		
	}
	
	void writeGroupChats(String groupChatDescription,String groupChatName, int groupChatTypeID){
		
	}
	
	void writeGroupChatTypes(String GroupChatTypeName){
		
	}
	
	void writeChatLogs(int chatRoomID, int startDate, int startTime, int endDate, int endTime, String chatLogContents){
		
	}
}