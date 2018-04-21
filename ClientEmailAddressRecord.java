import java.sql.*;
import java.util.*;

public class ClientEmailAddressRecord{
	int ClientID;
	String EmailAddress;
	public ClientEmailAddressRecord(int inputClientID, String inputEmailAddress){
		ClientID = inputClientID;
		EmailAddress = inputEmailAddress;
	}
	
	public int getClientID(){
		return ClientID;
	}
	
	public String getEmailAddress(){
		return EmailAddress;
	}
	
	public void setClientID(int newClientID){
		ClientID = newClientID;
	}
	
	public void setEmailAddress(String newEmailAddress){
		EmailAddress = newEmailAddress;
	}
}