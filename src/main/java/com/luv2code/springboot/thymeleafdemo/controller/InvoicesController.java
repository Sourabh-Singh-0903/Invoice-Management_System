package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.thymeleafdemo.entity.Invoice;
import com.luv2code.springboot.thymeleafdemo.service.InvoiceService;

@Controller
@RequestMapping("/invoices")
public class InvoicesController {
	
	private InvoiceService invoiceService;
	
	@Autowired
	public InvoicesController(InvoiceService theInvoiceService) {
		invoiceService = theInvoiceService;
	}
	
	@GetMapping("/list")
	public String getInvoices(Model theModel) {
		List<Invoice> theInvoices = invoiceService.findAll();
		theModel.addAttribute("invoices",theInvoices);
		return "invoices/invoices-list";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Invoice theInvoice = new Invoice();
		theModel.addAttribute("invoices",theInvoice);
		return "invoices/invoices-form";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("invoices") Invoice theInvoice) {
		invoiceService.save(theInvoice);
		return "redirect:/invoices/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("invoiceId") int theId,Model theModel) {
		Invoice theInvoice = invoiceService.findById(theId);
		theModel.addAttribute("invoices",theInvoice);
		return "invoices/invoices-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("invoiceId") int theId) {
		invoiceService.deleteById(theId);
		return "redirect:/invoices/list";
	}
}
