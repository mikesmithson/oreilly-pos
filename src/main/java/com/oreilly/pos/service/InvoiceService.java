package com.oreilly.pos.service;

import com.oreilly.pos.entity.InvoiceEntity;
import com.oreilly.pos.repository.InvoiceRepository;
import com.oreilly.pos.util.JSONUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class InvoiceService {

    private InvoiceRepository invoiceRepository;

    public Map<Long, String> retrieveInvoiceIdToTenderType(Long customerId) {
        return invoiceRepository.findInvoiceEntitiesByCustomerId(customerId)
                .stream()
                .collect(Collectors.toMap(InvoiceEntity::getInvoiceId,
                        invoiceEntity -> JSONUtils.extractTenderType(invoiceEntity.getInvoiceData())));

    }
}
