import java.sql.*;
import java.util.*;

public class ClientTopicOfStudyRecord{
	int ClientID, TopicID;
	public ClientTopicOfStudyRecord(int inputClientID, int inputTopicID){
		ClientID = inputClientID;
		TopicID = inputTopicID;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getTopicID(){
		return TopicID;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setTopicID(int newTopicID){
		TopicID = newTopicID;
	}
}