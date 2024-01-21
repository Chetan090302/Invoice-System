package com.invoiceprocessing.server.dao;

import com.invoiceprocessing.server.model.Invoice;
import com.invoiceprocessing.server.services.InvoiceService;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InvoiceDao extends JpaRepository<Invoice, Long> {
}
