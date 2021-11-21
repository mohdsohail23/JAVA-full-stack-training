package hit.mod1.level2.day6;

import java.util.Locale;
import java.util.ResourceBundle;
public class InternationalizeDemo {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("hi"));
		Locale locale=Locale.getDefault();
		
		System.out.println(locale);
		
		//ResourceBundle rb=ResourceBundle.getBundle("hit/mod1/level2/day6/dictionary",locale);
		ResourceBundle rb=ResourceBundle.getBundle("hit.mod1.level2.day6.Dictionary",locale);
		
		System.out.println(rb.getString("name"));
	}
}