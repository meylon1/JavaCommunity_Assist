
public class program {



	public static void main(String[] args) {
	
		client c = new client();
		c.setclientID(0);
	    c.setEmail("me@gmail.com");
	    c.setFirstName("meli");
	    c.setLastName("beyen");
	    
	   
	    Donation don = new Donation();
	  don.setDonationAmount(500);
	  don.setDaonationDate(5162017);
      don.setDonationHistory("History");
	
      System.out.println(don.getDonationAmount());
      System.out.println(don.getDaonationDate());
      System.out.println(don.getDonationHistory());
	
	}

}
