package com.walmart.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walmart.models.Customer;
import com.walmart.models.Product;
import com.walmart.models.Wishlist;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
	
	List<Wishlist> findByCustomer(Customer customer);
	Wishlist findByCustomerAndProduct(Customer cust,Product pro);

}
