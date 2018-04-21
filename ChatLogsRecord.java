import java.sql.*;
import java.util.*;

public class ChatLogsRecord{
	int ChatLogID, ChatRoomID;
	Date StartDate, StartTime, EndDate, EndTime;
	String ChatLogContents;
	public ChatLogsRecord(int inputChatLogID, int inputChatRoomID, Date inputStartDate, Time inputStartTime, Date inputEndDate, Time inputEndTime, String inputChatLogContents){
		ChatLogID = inputChatLogID;
		ChatRoomID = inputChatRoomID;
		StartDate = inputStartDate;
		StartTime = inputStartTime;
		EndDate = inputEndDate;
		EndTime = inputEndTime;
		ChatLogContents = inputChatLogContents;
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