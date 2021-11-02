package com.whattoeat.whattoeat.service;

import com.whattoeat.whattoeat.dao.CustomerDao;
import com.whattoeat.whattoeat.entity.Cart;
import com.whattoeat.whattoeat.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void signUp(Customer customer) {
        customer.setEnabled(true);

        Cart cart = new Cart();
        customer.setCart(cart);

        customerDao.signUp(customer);
    }

    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }
}

