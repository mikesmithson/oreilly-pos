package com.oreilly.pos.repository;

import com.oreilly.pos.entity.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long> {
     List<InvoiceEntity> findInvoiceEntitiesByCustomerId(long customerId);
}
