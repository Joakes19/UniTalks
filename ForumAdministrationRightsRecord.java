import java.sql.*;
import java.util.*;

public class ForumAdministrationRightsRecord{
	int AdministrationRightsID, ForumID;
	boolean CommentDeleteRight, BanRight, KickRight;
	public ForumAdministrationRightsRecord(int inputAdministrationRightsID, int inputForumID, boolean inputCommentDeleteRight, boolean inputBanRight, boolean inputKickRight){
		AdministrationRightsID = inputAdministrationRightsID;
		ForumID = inputForumID;
		CommentDeleteRight = inputCommentDeleteRight;
		BanRight = inputBanRight;
		KickRight = inputKickRight;
	}
	
	public int getAdministrationRightsID(){
		return AdministrationRightsID;
	}
	
	public int getForumID(){
		return ForumID;
	}
	
	public boolean getCommentDeleteRight(){
		return CommentDeleteRight;
	}
	
	public boolean getBanRight(){
		return BanRight;
	}
	
	public boolean getKickRight(){
		return KickRight;
	}
	
	public void setAdministrationRightsID(int newAdministratioRightsID){
		AdministrationRightsID = newAdministratioRightsID;
	}
	
	public void setForumID(int newForumID){
		ForumID = newForumID;
	}
	
	public void setCommentDeleteRight(boolean newCommentDeleteRight){
		CommentDeleteRight = newCommentDeleteRight;
	}
	
	public void setBanRight(boolean newBanRight){
		BanRight = newBanRight;
	}
	
	public void setKickRight(boolean newKickRight){
		KickRight = newKickRight;
	}
}