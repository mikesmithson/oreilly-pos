package com.oreilly.pos.repository;

import com.oreilly.pos.entity.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long> {
     List<InvoiceEntity> findInvoiceEntitiesByCustomerId(long customerId);
}
