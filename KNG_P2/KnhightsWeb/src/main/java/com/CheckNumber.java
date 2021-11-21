package com;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class CheckNumber extends TagSupport{
	private String num;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	@Override
	public int doEndTag() throws JspException {
		int i=Integer.parseInt(num);
		JspWriter out=pageContext.getOut();
		if(i%2==0){
			try{
				out.println("<h1>Even Number...</h1>");
			}catch(Exception e) {
				
			}
		}
		else{
			try{
				out.println("<h1>Odd Number....</h1>");
			}catch(Exception e) {
				
			}
		}
		return super.doEndTag();
	}
}
