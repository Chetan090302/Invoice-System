package com.example.invoice_project.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class InvoiceController
{
    @Autowired
    InvoiceService invoiceService;

    @Autowired
    InvoiceRepository repository;

    @PostMapping("/invoice")
    public Invoice addInvoice(@RequestBody Invoice invoice)
    {
        return this.invoiceService.addInvoice(invoice);
    }
    @PostMapping("/update")
    public Invoice updateInvoice(@RequestBody Invoice obj)
    {
        Invoice obj1=repository.findById(obj.getId()).get();
        obj1.setAction(obj.getAction());
        repository.save(obj1);
        return obj1;
    }
    @GetMapping("/getinvoices")
    public List<Invoice> getInvoices()
    {
        return this.invoiceService.getInvoices();
    }
    @DeleteMapping("/invoice/{invoiceId}")
    public Invoice deleteInvoice(@PathVariable String invoiceId)
    {
        return this.invoiceService.deleteInvoice(Long.parseLong(invoiceId));
    }
}
