import java.sql.*;
import java.util.*;

public class ForumWriter extends DatabaseWriter{//Writes all information about forums in the system
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