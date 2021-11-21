package project;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PdfGenerator {
	String pd;String at;
	public void create(String d,String mcno,String ft,String pd,String at,String ot,String dt,String pi) {
		this.at=at;this.pd=pd;
		        try {
		            PdfReader pdfReader = new PdfReader("D:\\Data\\rawData\\blank.pdf");

		            PdfStamper pdfStamper = new PdfStamper(pdfReader,
		                    new FileOutputStream("D:\\Data\\"+mcno+".pdf"));

		            Image image = Image.getInstance("D:\\Data\\rawData\\Report.jpeg");

		                //put content under
		                PdfContentByte content = pdfStamper.getUnderContent(1);
		                image.setAbsolutePosition(5f, 5f);
		                image.scaleToFit(828f, 830f);
		                content.addImage(image);

		                //Text over the existing page
		                BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA,
		                        BaseFont.WINANSI, BaseFont.EMBEDDED);
		                content.beginText();
		                content.setColorFill(BaseColor.DARK_GRAY);
		                content.setFontAndSize(bf, 15);
		                
		                content.showTextAligned(PdfContentByte.ALIGN_LEFT,d,146,611,0);
		                content.showTextAligned(PdfContentByte.ALIGN_LEFT,mcno,165,568,0);
		                content.showTextAligned(PdfContentByte.ALIGN_LEFT,pi,192,520,0);
		                
		                content.showTextAligned(PdfContentByte.ALIGN_LEFT,dt,80,445,0);
		                content.showTextAligned(PdfContentByte.ALIGN_LEFT,ft,250,445,0);
		                content.showTextAligned(PdfContentByte.ALIGN_LEFT,ot,420,445,0);
		                
		                content.showTextAligned(PdfContentByte.ALIGN_LEFT,this.pd,55,360,0);
		                content.showTextAligned(PdfContentByte.ALIGN_LEFT,this.at,310,360,0);
		              
		                DateTimeFormatter Date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		        		String date=LocalDate.now().format(Date);
		        		content.showTextAligned(PdfContentByte.ALIGN_LEFT,date,78,680,0);
		                content.endText();
                         System.out.println("Pdf generated....");

		            pdfStamper.close();

		        } catch (IOException e) {
		            e.printStackTrace();
		        } catch (DocumentException e) {
		            e.printStackTrace();
		        }
		    }
     }
