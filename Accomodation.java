
public class Accomodation{
	String accomodationAddress;
	
	public Accomodation(String inputAddress){
		accomodationAddress = inputAddress;
	}
	
	public String getAddress(){
		return accomodationAddress;
	}
	
	public void setAddress(String newAccomodationAddress){
		accomodationAddress = newAccomodationAddress;
	}
}