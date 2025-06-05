package com.personalproject.financeapp.controller;

import com.personalproject.financeapp.model.transaction;
import com.personalproject.financeapp.service.TransactionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {

    @Autowired
    private TransactionServiceImp tranService;

    @PostMapping
    public transaction saveTransaction (@RequestBody transaction tran){
        return tranService.saveTransaction(tran);
    }

    @GetMapping
    public List<transaction> getAllTransactions(){
        return tranService.getAllTransaction();

    }
    @GetMapping("/{id}")
    public transaction getTransactionByID (@PathVariable long id){
        return tranService.getTransactionByID(id);
    }
    @PutMapping("/{id}")
    public transaction updateTransaction (@PathVariable Long id, @RequestBody transaction UPtran){
        return tranService.updateTransaction(id, UPtran);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        tranService.deleteTransaction(id);
    }
}
