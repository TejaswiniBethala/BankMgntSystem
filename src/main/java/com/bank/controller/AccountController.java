package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Account;
import com.bank.service.AccountService;
@CrossOrigin
@RestController
@RequestMapping("/account")
public class AccountController 
{
	@Autowired
	AccountService aservice;

	public AccountController(AccountService aservice) {
		super();
		this.aservice = aservice;
	}
	//fetching the records of account details
		@GetMapping("/getdetails")
		public ResponseEntity<List<Account>> getAccountDetails()
		{
			List<Account> list = aservice.getAccountDetails();
			return new ResponseEntity<>(list,HttpStatus.OK);
		}
		//inserting the values into the relation
		@PostMapping("/insertdetails")
		public ResponseEntity<String> insert(@RequestBody Account a)
		{
			String s = aservice.insertAccount(a);
			return new ResponseEntity<>(s,HttpStatus.CREATED);
		}
		//updation operation
		@PutMapping("/updatedetails")
		public ResponseEntity<String> update(@RequestBody Account a)
		{
			String s = aservice.update(a);
			return new ResponseEntity<>(s,HttpStatus.CREATED);
		}
		//deleteing the records by using id
		@DeleteMapping("/deletedetails/{id}")
		public ResponseEntity<String> delete(@PathVariable("id")String id)
		{
			String s = aservice.deleteAccount(id);
			return new ResponseEntity<>(s,HttpStatus.CREATED);
		}
		//getting the records of particular row based on id
		@GetMapping("/getalldetails/{id}")
		public ResponseEntity<Account> get(@PathVariable("id")String id)
		{
			Account a = aservice.getAccountDetails(id);
			return new ResponseEntity<>(a,HttpStatus.OK);
		}
		@GetMapping("/getdetails/{id}")
		public ResponseEntity<Account> getaccNumber(@PathVariable("id")String id)
		{
			Account a = aservice.getByAccountNumber(id);
			return new ResponseEntity<>(a,HttpStatus.OK);
		}
		
		 @PutMapping("/deposit/{accountNumber}/{amount}")
		    public ResponseEntity<String> deposit(@PathVariable("accountNumber") String accountNumber, @PathVariable("amount") int amount) {
		        String result = aservice.depositAmount(accountNumber, amount);
		        return new ResponseEntity<>(result, HttpStatus.OK);
		    }

		    // Endpoint for withdrawal
		    @PutMapping("/withdraw/{accountNumber}/{amount}")
		    public ResponseEntity<String> withdraw(@PathVariable("accountNumber") String accountNumber, @PathVariable("amount") int amount) {
		        String result = aservice.withdrawAmount(accountNumber, amount);
		        return new ResponseEntity<>(result, HttpStatus.OK);
		    }
}
