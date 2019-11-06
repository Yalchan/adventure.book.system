package com.advanced.academy.adventure.book.system.service;

import com.advanced.academy.adventure.book.system.repository.CustomerRepository;
import com.advanced.academy.adventure.book.system.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public void createOrUpdateCustomer(Customer customer) {
        if (customer.getId() == null) {
            createCustomer(customer);
            return;
        }
        updateCustomer(customer);
        //return customer.getUserName();
    }

    public Customer getCustomer(Integer customerId) {

        Optional<Customer> customer=customerRepository.findById(customerId);
        if(!customer.isPresent()){
            throw new RuntimeException("Customer not found!");
        }
        return customer.get();
    }

    private void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    private void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer customerId) {
        customerRepository.deactivateCustomer(customerId);
    }
}
