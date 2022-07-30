package gameProject.classes;

import java.util.ArrayList;
import java.util.List;

import gameProject.entities.Game;
import gameProject.interfaces.GameService;

public class GameManager implements GameService{

	List<Game> games = new ArrayList<Game>();
	
	@Override
	public void add(Game game) {

		System.out.println(game.getName() + " isimli oyun başarıyla eklendi");
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getName() + " isimli oyun başarıyla silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " isimli oyun başarıyla güncellendi");
		
	}

	@Override
	public List<Game> getAll() {
		return this.games;
	}

}
