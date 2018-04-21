import java.sql.*;
import java.util.*;

public class ClientHallsFloorRecord{
	int ClientID, FloorNumber;
	public ClientHallsFloorRecord(int inputClientID, int inputFloorNumber){
		ClientID = inputClientID;
		FloorNumber = inputFloorNumber;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getFloorNumber(){
		return FloorNumber;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setFloorNumber(int newFloorNumber){
		FloorNumber = newFloorNumber;
	}
}