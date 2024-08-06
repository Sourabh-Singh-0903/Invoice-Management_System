package com.luv2code.springboot.thymeleafdemo.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.luv2code.springboot.thymeleafdemo.entity.Invoice;

@Service
public class PdfServiceImpl implements PdfService {

	private Logger logger = LoggerFactory.getLogger(PdfServiceImpl.class);
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public ByteArrayInputStream createPdf(Invoice theInvoice) {
		logger.info("Create Pdf Started : ");
		
		Document document = new Document(PageSize.A4.rotate(), 10, 10, 10, 10);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            // step2
        	
            PdfWriter.getInstance(document,
                    out);
            document.open();

            String title = "Invoice Details";
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD,24);
            Paragraph p = new Paragraph(title,titleFont);
            p.setAlignment(Element.ALIGN_CENTER);
            document.add(p);
            
            Paragraph p2 = new Paragraph("     ");
            document.add(p2);
            Paragraph p3 = new Paragraph("     ");
            document.add(p3);
            
            PdfPTable datatable = new PdfPTable(2);
          
         
              datatable.addCell("Business Code");
              datatable.addCell(theInvoice.getBusinessCode());	
              
	          datatable.addCell("Customer Number");
	          datatable.addCell(Integer.toString(theInvoice.getCustomerNumber()));
	          
	          datatable.addCell("Clear Date");
	          datatable.addCell(theInvoice.getClearDate().toString());
	          
	          datatable.addCell("Business Year");
	          datatable.addCell(Integer.toString(theInvoice.getBusinessYear()));
	          
	          datatable.addCell("Document Id");
	          datatable.addCell(Integer.toString(theInvoice.getDocumentId()));
	          
	          datatable.addCell("Posting Date");
	          datatable.addCell(theInvoice.getPostingDate().toString());

	          datatable.addCell("Document Create Date");
	          datatable.addCell(theInvoice.getDocumentCreateDate().toString()); 
	          
	          datatable.addCell("Due In Date");
	          datatable.addCell(theInvoice.getDueInDate().toString());
	          
	          datatable.addCell("Invoice Currency");
	          datatable.addCell(theInvoice.getInvoiceCurrency());
	          
	          datatable.addCell("Document Type");
	          datatable.addCell(theInvoice.getDocumentType());
	          
	          datatable.addCell("Postin ID");
	          datatable.addCell(Integer.toString(theInvoice.getPostinId()));
	          
	          datatable.addCell("Total Open Amount ");
	          datatable.addCell(Double.toString(theInvoice.getTotalOpenAmount()));
	          
	          document.add(datatable);
	          
	          Paragraph p4 = new Paragraph("     ");
	          document.add(p4);
	          Paragraph p5 = new Paragraph("     ");
	           document.add(p5);
	            Paragraph p6 = new Paragraph("     ");
	            document.add(p6);
	            Paragraph p7 = new Paragraph("     ");
	            document.add(p7);
	            Paragraph p8 = new Paragraph("     ");
	            document.add(p8);
	         
	          Font sign = FontFactory.getFont(FontFactory.HELVETICA_BOLD,16);
	          Paragraph p9 = new Paragraph("Signature of Manager                           ",sign);
	          p9.setAlignment(Element.ALIGN_RIGHT);
		      document.add(p9);   
	       
            
        } catch (Exception de) {
            de.printStackTrace();
        }
        // step5
        document.close();
        return new ByteArrayInputStream(out.toByteArray());
		
	}

}
