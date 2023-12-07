//DTO class of Customer which results the basic details of customers
//Importing classes and packages
package com.bank.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer 
{
	@Id
	private String customerId;
	private String customerName;
	private Long customerContact;
	private String customerAddress;
	//private String accountNumber;
	
	
	
	@ManyToOne
	@JoinColumn(name="manager_id")
	private BranchManager manager;
	/*
	
	 @OneToMany(mappedBy="customer")
	    private List<Account> accounts;
	*/
	
	
}
