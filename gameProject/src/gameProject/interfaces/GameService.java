package gameProject.interfaces;

import java.util.List;

import gameProject.entities.Game;

public interface GameService {
	
	void add(Game game);
    void remove(Game game); 
    void update(Game game);
    List<Game> getAll();
	
}
