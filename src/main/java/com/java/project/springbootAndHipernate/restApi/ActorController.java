package com.java.project.springbootAndHipernate.restApi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.project.springbootAndHipernate.Business.IActorService;
import com.java.project.springbootAndHipernate.Entities.Actor;

@RestController
@RequestMapping("/api")
public class ActorController {
	private IActorService actorService;
	
	@Autowired
	public ActorController(IActorService actorService) {
		this.actorService = actorService;
	}
	
	@GetMapping("/actors")
	public List<Actor> get(){
		return actorService.getAll();
	}
	
}
