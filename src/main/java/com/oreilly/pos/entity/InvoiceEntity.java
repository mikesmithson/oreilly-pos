package com.oreilly.pos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "invoice")
@Data
public class InvoiceEntity {
    @Column(name = "customer_id", nullable = false)
    private long customerId;

    @Id
    @Column(name = "invoice_id", nullable = false)
    private long invoiceId;

    @Column(name="invoice_data", nullable = false)
    private String invoiceData;
}
