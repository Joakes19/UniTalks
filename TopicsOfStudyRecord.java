import java.sql.*;
import java.util.*;

public class TopicsOfStudyRecord{
	int TopicID;
	String TopicName;
	public TopicsOfStudyRecord(int inputTopicID, String inputTopicName){
		TopicID = inputTopicID;
		TopicName = inputTopicName;
	}
	
	public int getTopicID(){
		return TopicID;
	}
	
	public String getTopicName(){
		return TopicName;
	}
	
	public void setTopicID(int newTopicID){
		TopicID = newTopicID;
	}
	
	public void setTopicName(String newTopicName){
		TopicName = newTopicName;
	}
}