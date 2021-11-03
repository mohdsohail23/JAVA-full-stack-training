package emailComponent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Scanner;

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


public class BulkEmailComponent implements Email,Serializable{
	@Override
	public void EmailService() throws Exception {
    	String SenderID,SenderPassword,Subject,MessageContent;
		ArrayList<String> ReceiverIDs =new ArrayList<String>();
		ArrayList<String> AttachmentPath=new ArrayList<String>() ;
    	Scanner scan=new Scanner(System.in);
    	System.out.println("<<<----Welcome To Bulk mail Service---->>>");
    	System.out.println("Please Enter Sender's G-mail ID :  ");SenderID=scan.nextLine();
    	System.out.println("Please Enter Sender's G-mail Password :  ");SenderPassword=scan.nextLine();
    	System.out.println("Please Enter Subject of E-mail :  ");Subject=scan.nextLine();
    	System.out.println("Please Enter Message Content :  ");MessageContent=scan.nextLine();
    	int NosAttach;
    	System.out.println("Please Enter the number of attachment  : ");
    	NosAttach=Integer.parseInt(scan.nextLine());
    	//attachment
    	if(NosAttach!=0) {
    		for (int i = 0; i < NosAttach; i++) {
    			System.out.println("Please path of Attachment"+(i+1)+" :  ");String path=scan.nextLine();
    			AttachmentPath.add(path);
			}
    	}else{
				AttachmentPath=null;
			}
    	System.out.println("Please Enter the number of Receivers  : ");
    	int NosReceivers=Integer.parseInt(scan.nextLine());
    	//receivers
    	if(NosReceivers!=0 && NosReceivers>0) {
    		for (int i = 0; i < NosReceivers; i++) {
    			System.out.println("Please enter Email ID of Receiver "+(i+1)+" :  ");String IDs=scan.nextLine();
    			ReceiverIDs.add(IDs);
			}
    	}else{
    	    	System.out.println("Please Enter valid number above 0");
				ReceiverIDs=null;
			}
    	BulkEmailComponent BEC=new BulkEmailComponent();
    	BEC.sendEmail(SenderID, SenderPassword, ReceiverIDs, Subject,
    			MessageContent, AttachmentPath);
    	scan.close();
    }
	
	public void sendEmail(String SenderID, String SenderPassword, ArrayList<String> ReceiverIDs, String Subject,
			String MessageContent, ArrayList<String> AttachmentPath) throws Exception {
		System.out.println("Sending E-Mails....");
		final String username=SenderID;
		final String password=SenderPassword;
		String smtphost="smtp.gmail.com";
		String Frommail=SenderID;
		ArrayList<String> Tomail=ReceiverIDs;
		//auth
		Properties props= new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", smtphost);
		props.put("mail.smtp.port", "587");
		//iterator
		ListIterator<String> liter=Tomail.listIterator();
		while(liter.hasNext()) {
		Session session=Session.getInstance(props,new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(username, password);
			}
		});
		MimeMessage msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress(Frommail));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(liter.next()));
		msg.setSubject(Subject);
		Multipart content=new MimeMultipart();
		
		MimeBodyPart text=new MimeBodyPart();
		text.setText(MessageContent);
		content.addBodyPart(text);
		if(AttachmentPath!=null) {
		for (int i = 0; i < AttachmentPath.size(); i++) {
		addAttachment(content,AttachmentPath.get(i) );
		}
		}
		msg.setContent(content);
		
		javax.mail.Transport.send(msg);
		
		}
		System.out.println("E-Mail Sent....");
	}
	public static void addAttachment(Multipart multipart, String path) throws Exception
	{
	    DataSource source = new FileDataSource(path);
	    BodyPart messageBodyPart = new MimeBodyPart();        
	    messageBodyPart.setDataHandler(new DataHandler(source));
	    messageBodyPart.setFileName(path);
	    multipart.addBodyPart(messageBodyPart);
	}
}