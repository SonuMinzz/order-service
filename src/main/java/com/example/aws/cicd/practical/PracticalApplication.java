package com.example.aws.cicd.practical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PracticalApplication {

	@Autowired
	private OrderDao orderDao;

	@GetMapping("/get")
	public List<Order> getOrderDetails()
	{
		return orderDao.getOrders();
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticalApplication.class, args);
	}

}
