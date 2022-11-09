package com.ty.OnetoMany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.OnetoMany.dto.Phone;
import com.ty.OnetoMany.dto.Sim;

public class PhoneDao {

	public void SavePhone(Phone phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tharun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(phone);
		for (Sim s : phone.getSim()) {
			entityManager.persist(s);
		}

		entityTransaction.commit();
	}

}
