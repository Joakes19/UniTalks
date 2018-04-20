import java.sql.*;

//Classes
//Base class
//Database class, contains base connection to server that all these classes need
public class Database{//Base class that sets up the connection to the database
	//Set up connection to database, set any constants needed for using the database
	//Note - This database class is not meant to be initialised but creates the connection with the database that is needed to read and write tables
	try(
		Connection connection = DriverManager.getConnection{
			/*String containing where the database can be accessed*/,
			/*String containing username to access the database*/,
			/*String containing password of the user to access the database*/);
		Statement statement = connection.createStatement();
		)
		{
			pass;
		}
	catch(SQLException ex) {
         ex.printStackTrace();
      }
	
	//Possibly create a re connect function to re start the connection to the database if needed
}
//The readers and writers read and write the database, seperating these can help seperate read and write permissions
public class DatabaseReader implements Database{//Reads from database, but no specific table 
	//Create base statements for reading from the database, for example reading from certain tables, selecting different types of data etc.
	String readStatement = "select * from ";//Add table name onto the end
	//NOTE ABOUT DATABASE READERS
	//Make routines to read all information from the database, with no specific entry types being targeted, this is subject to change but a good starting point
}

public class DatabaseWriter implements Database(//Writes to database, but no specific table
	//Create base statements for writing to the database, similar to those in the reader
	String writeStatement = ;//Statement that is going to executed on the database to write the data to the database
)
/*Client readers and writers
The tables these will access:
Client – Forename, Surname, ClientID
ClientUniversityAttendance – ClientID, UniversityID, StartDate
ClientTopicOfStudy – ClientID, TopicID
ClientHallsFloor – ClientID, FloorNumber
ClientHallsRoom – ClientID, RoomNumber
ClientEmailAddress – ClientID, EmailAddress
*/
public class ClientReader implements DatabaseReader{//Reads all information pertaining to clients in the system
	/*Modify all generic reader statements to only access the client table 
	So I can create either several different functions, one for each possible circumstance that the table may need to be read
	OR
	I can create functions which input all pieces that go into the various statements that will be fed into the database to be executed, this would require various 
	*/
}

public class ClientWriter implements DatabaseWriter{//Writes all information pertaining to clients in the system
	/*
	GENERIC WRITE STATEMENT FORMAT:
	Modify the statements to create the SQL statment accordingly
	Plug this statement into the database
	*/
	void writeClient(String forename, String surname){//ID not required as this will be incremented upon creation in database (this may be subject to change)
		
	}
	
	void writeClientUniversityAttendance(){
		
	}
	
	void writeClientTopicsOfStudy(){
		
	}
	
	void writeClientHallsFloor(int floorNumber){
		
	}
	
	void writeClientHallsRoom(int roomNumber){
		
	}
	
	void writeClientEmailAddress(String email){
		
	}
}
/*University information readers and writers
The tables these will access:
Topics of Study – TopicID, TopicName
Halls of residence – HallID, HallName, UniversityID
TopicOfStudyRelations – TopicID, RelatedTopicID
*/
public class UniversityReader implements DatabaseReader{//Reads all information about universities in the system
	
}

public class UniversityWriter implements DatabaseWriter{//Writes all information about universities in the system
	void writeTopicOfStudy(String TopicName){
		
	}
	
	void writeHallsOfResidence(String HallName){
		
	}
	
	void writeTopicOfStudyRelations(int topicID, int relatedTopicID){
		
	}
}
/*Chat rooms readers and writers
The tables these will access:
GivenChatRoomAdministrationRights – ClientID, ChatRoomID, AdministrationRightsID
ChatRoomAdministrationRights – AdministrationRightsID, BanRight, MuteRight, KickRight
GroupChatParticipation – ClientID, GroupChatID
GroupChats – GroupChatID, GroupChatDescription, GroupChatName, GroupChatTypeID
GroupChatTypes – GroupChatTypeID, GroupChatTypeName
ChatLogs – ChatLogID, ChatRoomID, StartDate, StartTime, EndDate, EndTime, ChatLogContents
*/
public class ChatRoomReader implements DatabaseReader{//Reads all information about chat rooms in the system
	
}

public class ChatRoomWriter implements DatabaseWriter{//Writes all information about chat rooms in the system
	void writeGivenChatRoomAdministrationRights(int ClientID, int ChatRoomID, int AdministractionRightsID){
		
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
/*Forum readers and writers
The tables these will access:
ForumAdministrationRights – AdministrationRightsID, ForumID, CommentDeleteRight, BanRight, KickRight
GivenForumAdministrationRights – ClientID, ForumID, AdministrationRightsID
ForumPost – CreatorID, PostContent, ForumID
Forums – ForumID, ForumName, ForumDescription
ForumParticipation – ClientID, ForumID
ForumComments – ClientID, PostID, CommentContent, CommentTime, CommentDate
*/
public class ForumReader implements DatabaseReader{//Reads all information about forums in the system
	
}

public class ForumWriter implements DatabaseWriter{//Writes all information about forums in the system
	void writeForumAdministrationRights(int forumID, boolean commentDeleteRight, boolean banRight, boolean kickRight){
		
	}
	
	void writeGivenForumAdministrationRights(int clientID, int forumID, int administrationRightsID){
		
	}
	
	void writeForumPost(int creatorID, String postContnet, int forumID){
		
	}
	
	void writeForums(String forumName, String forumDescription){
		
	}
	
	void writeForumParticipation(int clientID, int forumID){
		
	}
	
	void writeForumComments(int clientID, int postID, String commentContent, int commentTIme, int commentDate){
		
	}
}
/*Report readers and writers
The tables these will access:
ReportRecords – ClientID, ReportedClientID, ReportDate, ReportTime, ReportType, ReportReason, ReportEvidenceID
ReportEvidence – ReportEvidenceID, EvidenceDescription
*/
public class ReportReader implements DatabaseReader{//Reads all information about reports in the system
	
}

public class ReportWriter implements DatabaseWriter{//Writes all information about reports in the system
	void writeReportRecords(int cleintID,int reportedClientID, int reportDate, int reportTime, int reportType, String reportReason,int reportEvidenceID){
		
	}
	
	void writeReportEvidence(String evidenceDescription){
		
	}
}