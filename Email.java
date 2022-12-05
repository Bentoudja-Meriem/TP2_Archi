public class Email{
    String email;
    Email(String email){
        this.email=email;
    }
   public Boolean verifieremail(Email email){
    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }
    }
}