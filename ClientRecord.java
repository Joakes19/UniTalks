import java.sql.*;
import java.util.*;

public class ClientRecord{
	String Forename, Surname;
	int ClientID;
	public ClientRecord(String inputForename, String inputSurname, int inputClientID){
		Forename = inputForename;
		Surname = inputSurname;
		ClientID = inputClientID;
	}
	
	public String getForename(){
		return Forename;
	}
	
	public String getSurname(){
		return Surname;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public void setForename(String newForename){
		Forename = newForename;
	}
	
	public void setSurname(String newSurname){
		Surname = newSurname;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
}