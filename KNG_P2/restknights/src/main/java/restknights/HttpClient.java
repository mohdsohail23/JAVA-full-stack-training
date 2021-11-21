package restknights;

import java.net.URL;
import java.net.URLConnection;

public class HttpClient {
	public static void main(String[] args)throws Exception {
		URL url=new URL("http://localhost:8080/restknights/rest/hello/say");
		
		URLConnection urlcon=url.openConnection();
		
		urlcon.getInputStream();
	}
}
