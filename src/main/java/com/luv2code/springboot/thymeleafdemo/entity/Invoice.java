package com.luv2code.springboot.thymeleafdemo.entity;


import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sl_no")
	private int slNo;
	
	@Column(name="business_code")
	private String businessCode;
	
	@Column(name="customer_number")
	private int customerNumber;
	
	@Column(name="clear_date")
	private Date clearDate ;
	
	@Column(name="business_year")
	private int businessYear;
	
	@Column(name="document_id")
	private int documentId;
	
	@Column(name="posting_date")
	private Date postingDate ;
	
	@Column(name="document_create_date")
	private Date documentCreateDate ;
	
	@Column(name="due_in_date")
	private Date dueInDate ;
	
	@Column(name="invoice_currency")
	private String invoiceCurrency;
	
	@Column(name="document_type")
	private String documentType;
	
	@Column(name="postin_id")
	private int postinId;
	
	@Column(name="total_open_amount")
	private double totalOpenAmount;
	
	@Column(name="baseline_create_date")
	private Date baselineCreateDate ;
	
	
	public Invoice() {
		
	}


	public int getSlNo() {
		return slNo;
	}


	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}


	public String getBusinessCode() {
		return businessCode;
	}


	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}


	public int getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}


	public Date getClearDate() {
		return clearDate;
	}


	public void setClearDate(Date clearDate) {
		this.clearDate = clearDate;
	}


	public int getBusinessYear() {
		return businessYear;
	}


	public void setBusinessYear(int businessYear) {
		this.businessYear = businessYear;
	}


	public int getDocumentId() {
		return documentId;
	}


	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}


	public Date getPostingDate() {
		return postingDate;
	}


	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}


	public Date getDocumentCreateDate() {
		return documentCreateDate;
	}


	public void setDocumentCreateDate(Date documentCreateDate) {
		this.documentCreateDate = documentCreateDate;
	}


	public Date getDueInDate() {
		return dueInDate;
	}


	public void setDueInDate(Date dueInDate) {
		this.dueInDate = dueInDate;
	}


	public String getInvoiceCurrency() {
		return invoiceCurrency;
	}


	public void setInvoiceCurrency(String invoiceCurrency) {
		this.invoiceCurrency = invoiceCurrency;
	}


	public String getDocumentType() {
		return documentType;
	}


	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}


	public int getPostinId() {
		return postinId;
	}


	public void setPostinId(int postinId) {
		this.postinId = postinId;
	}


	public double getTotalOpenAmount() {
		return totalOpenAmount;
	}


	public void setTotalOpenAmount(double totalOpenAmount) {
		this.totalOpenAmount = totalOpenAmount;
	}


	public Date getBaselineCreateDate() {
		return baselineCreateDate;
	}


	public void setBaselineCreateDate(Date baselineCreateDate) {
		this.baselineCreateDate = baselineCreateDate;
	}


	public Invoice(String businessCode, int customerNumber, Date clearDate, int businessYear, int documentId,
			Date postingDate, Date documentCreateDate, Date dueInDate, String invoiceCurrency,
			String documentType, int postinId, double totalOpenAmount, Date baselineCreateDate) {
		this.businessCode = businessCode;
		this.customerNumber = customerNumber;
		this.clearDate = clearDate;
		this.businessYear = businessYear;
		this.documentId = documentId;
		this.postingDate = postingDate;
		this.documentCreateDate = documentCreateDate;
		this.dueInDate = dueInDate;
		this.invoiceCurrency = invoiceCurrency;
		this.documentType = documentType;
		this.postinId = postinId;
		this.totalOpenAmount = totalOpenAmount;
		this.baselineCreateDate = baselineCreateDate;
	}


	@Override
	public String toString() {
		return "Invoice [slNo=" + slNo + ", businessCode=" + businessCode + ", customerNumber=" + customerNumber
				+ ", clearDate=" + clearDate + ", businessYear=" + businessYear + ", documentId=" + documentId
				+ ", postingDate=" + postingDate + ", documentCreateDate=" + documentCreateDate + ", dueInDate="
				+ dueInDate + ", invoiceCurrency=" + invoiceCurrency + ", documentType=" + documentType + ", postinId="
				+ postinId + ", totalOpenAmount=" + totalOpenAmount + ", baselineCreateDate=" + baselineCreateDate
				+ "]";
	}
	
	

}
