package com.example.invoice_project.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceDao;

    public Invoice addInvoice(Invoice invoice){
        invoiceDao.save(invoice);
        return invoice;
    }
    public List<Invoice> getInvoices() {
        return invoiceDao.findAll();
    }
    public Invoice deleteInvoice(long id) {
        Invoice invoice = invoiceDao.findById(id).get();
        invoiceDao.delete(invoice);
        return invoice;
    }

    public void deleteByVendor(String name)
    {
        invoiceDao.deleteByVendor(name);
    }
}
