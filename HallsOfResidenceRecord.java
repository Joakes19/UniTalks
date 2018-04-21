import java.sql.*;
import java.util.*;

public class HallsOfResidenceRecord{
	int HallID, UniversityID;
	String HallName;
	public HallsOfResidenceRecord(int inputHallID, String inputHallName, int inputUniversityID){
		HallID = inputHallID;
		HallName = inputHallName;
		UniversityID = inputUniversityID;
	}
	
	public int getHallID(){
		return HallID;
	}
	
	public String getHallName(){
		return HallName;
	}
	
	public int getUniversityID(){
		return UniversityID;
	}
	
	public void setHallID(int newHallID){
		HallID = newHallID;
	}
	
	public void setHallName(String newHallName){
		HallName = newHallName;
	}
	
	public void setUniversityID(int newUniversityID){
		UniversityID = newUniversityID;
	}
}