package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.thymeleafdemo.dao.InvoiceRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Invoice;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	private InvoiceRepository invoiceRepository;
	
	@Autowired
	public InvoiceServiceImpl( InvoiceRepository theInvoiceRepository) {
		invoiceRepository= theInvoiceRepository;
	}
	
	@Override
	public List<Invoice> findAll() {
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice findById(int theId) {
		Optional<Invoice> result = invoiceRepository.findById(theId);
		Invoice theInvoice = null;
		if(result.isPresent()) {
			theInvoice=result.get();
		}
		else {
			throw new RuntimeException("Did not find invoice id: "+theId);
		}
		return theInvoice;
	}

	@Override
	public void save(Invoice theInvoice) {
		invoiceRepository.save(theInvoice);
	}

	@Override
	public void deleteById(int theId) {
		invoiceRepository.deleteById(theId);
	}

}
