package com.java.project.springbootAndHipernate.DataAccess;
import java.util.List;
import com.java.project.springbootAndHipernate.Entities.Actor;

public interface IActorDal {
	
	List<Actor> getAll();
	void add(Actor actor);
	void update(Actor actor);
	void delete(Actor actor);

}
