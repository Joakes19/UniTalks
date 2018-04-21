import java.sql.*;
import java.util.*;

public class ChatRoomAdministrationRightsRecord{
	int AdministrationRightsID;
	boolean BanRight, MuteRight, KickRight;
	public ChatRoomAdministrationRightsRecord(int inputAdministrationRightsID, boolean inputBanRight, boolean inputMuteRight, boolean inputKickRight){
		AdministrationRightsID = inputAdministrationRightsID;
		BanRight = inputBanRight;
		MuteRight = inputMuteRight;
		KickRight = inputKickRight;
	}
	
	public int getAdministrationRightsID(){
		return AdministrationRightsID;
	}
	
	public boolean getBanRight(){
		return BanRight;
	}
	
	public boolean getMuteRight(){
		return MuteRight;
	}
	
	public boolean getKickRight(){
		return KickRight;
	}
	
	public void setAdministrationRightsID(int newAdministrationRightsID){
		AdministrationRightsID = newAdministrationRightsID;
	}
	
	public void setBanRight(boolean newBanRight){
		BanRight = newBanRight;
	}
	
	public void setMuteRight(boolean newMuteRight){
		MuteRight = newMuteRight;
	}
	
	public void setKickRight(boolean newKickRight){
		KickRight = newKickRight;
	}
}