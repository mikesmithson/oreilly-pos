package com.oreilly.pos.controller;

import com.oreilly.pos.service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/invoices")
@AllArgsConstructor
public class InvoiceController {

    private InvoiceService invoiceService;

    @GetMapping("/customer/{customerId}")
    public Map<Long, String> retrieveInvoice(@PathVariable long customerId) {
        return invoiceService.retrieveInvoiceIdToTenderType(customerId);
    }
}
