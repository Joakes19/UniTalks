//This file will deal with everything that the client sees and need to interact with

class Client{
	
	public static void main(){
		Database database = new Database(databaseName, databaseUsername, databasePassword);
		
	}
	
	public void createClientAccount(String forename, String surname, String password, String emailAddress){
		database.executeQueryWithoutResults("INSERT INTO Client VALUES ("forename + ", " + surname + ", " + password + ", " + emailAddress + ");");
	}
	
	
}