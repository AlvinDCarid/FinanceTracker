package com.personalproject.financeapp.service;

import com.personalproject.financeapp.model.transaction;
import com.personalproject.financeapp.repo.TransactionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImp implements TransactionService {
    private final TransactionRepo TranRepo;

    public TransactionServiceImp(TransactionRepo TranRepo){
        this.TranRepo = TranRepo;
    }

    @Override
    public transaction saveTransaction(transaction tran) {
        return TranRepo.save(tran);
    }

    @Override
    public List<transaction> getAllTransaction() {
        return TranRepo.findAll();
    }

    @Override
    public transaction getTransactionByID(long id) {
        return TranRepo.findById(id).orElseThrow();
    }

    @Override
    public transaction updateTransaction(long id, transaction updatedTran) {
        transaction exis = getTransactionByID(id);
        exis.setType(updatedTran.getType());
        exis.setAmount(updatedTran.getAmount());
        exis.setCategory(updatedTran.getCategory());
        exis.setDate(updatedTran.getDate());
        return TranRepo.save(exis);
    }

    @Override
    public void deleteTransaction(long id) {
        TranRepo.deleteById(id);
    }
}
