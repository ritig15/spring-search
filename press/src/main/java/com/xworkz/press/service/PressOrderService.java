package com.xworkz.press.service;

import java.util.List;

import com.xworkz.press.dto.PressOrderDTO;

public interface PressOrderService {

	public boolean validateAndSave(PressOrderDTO dto);

	public PressOrderDTO validateAndSearchByOrderFrom(String from);

	public List<PressOrderDTO> validateAndSearchByDisplayAll();
	
}
