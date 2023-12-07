package com.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Integer>
{
	public Transaction findByTransactionId(Integer id);
}
