package com.xworkz.press.repository;

import java.util.List;

import com.xworkz.press.dto.PressOrderDTO;

public interface PressOrderRepository {
	public void save(PressOrderDTO dto);
	
	public PressOrderDTO fetchByOrderFrom(String name);

	public List<PressOrderDTO> fetchByDisplayAll();
}
