import java.sql.*;
import java.util.*;
//This creates the tables to be used by the database
public class TableCreator{
	public static main(String argv[]){
		String databaseName, databaseUsername, databasePassword;
		try(
			Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false"
				/*String containing where the database can be accessed*/,
				databaseUsername
				/*String containing username to access the database*/,
				databasePassword
				/*String containing password of the user to access the database*/);
			Statement statement = connection.createStatement();
			)
			{
				String[] creationStatements = ["CREATE TABLE `ReportRecords`(`ClientID` int,`ReportedClientID` int,`ReportDate` datetime,`ReportTime` datetime,`ReportTypeID` int,`ReportReason` varchar(100),`ReportEvidenceID` int);",
				"CREATE TABLE `ReportTypes`(`TypeID` int,`TypeName` varchar(50),`TypeDescription` varchar(200));",
				"CREATE TABLE `ReportEvidence`(`ReportEvidenceID` int,`EvidenceDescription` varchar(150));",
				"CREATE TABLE `ForumAdministrationRights`(`AdministrationRightsID` int,`ForumID` int,`CommentDeleteRight` boolean,`BanRight` boolean,`KickRight` boolean);",
				"CREATE TABLE `GivenForumAdministrationRights`(`ClientID` int,`ForumID` int,`AdministrationRightsID` int);",
				"CREATE TABLE `ForumPost`(`CreatorID` int,`PostContent` varchar(500),`ForumID` int);",
				"CREATE TABLE `Forums`(`ForumID` int,`ForumName` varchar(40),`ForumDescription` varchar(150));",
				"CREATE TABLE `ForumParticipation`(`ClientID` int,`ForumID` int);",
				"CREATE TABLE `ForumComments`(`ClientID` int,`PostID` int,`CommentContent` varchar(150),`CommentTime` datetime,`CommentDate` datetime);",
				"CREATE TABLE `GivenChatRoomAdministrationRights`(`ClientID` int,`ChatRoomID` int,`AdministrationRightsID` int);",
				"CREATE TABLE `ChatRoomAdministrationRights`(`AdministrationRightsID` int,`BanRight` boolean,`MuteRight` boolean,`KickRight` boolean);",
				"CREATE TABLE `GroupChatParticipation`(`ClientID` int,`GroupChatID` int);",
				"CREATE TABLE `GroupChats`(`GroupChatID` int,`GroupChatDescription` varchar(50),`GroupChatName` varchar(30),`GroupChatTypeID` int);",
				"CREATE TABLE `GroupChatTypes`(`GroupChatTypeID` int,`GroupChatTypeName` varchar(30));",
				"CREATE TABLE `ChatLogs`(`ChatLogID` int,`ChatRoomID` int,`StartDate` datetime,`StartTime` datetime,`EndDate` datetime,`EndTime` datetime,`ChatLogsContents` varchar(500));",
				"CREATE TABLE `Universities`(`UniversityID` int,`UniversityName` varchar(50));",
				"CREATE TABLE `TopicsOfStudy`(`TopicID` int,`TopicName` varchar(30));",
				"CREATE TABLE `HallsOfResidence`(`HallID` int,`HallName` varchar(30),`UniversityID` int);",
				"CREATE TABLE `TopicOfStudyRelations`(`TopicID` int,`RelatedTopicID` int);",
				"CREATE TABLE `Client`(`Client ID` int,`Forename` varchar(20),`Surname` varchar(20));",
				"CREATE TABLE `ClientUniversityAttendance`(`ClientID` int,`UniversityID` int,`StartDate` Datetime);",
				"CREATE TABLE `ClientTopicOfStudy`(`ClientID` int,`TopicID` int);",
				"CREATE TABLE `ClientsHallsFloor`(`ClientID` int,`FloorNumber` int);",
				"CREATE TABLE `ClientHallsRoom`(`ClientID` int,`RoomNumber` int);",
				"CREATE TABLE `ClientEmailAddress`(`ClientID` int,`EmailAddress` varchar(40));"];
				ResultSet resultSet;
				for(int i = 0; i < 25; i++){//Loop to execute all creation statements without going through the results returned
					resultSet = statement.executeQuery(creationStatements[i]);
				}		
			}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}