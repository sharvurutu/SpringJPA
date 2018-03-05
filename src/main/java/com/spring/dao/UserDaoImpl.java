package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.spring.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager em;

	public void newUser(UserEntity user) {
		em.persist(user);
	}

	public List<UserEntity> getAll() {
		CriteriaQuery<UserEntity> criteriaQuery = em.getCriteriaBuilder().createQuery(UserEntity.class);

		Root<UserEntity> root = criteriaQuery.from(UserEntity.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

}
