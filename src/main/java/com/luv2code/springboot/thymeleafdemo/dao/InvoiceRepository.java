package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
	
	public List<Invoice> findAllByOrderByClearDateDesc();
}
