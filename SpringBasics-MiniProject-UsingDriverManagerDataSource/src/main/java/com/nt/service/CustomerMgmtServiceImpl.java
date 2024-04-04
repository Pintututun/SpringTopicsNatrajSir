package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ICustomerDAO;
import com.nt.model.Customer;

@Service("custService")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerDAO custDAO;
	
	@Override
	public String registerCustomer(Customer customer) throws Exception {
		//Calculate discount ,final amount
		double discountAmount=(customer.getBillAmount()*(customer.getDiscount()/100.0));
		double finalAmount=customer.getBillAmount()-discountAmount;
		//Set final amount to Model class object
		customer.setFinalAmount(finalAmount);
		//Use DAO
		int count=custDAO.insert(customer);
		return count==0?"Customer registration failed":"Customer registered having BillAmount:"+customer.getBillAmount()+" Discount Amount:"+discountAmount+" final Amount:"+finalAmount;
	}

}
