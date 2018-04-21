import java.sql.*;
import java.util.*;

public class TopicOfStudyRelationsRecord{
	int TopicID, RelatedTopicID;
	public TopicOfStudyRelationsRecord(int inputTopicID, int inputRelatedTopicID){
		TopicID = inputTopicID;
		RelatedTopicID = inputTopicID;
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