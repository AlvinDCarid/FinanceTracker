package com.personalproject.financeapp.repo;

import com.personalproject.financeapp.model.transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository <transaction, Long> {
}
