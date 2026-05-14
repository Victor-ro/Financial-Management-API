package com.financial.management.service;

import com.financial.management.model.Transaction;
import com.financial.management.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    // Constructor Injection
    public TransactionService(TransactionRepository repository){
        this.repository = repository;
    }

    public Transaction saveTransaction(Transaction transaction){
        return repository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

}
