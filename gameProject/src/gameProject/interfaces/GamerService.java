package gameProject.interfaces;

import java.util.List;

import gameProject.entities.Gamer;

public interface GamerService {
	
	void add(Gamer gamer);
	void remove(Gamer gamer);
	void update(Gamer gamer);
	List<Gamer> getAll();
	

}
