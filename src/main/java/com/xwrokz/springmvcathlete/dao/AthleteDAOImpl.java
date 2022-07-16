package com.xwrokz.springmvcathlete.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import com.xwrokz.springmvcathlete.entity.AthleteDetails;

@Component
public class AthleteDAOImpl implements AthleteDAO{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Override
	public boolean save(AthleteDetails entity) {
		if(entity!=null) {
			System.out.println("dto is valid and data's are saved.....");
			System.out.println(entity);
			EntityManager  entityManager=null;
			try{
				System.out.println("ready to save Athlete Entity");
				entityManager=entityManagerFactory.createEntityManager();
				entityManager.getTransaction().begin();
				entityManager.persist(entity);
				entityManager.getTransaction().commit();
				
			}catch(PersistenceException e)
			{
			e.printStackTrace();	
			entityManager.getTransaction().rollback();
			}finally {
				entityManager.close();
				System.out.println("closing entityManager");
			}
			return true;
		}else{
			System.out.println("dto id invalid");
			return false;
		}
		
	}
	@Override
	public AthleteDetails findByName(String name) {
		System.out.println("Running on findByName method in dao");
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		Query query=entityManager.createNamedQuery("byName");
		query.setParameter("detail", name);
		return (AthleteDetails) query.getSingleResult();
		
	}

}
