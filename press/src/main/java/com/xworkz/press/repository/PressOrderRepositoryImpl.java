package com.xworkz.press.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.press.dto.PressOrderDTO;

@Component
public class PressOrderRepositoryImpl implements PressOrderRepository {
	@Autowired
	private SessionFactory factory;
	Transaction transaction = null;

	public PressOrderRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	public void save(PressOrderDTO dto) {

		System.out.println("Invoked save in PressOrderRepositoryImpl");
		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
		}
	}

	public PressOrderDTO fetchByOrderFrom(String name) {
		System.out.println("Invoked fetchByOrderFrom in PressOrderRepositoryImpl");
		try (Session session = factory.openSession()) {
			Query<PressOrderDTO> query = session.createNamedQuery("fetchByOrderFrom");
			query.setParameter("orderFrom", name);
			PressOrderDTO dto=query.uniqueResult();
			return dto;
		}
	}

	@Override
	public List<PressOrderDTO> fetchByDisplayAll() {
		System.out.println("Invoked fetchByDisplayAll in PressOrderRepositoryImpl");
		try(Session session=factory.openSession()){
			Query<PressOrderDTO> query1=session.createNamedQuery("fetchByDisplayAll");
			List<PressOrderDTO> dtoList=query1.getResultList();
			return dtoList;
		}
	}

}
