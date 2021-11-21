package project;

import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailSender {
	public void sendmail(String email_id,ArrayList<String> names) throws Exception {
		
		final String username="hit.knightingale007@gmail.com";
		final String password="HIT@KNG21007";
		String smtphost="smtp.gmail.com";
		String Frommail="hit.knightingale007@gmail.com";
		String Tomail=email_id;
		Properties props= new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", smtphost);
		props.put("mail.smtp.port", "587");
		
		Session session=Session.getInstance(props,new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(username, password);
			}
		});
		MimeMessage msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress(Frommail));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(Tomail));
		msg.setSubject("BreakdownReport");
		Multipart content=new MimeMultipart();
		
		MimeBodyPart text=new MimeBodyPart();
		text.setText("Dear "+"sir"+",\n  \nPlease find the shift Breakdown report attached to this mail..\nRegards,\nKNG MOTORS.");
		content.addBodyPart(text);
		for (int i = 0; i < names.size(); i++) {
			addAttachment(content, names.get(i));
		}
		
		msg.setContent(content);
		
		javax.mail.Transport.send(msg);
		
		
	}
	public static void addAttachment(Multipart multipart, String filename) throws Exception
	{
	    DataSource source = new FileDataSource("D:\\Data\\"+filename+".pdf");
	    BodyPart messageBodyPart = new MimeBodyPart();        
	    messageBodyPart.setDataHandler(new DataHandler(source));
	    messageBodyPart.setFileName(filename+".pdf");
	    multipart.addBodyPart(messageBodyPart);
	}
}
