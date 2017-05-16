
public class client {
	
	public String clientFirstName;
	public String clientLastName;
	public String clientEmail;
	public int clientID;
	
	public client ( int ID , String FirstName ,String LastName, String Email )
	{ 
		
    clientID = ID;
	clientFirstName = FirstName;
	clientLastName = LastName;
	clientEmail = Email;
	
	}
	
	public client(){}
	
	public int getclientID() {

		return clientID;

	}



	public void setclientID(int clientID) {

		this.clientID = clientID;

	}



	public String getclientLastName() {

		return clientLastName;

	}
	public void setLastName(String LastName) {

		this.clientLastName = LastName;

	}



	public String getclientFirstName() {

		return clientFirstName;

	}
	public void setFirstName(String FirstName) {

		this.clientFirstName = FirstName;

	}



	public String getEmail() {

		return clientEmail;

	}



	public void setEmail(String Email) {

		this.clientEmail = Email;

	}

	


}
