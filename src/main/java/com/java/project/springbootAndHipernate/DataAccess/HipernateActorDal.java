package com.java.project.springbootAndHipernate.DataAccess;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.java.project.springbootAndHipernate.Entities.Actor;
import jakarta.persistence.EntityManager;

@Repository
public class HipernateActorDal implements IActorDal{
	
	private EntityManager entitiyManager;
	
	@Autowired
	public HipernateActorDal(EntityManager entitiyManager) {
		this.entitiyManager = entitiyManager;
	}

	@Override
	@Transactional
	public List<Actor> getAll(){
		Session session = entitiyManager.unwrap(Session.class);
		List<Actor> actors = session.createQuery("from Actor", Actor.class).getResultList();
		return actors;
		
	}

	@Override
	public void add(Actor actor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Actor actor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Actor actor) {
		// TODO Auto-generated method stub
		
	}

}
