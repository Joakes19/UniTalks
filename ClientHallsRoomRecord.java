import java.sql.*;
import java.util.*;

public class ClientHallsRoomRecord{
	int ClientID, RoomNumber;
	public ClientHallsRoomRecord(int inputClientID, int inputRoomNumber){
		ClientID = inputClientID;
		RoomNumber = inputRoomNumber;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public int getRoomNumber(){
		return RoomNumber;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setRoomNumber(int newRoomNumber){
		RoomNumber = newRoomNumber;
	}
}