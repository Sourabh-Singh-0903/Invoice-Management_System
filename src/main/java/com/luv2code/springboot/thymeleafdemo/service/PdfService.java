package com.luv2code.springboot.thymeleafdemo.service;

import java.io.ByteArrayInputStream;

import com.luv2code.springboot.thymeleafdemo.entity.Invoice;

public interface PdfService {

	public ByteArrayInputStream createPdf(Invoice theInvoice);
}
