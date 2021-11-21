package mod1_2.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	Socket s;BufferedReader in;PrintWriter out;
	public Client() {
		try {
			while(true) {
			s=new Socket("localhost",2000);
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msgFromServer=in.readLine();
			System.out.println("From Server..:"+msgFromServer);
			
			out=new PrintWriter(s.getOutputStream(),true);
			in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please Enter a Message to Server..:");
			String msg=in.readLine();
			out.println(msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}