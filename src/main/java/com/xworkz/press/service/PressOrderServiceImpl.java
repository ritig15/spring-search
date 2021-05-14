package com.xworkz.press.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.press.dto.PressOrderDTO;
import com.xworkz.press.repository.PressOrderRepository;

@Component
public class PressOrderServiceImpl implements PressOrderService {
	@Autowired
	private PressOrderRepository pressOrderRepo;

	public PressOrderServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	public boolean validateAndSave(PressOrderDTO dto) {
		System.out.println("Invoked validateAndSave from service" + dto);
		boolean valid = false;
		if (dto != null) {
			String orderFrom = dto.getOrderFrom();
			if (orderFrom != null && orderFrom.length() > 3 && orderFrom.length() < 12) {
				System.out.println("OrderFrom is valid");
				valid = true;
			} else {
				System.out.println("OrderFrom is invalid");
				valid = false;
			}
			long phoneNo = dto.getPhoneNo();
			if (phoneNo > 0 && phoneNo > 900000001) {
				System.out.println("Phone number is valid");
				valid = true;
			} else {
				System.out.println("Phone number is invalid");
				valid = false;
			}
			int noOfCopies = dto.getNoOfCopies();
			if (noOfCopies > 100 && noOfCopies < 10000) {
				System.out.println("No of Copies is valid");
				valid = true;
			} else {
				System.out.println("No of Copies  is invalid");
				valid = false;
			}
			String content = dto.getContent();
			if (content.length() > 30 && content.length() < 500) {
				System.out.println("Content is valid");
				valid = true;
			} else {
				System.out.println("Content  is invalid");
				valid = false;
			}
			if (valid) {
				this.pressOrderRepo.save(dto);
			}
		}
		return valid;
	}
	@Override
	public PressOrderDTO validateAndSearchByOrderFrom(String orderFrom) {
		return this.pressOrderRepo.fetchByOrderFrom(orderFrom);

	}

}
