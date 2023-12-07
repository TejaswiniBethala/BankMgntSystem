//DTO class showing the details of transactions
//Importing classes and packages required
package com.bank.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Transaction 
{
	@Id
	private Integer transactionId;
	private Integer transactionAmount;
	private Date transactionDate;
	private String transactionType;
	
	
	
	
	@ManyToOne
    @JoinColumn(name = "account_number")
    private Account account;
}
