import java.sql.*;
import java.util.*;

public class ClientReader extends DatabaseReader{//Reads all information pertaining to clients in the system
	/*Modify all generic reader statements to only access the client table 
	So I will create several different functions, one for each possible circumstance that the table may need to be read
	*/
	//Function to read the Client table
	public ArrayList<ClientRecord> readClient(){
		ArrayList<ClientRecord> records = new ArrayList<ClientRecord>();
		String query = "select * from Client";
		ResultSet resultSet = executeQuery(query);
		
		while(resultSet.next()){
			String forename = resultSet.getString("Forename");
			String surname = resultSet.getString("Surname");
			int clientID = resultSet.getInt("ClientID");
			ClientRecord currentRecord = new ClientRecord(forename, surname, clientID);
			records.add(currentRecord);
		}
		/*
		Get the records from the database, store them in ClientRecord instances and add them to the 
		records array list
		*/
		return records;
	}
	
	//Function to read the ClientUniversityAttendanceTable
	public ArrayList<ClientUniversityAttendanceRecord> readClientUniversityAttendance(){
		ArrayList<ClientUniversityAttendanceRecord> records = new ArrayList<ClientUniversityAttendanceRecord>();
		String query = "select * from ClientUniversityAttendance";
		ResultSet resultSet = executeQuery(query);
		
		while(resultSet.next()){
			int clientID = resultSet.getInt("ClientID");
			int universityID = resultSet.getInt("UniversityID");
			Date startDate = resultSet.getDate("StartDate");
			ClientUniversityAttendanceRecord currentRecord = ClientUniversityAttendanceRecord(clientID, universityID, StartDate);
			records.add(currentRecord);
		}
		/*
		Get the records from the database, store them in ClientRecord instances and add them to the 
		records array list
		*/
		return records;
	}
	
	//Function to read the client topic of study table
	public ArrayList<ClientTopicOfStudyRecord> readClientTopicOfStudy(){
		ArrayList<ClientTopicOfStudyRecord> records = new ArrayList<ClientTopicOfStudyRecord>();
		String query = "select * from ClientTopicOfStudy";
		ResultSet resultSet = executeQuery(query);
		
		while(resultSet.next()){
			int clientID = resultSet.getInt("ClientID");
			int topicID = resultSet.getInt("TopicID");
			ClientTopicOfStudyRecord currentRecord = new ClientTopicOfStudyRecord(clientID, topicID);
			records.add(currentRecord);
		}
		/*
		Get the records from the database, store them in ClientRecord instances and add them to the 
		records array list
		*/
		return records;
	}
	
	//Function to read the client halls floor table
	public ArrayList<ClientHallsFloorRecord> readClientHallsFloor(){
		ArrayList<ClientHallsFloorRecord> records = new ArrayList<ClientHallsFloorRecord>();
		String query = "select * from ClientHallsFloor";
		ResultSet resultSet = executeQuery(query);
		
		while(resultSet.next()){
			int clientID = resultSet.getInt("ClientID");
			int floorNumber = resultSet.getInt("FloorNumber");
			ClientHallsFloorRecord currentRecord = new ClientHallsFloorRecord(clientID, floorNumber);
			records.add(currentRecord);
		}
		/*
		Get the records from the database, store them in ClientRecord instances and add them to the 
		records array list
		*/
		return records;
	}
	
	//Function to read the client halls room table
	public ArrayList<ClientHallsRoomRecord> readClientHallsRoom(){
		ArrayList<ClientHallsRoomRecord> records = new ArrayList<ClientHallsRoomRecord>();
		String query = "select * from ClientHallsRoom";
		ResultSet resultSet = executeQuery(query);
		
		while(resultSet.next()){
			int clientID = resultSet.getInt("ClientID");
			int roomNumber = resultSet.getInt("RoomNumber");
			ClientHallsRoomRecord currentRecord = new ClientHallsRoomRecord(clientID, roomNumber);
			records.add(currentRecord);
		}
		/*
		Get the records from the database, store them in ClientRecord instances and add them to the 
		records array list
		*/
		return records;
	}
	
	//Function to read the client email address table
	public ArrayList<ClientEmailAddressRecord> readClientEmailAddressRecord(){
		ArrayList<ClientEmailAddressRecord> records = new ArrayList<ClientEmailAddressRecord>();
		String query = "select * from ClientEmailAddress";
		ResultSet resultSet = executeQuery(query);
		
		while(resultSet.next()){
			int clientID = resultSet.getInt("ClientID");
			String emailAddress = resultSet.getString("EmailAddress");
			ClientEmailAddressRecord currentRecord = new ClientEmailAddressRecord(clientID, emailAddress);
			records.add(currentRecord);
		}
		/*
		Get the records from the database, store them in ClientRecord instances and add them to the 
		records array list
		*/
		return records;
	}
}