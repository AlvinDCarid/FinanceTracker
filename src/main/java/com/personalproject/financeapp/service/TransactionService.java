package com.personalproject.financeapp.service;

import com.personalproject.financeapp.model.transaction;

import java.util.List;

public interface TransactionService {

    transaction saveTransaction (transaction tran);
    List<transaction> getAllTransaction();
    transaction getTransactionByID(long id);
    transaction updateTransaction(long id, transaction updatedTran);
    void deleteTransaction(long id);

}
