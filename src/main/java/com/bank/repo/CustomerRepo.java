package com.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,String>
{
	public Customer findByCustomerId(String id);
	public Customer findByCustomerName(String cname);
	public Customer findByCustomerContact(Long contact);
}
