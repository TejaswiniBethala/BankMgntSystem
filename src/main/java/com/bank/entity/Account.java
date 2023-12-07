//DTO class of Account which includes the basic details of Customer Accounts
package com.bank.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Account 
{
	@Id
	private String accountNumber;
	private String accountStatus;
	private String accountType;
	private Integer accountBalance;
	//private Integer transactionId;
	
	
	
	// Method to deposit funds
    public void deposit(int amount) {
        this.accountBalance += amount;
    }

    // Method to withdraw funds
    public boolean withdraw(int amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            return true; // Withdrawal successful
        }
        return false; // Insufficient funds
    }
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    /*
    @OneToMany()
    private List<Transaction> transactions;
    
    */
    
}
