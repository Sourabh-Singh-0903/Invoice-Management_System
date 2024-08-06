package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Invoice;

public interface InvoiceService {

	public List<Invoice> findAll();
	public Invoice findById(int theId);
	public void save(Invoice theEmployee);
	public void deleteById(int theId);
}
