package project;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSSender {
	public void sendSms(String mob) {
    	  String ACCOUNT_SID ="AC7d33aaf59348f6a25d16ccc66499218b";
    	  String AUTH_TOKEN = "fca47bfecd435c2f44060f80e84e9cf7";
        Twilio.init(ACCOUNT_SID ,AUTH_TOKEN);

        @SuppressWarnings("unused")
		Message message = Message
                .creator(new PhoneNumber(mob), 
                        new PhoneNumber("+12056229997"), 
                        "The Shift breakdown Report has been sent to your email id ...")
                .create();
        System.out.println("Messege Sent...");
    }
}



