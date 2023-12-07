//DTO class of BranchManager which gives basic details of bank and manager

//Importing packages and classes
package com.bank.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BranchManager
{
	@Id
	private String managerId;
	private String branchName;
	private String branchCity;
	private Integer branchPinCode;
	private String branchId;
	private String managerName;
	private Integer managerExp;
	//private String customerId;
	
/*
	@OneToMany(mappedBy="manager")
	private List<Customer> customer;
	*/

}
