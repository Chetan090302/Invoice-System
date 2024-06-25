package com.example.invoice_project.Invoice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends MongoRepository<Invoice,Long>
{

    void deleteByVendor(String name);

    Invoice findByVendor(String vendor);
}
