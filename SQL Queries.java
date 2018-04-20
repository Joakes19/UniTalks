import java.sql.*;

//Additional misc. classes
public class Date(int inputYear, int inputMonth, int inputDay){
	public static void main(String argv[]){
		int Year = inputYear;
		int Month = inputMonth;
		int Day = inputDay;
	}
	
	public int getYear(){
		return Year;
	}
	
	public int getMonth(){
		return Month;
	}
	
	public int getDay(){
		return Day;
	}
	
	public void setYear(int newYear){
		Year = newYear;
	}
	
	public void setMonth(int newMonth){
		Month = newMonth;
	}
	
	public void setDay(int newDay){
		Day = newDay;
	}
}

public class Time(int inputHour, int inputMinute, int inputSecond){
	public static void main(String argv[]){
		int Hour = inputHour;
		int Minute = inputMinute;
		int Second = inputSecond;
	}
	
	public int getHour(){
		return Hour;
	}
	
	public int getMinute(){
		return Minute;
	}
	
	public int getSecond(){
		return Second;
	}
	
	public void setHour(int newHour){
		Hour = newHour;
	}
	
	public void setMinute(int newMinute){
		Minute = newMinute;
	}
	
	public void setSecond(int newSecond){
		Second = newSecond;
	}
}

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
//Creation of object classes for each entry in each table for this section

public class ClientRecord(String inputForename, String inputSurname, int inputClientID){
	public static void main(String argv[]){
		String Forename = inputForname;
		String Surname = inputSurname;
		int ClientID = inputClientID;
	}
	
	public String getForename(){
		return Forename;
	}
	
