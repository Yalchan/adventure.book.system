package com.advanced.academy.adventure.book.system.service;

import com.advanced.academy.adventure.book.system.repository.CustomerRepository;
import com.advanced.academy.adventure.book.system.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public void createOrUpdateCustomer(Customer customer) {
        if (customer.getId() == null) {
            validateAndGreateCustomer(customer);
            return;
        }
        validateAndUpdateCustomer(customer);
        //return customer.getUserName();
    }

    public Customer getCustomer(Integer customerId) {
        return null;
    }

    private void validateAndGreateCustomer(Customer customer) {
        validateCustomer(customer);
    }

    private void validateAndUpdateCustomer(Customer customer) {
        validateCustomer(customer);
    }

    private void validateCustomer(Customer customer) {

    }

    public void deleteCustomer(Integer customerId) {
    }
}
