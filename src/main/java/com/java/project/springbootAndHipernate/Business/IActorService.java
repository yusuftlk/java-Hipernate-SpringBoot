package com.java.project.springbootAndHipernate.Business;

import java.util.List;

import com.java.project.springbootAndHipernate.Entities.Actor;

public interface IActorService {
	List<Actor> getAll();
	void add(Actor actor);
	void update(Actor actor);
	void delete(Actor actor);
}
