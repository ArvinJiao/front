package com.wezebra.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wezebra.dao.CustomerRepository;
import com.wezebra.domain.Customer;
import com.wezebra.service.HelloService;



@Service
public class HelloServiceImpl implements HelloService{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private CustomerRepository customerRepository;
	
	@Transactional
	public String hello() {
		//Iterable<Customer> findAll = customerRepository.findAll();
		//Customer findOne = customerRepository.findOne(1L);
		//logger.debug("findOne:"+findOne);
		//Customer customer = new Customer("jack", "Lee");
		//Customer save = customerRepository.save(customer);
		//customerRepository.
		//logger.info(save.toString());
		//logger.error("test error");
		Customer customer = customerRepository.findOne(1L);
		customer.setFirstName("star");
		for (int i = 0; i < 10000; i++) {
			logger.info(customer.toString());
		}
		
		return "hello";
	}

}
