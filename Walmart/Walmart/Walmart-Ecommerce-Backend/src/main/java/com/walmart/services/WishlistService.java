package com.walmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.models.Customer;
import com.walmart.models.Product;
import com.walmart.models.Wishlist;
import com.walmart.repos.WishlistRepository;

@Service
public class WishlistService {

	@Autowired private WishlistRepository repo;
	@Autowired private CustomerService cservice;
	
	public void save(Wishlist wl) {
		repo.save(wl);
	}
	
	public List<Wishlist> findByuserid(int id){
		return repo.findByCustomer(cservice.findById(id));
	}
	
	public void deleteItem(int id) {
		repo.deleteById(id);
	}
	
	public boolean checkexist(Customer customer,Product product) {
		return repo.findByCustomerAndProduct(customer, product)!=null;
	}
}
