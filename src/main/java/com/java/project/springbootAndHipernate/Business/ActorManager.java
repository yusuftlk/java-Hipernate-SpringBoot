package com.java.project.springbootAndHipernate.Business;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.java.project.springbootAndHipernate.DataAccess.IActorDal;
import com.java.project.springbootAndHipernate.Entities.Actor;

@Service
public class ActorManager implements IActorService{
	
	private IActorDal actorDal;
	
	@Autowired
	public ActorManager(IActorDal actorDal) {
		this.actorDal = actorDal;
	}

	@Override
	@Transactional
	public List<Actor> getAll() {
		return this.actorDal.getAll();
	}

	@Override
	@Transactional
	public void add(Actor actor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(Actor actor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	@Transactional
	public void delete(Actor actor) {
		// TODO Auto-generated method stub
		
	}

}
