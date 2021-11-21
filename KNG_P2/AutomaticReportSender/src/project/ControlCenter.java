package project;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ControlCenter {
		public static void main(String[] args) throws Exception {
			DateTimeFormatter Date=DateTimeFormatter.ofPattern("ddMMyyyy");
    		String d=LocalDate.now().format(Date);
    		
			//read excel and send mail...
     		ExcelReader ER=new ExcelReader();
			Timer timer=new Timer();
			int Shiftnos=0;
			//SMS sender......
			String mob="+917021181980";
			SMSSender sms=new SMSSender();
			
			TimerTask task = new TimerTask() {
				int i=Shiftnos;
				@Override
				public void run() {
					try {
						System.out.println("Sending Reports For Shift >>>"+(i+1));
						ER.ReadAndSend(i,d);
						sms.sendSms(mob);
						i++;
						if(i==3) {
							i=0;
						}
							
					} catch (Exception e) {}
					
				}
			 };
			Calendar date = Calendar.getInstance();
		
				date.set(2021, 10, 14, 03, 01, 00);
				System.out.println("1st EMAIL SCHEDULED AT >>> "+date.getTime());

			    timer.scheduleAtFixedRate(task, date.getTime(), 120000); //Scheduled every 2mins//8 hrs =28800000
		}
	}
	

