package mod1_2.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;Socket s;PrintWriter out;BufferedReader in;
	public Server() {
		try {
			ss=new ServerSocket(2000);
			System.out.println("Server Ready...............");
			while(true) {
				s=ss.accept();
				//System.out.println(s);
				out=new PrintWriter(s.getOutputStream(),true);
				in=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Please Enter a Message to Client..:");
				String msg=in.readLine();
				out.println(msg);
				
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromClient=in.readLine();
				System.out.println("Msg From Client..:"+msgFromClient);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}