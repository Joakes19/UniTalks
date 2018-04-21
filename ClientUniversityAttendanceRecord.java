import java.sql.*;
import java.util.*;

public class ClientUniversityAttendanceRecord{
	int ClientID, UniversityID;
	Date StartDate;
	public ClientUniversityAttendanceRecord(int inputClientID, int inputUniversityID, Date inputStartDate){
		ClientID = inputClientID;
		UniversityID = inputUniversityID;
		StartDate = inputStartDate;
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