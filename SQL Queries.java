import java.sql.*;
import java.util.*;

//Additional misc. classes

//Classes
//Base class
//Database class, contains base connection to server that all these classes need

//The readers and writers read and write the database, seperating these can help seperate read and write permissions

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

//Client reader and writers

/*University information readers and writers
The tables these will access:
Topics of Study – TopicID, TopicName
Halls of residence – HallID, HallName, UniversityID
TopicOfStudyRelations – TopicID, RelatedTopicID
*/
//Creation of object classes for each entry in each table for this section

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

/*Report readers and writers
The tables these will access:
ReportRecords – ClientID, ReportedClientID, ReportDate, ReportTime, ReportType, ReportReason, ReportEvidenceID
ReportEvidence – ReportEvidenceID, EvidenceDescription
*/