	public String getSurname(){
		return Surname;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public void setForename(String newForename){
		Forename = newForename;
	}
	
	public void setSurname(String newSurname){
		Surname = newSurname;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
}

public class ClientUniversityAttendanceRecord(int inputClientID, int inputUniversityID, Date inputStartDate){
	public static void main(String argv[]){
		int ClientID = inputClientID;
		int UniversityID = inputUniversityID;
		Date StartDate = inputStartDate;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getUniversityID(){
		return UniversityID;
	}
	
	public int getStartDate(){
		return StartDate;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setUniversityID(int newUniversityID){
		UniversityID = newUniversityID;
	}
	
	public void setStartDate(Date newStartDate){
		StartDate = newStartDate;
	}
}

public class ClientTopicOfStudyRecord(int inputClientID, int inputTopicID){
	public static void main(String argv[]){
		int ClientID = inputClientID;
		int TopicID = inputTopicID;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getFloorNumber(){
		return FloorNumber;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setFloorNumber(int newFloorNumber){
		FloorNumber = newFloorNumber;
	}
}

public class ClientHallsFloorRecord(int inputClientID, int inputFloorNumber){
	public static void main(String argv[]){
		int ClientID = inputClientID;
		int FloorNumber = inputFloorNumber;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getFloorNumber(){
		return FloorNumber;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setFloorNumber(int newFloorNumber){
		FloorNumber = newFloorNumber;
	}
}

public class ClientHallsRoomRecord(int inputClientID, int inputRoomNumber){
	public static void main(String argv[]){
		int ClientID = inputClientID;
		int RoomNumber = inputRoomNumber;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getRoomNumber(){
		return RoomNumner;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setRoomNumber(int newRoomNumber){
		RoomNumber = newRoomNumber;
	}
}

public class ClientEmailAddressRecord(int inputClientID, String inputEmailAddress){
	public static void main(String argv[]){
		int ClientID = inputClientID;
		String EmailAddress = inputEmailAddress;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public String getEmailAddress(){
		return EmailAddress;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setEmailAddress(String newEmailAddress){
		EmailAddress = newEmailAddress;
	}
}

//Client reader and writers
public class ClientReader implements DatabaseReader{//Reads all information pertaining to clients in the system
	/*Modify all generic reader statements to only access the client table 
	So I will create several different functions, one for each possible circumstance that the table may need to be read
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
//Creation of object classes for each entry in each table for this section

public class TopicsOfStudyRecord(int inputTopicID, String inputTopicName){
	public static void main(String argv[]){
		int TopicID = inputTopicID;
		String TopicName = inputTopicName;
	}
	
	public int getTopicID(){
		return TopicID;
	}
	
	public int getTopicName(){
		return TopicName;
	}
	
	public void setTopicID(int newTopicID){
		TopicID = newTopicID;
	}
	
	public void setTopicName(String newTopicName){
		TopicName = newTopicName;
	}
}

public class HallsOfResidenceRecord(int inputHallID, String inputHallName, int inputUniversityID){
	public static void main(String argv[]){
		int HallID = inputHallID;
		String HallName = inputHallName;
		int UniversityID = inputUniversityID;
	}
	
	public int getHallID(){
		return HallID;
	}
	
	public String getHallName(){
		return HallName;
	}
	
	public int getUniversityID(){
		return UniversityID;
	}
	
	public void setHallID(int newHallID){
		HallID = newHallID;
	}
	
	public void setHallName(String newHallName){
		HallName = newHallName;
	}
	
	public void setUniversityID(int newUniversityID){
		UniversityID = newUniversityID;
	}
}

public class TopicOfStudyRelationsRecord(int inputTopicID, int inputRelatedTopicID){
	public static void main(String argv[]){
		int TopicID = inputTopicID;
		int RelatedTopicID = inputTopicID;
	}
	
	public int getTopicID(){
		return TopicID;
	}
	
	public int getRelatedTopicID(){
		return RelatedTopicID;
	}
	
	public void setTopicID(int newTopicID){
		TopicID = newTopicID;
	}
	
	public void setRelatedTopicID(int newRelatedTopicID){
		RelatedTopicID = newRelatedTopicID;
	}
}

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
//Creation of object classes for each entry in each table for this section

public class GivenChatRoomAdministrationRightsRecord(int inputClientID, int inputChatRoomID, int inputAdministrationRightsID){
	public static void main(String argv[]){
		int ClientID = inputClientID;
		int ChatRoomID = inputChatRoomID;
		int AdministractionRightsID = inputAdministataionRightsID;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getChatRoomID(){
		return ChatRoomID;
	}
	
	public int getAdministrationRightsID(){
		return AdministractionRightsID;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setChatRoomID(int newChatRoomID){
		ChatRoomID = newChatRoomID;
	}
	
	public void setAdministrationRightsID(int newAdministratioRightsID){
		AdministractionRightsID = newAdministratioRightsID;
	}
}

public class ChatRoomAdministrationRightsRecord(int inputAdministataionRightsID, boolean inputBanRight, boolean inputMuteRight, boolean inputKickRight){
	public static void main(String argv[]){
		int AdministrationRightsID = inputAdministrationRightsID;
		boolean BanRight = inputBanRight;
		boolean MuteRight = inputMuteRight;
		boolean KickRight = inputKickRight;
	}
	
	public int getAdministrationRightsID(){
		return AdministrationRightsID;
	}
	
	public boolean getBanRight(){
		return BanRight;
	}
	
	public boolean getMuteRight(){
		return MuteRight;
	}
	
	public boolean getKickRight(){
		return KickRight;
	}
	
	public void setAdministrationRightsID(int newAdministrationRightsID){
		AdministrationRightsID = newAdministratioRightsID;
	}
	
	public void setBanRight(boolean newBanRight){
		BanRight = newBanRight;
	}
	
	public void setMuteRight(boolean newMuteRight){
		MuteRight = newMuteRight;
	}
	
	public void setKickRight(boolean newKickRight){
		KickRight = newKickRight;
	}
}

public class GroupChatParticipationRecord(int inputClientID, int inputGroupChatID){
	public static void(String argv[]){
		int ClientID = inputClientID;
		int GroupChatID = inputGroupChatID;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getGroupChatID(){
		return GroupChatID;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setGroupChatID(int newGroupChatID){
		GroupChatID = newGroupChatID;
	}
}

public class GroupChatsRecord(int inputGroupChatID, String inputGroupChatDescription, String inputGroupChatName, int inputGroupChatTypeID){
	public static void main(String argv[]){
		int GroupChatID = inputGroupChatID;
		String GroupChatDescription = inputGroupChatDescription;
		String GroupChatName = inputGroupChatName;
		int GroupChatTypeID = inputGroupChatTypeID;
	}
	
	public int getGroupChatID(){
		return GroupChatID;
	}
	
	public String getGroupChatDescription(){
		return GroupChatDescription;
	}
	
	public String getGroupChatName(){
		return GroupChatName;
	}
	
	public int getGroupChatTypeID(){
		return GroupChatTypeID;
	}
	
	public void setGroupChatID(int newGroupChatID){
		GroupChatID = newGroupChatID;
	}
	
	public void setGroupChatDescription(String newGroupChatDescription){
		GroupChatDescription = newGroupChatDescription;
	}
	
	public void setGroupChatName(String newGroupChatName){
		GroupChatName = newgroupChatName;
	}
	
	public void setGroupChatTypeID(int newGroupChatTypeID){
		GroupChatTypeID = newGroupChatTypeID;
	}
}	

public class GroupChatTypesRecord(int inputGroupChatTypeID, String inputGroupChatTypeName){
	public static void main(String argv[]){
		int GroupChatTypeID = inputGroupChatTypeID;
		String GroupChatTypeName = inputGroupChatTypeName;
	}
	
	public int getGroupChatTypeID(){
		return GroupChatTypeID;
	}
	
	public int getGroupChatTypeName(){
		return GroupChatTypeID;
	}
	
	public void setGroupChatTypeID(int newGroupChatTypeID){
		GroupChatTypeID = newGroupChatTypeID;
	}
	
	public void setGroupChatTypeName(int newGroupChatTypeName){
		GroupChatTypeName = newGroupChatTypeName;
	}
}

public class ChatLogsRecord(int inputChatLogID, int inputChatRoomID, Date inputStartDate, Time StartTime, Date EndDate, Time EndTime, String ChatLogContents){
	public static void main(String argv[]){
		int ChatLogID = inputChatLogID;
		int ChatRoomID = inputChatRoomID;
		Date StartDate = inputStartDate;
		Time StartTime = inputStartTime;
		Date EndDate = inputEndDate;
		Time EndTime = inputEndTime;
		String ChatLogContents = inputChatLogContents;
	}
	
	public int getChatLogID(){
		return ChatLogID;
	}
	
	public int getChatRoomID(){
		return ChatRoomID;
	}
	
	public Date getStartDate(){
		return StartDate;
	}
	
	public Time getStartTime(){
		return StartTime;
	}
	
	public Date getEndDate(){
		return EndDate;
	}
	
	public Time getEndTime(){
		return EndTime;
	}
	
	public String getChatLogContents(){
		return ChatLogContents;
	}
	
	public void setChatLogID(int newChatLogID){
		ChatLogID = newChatLogID;
	}
	
	public void setChatRoomID(int newChatRoomID){
		ChatRoomID = newChatRoomID;
	}
	
	public void setStartDate(Date newStartDate){
		StartDate = newStartDate;
	}
	
	public void setStartTime(Time newStartTime){
		StartTime = newStartTime;
	}
	
	public void setEndDate(Date newEndDate){
		EndDate = newEndDate;
	}
	
	public void setEndTime(Time newEndTime){
		EndTime = newEndTime;
	}
}

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
//Creation of object classes for each entry in each table for this section



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