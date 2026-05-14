package com.financial.management.controller;


import com.financial.management.model.Transaction;
import com.financial.management.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return service.saveTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> listAll() {
        return service.getAllTransactions();
    }

}
