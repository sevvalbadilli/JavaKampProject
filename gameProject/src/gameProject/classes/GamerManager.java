package gameProject.classes;

import java.util.ArrayList;
import java.util.List;

import gameProject.entities.Gamer;
import gameProject.interfaces.GamerService;
import gameProject.utilities.GamerValidationService;

public class GamerManager implements GamerService {

	
	List<Gamer>gamers = new ArrayList<Gamer>();
	
	GamerValidationService validationService;
	
	
	
	public GamerManager(GamerValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void add(Gamer gamer) {

		if (validationService.isGamerValid(gamer)) {
			
			System.out.println(gamer.getUserName() + " adlı kullanıcı oyuncu eklendi");
		}else {
			System.out.println("kullanıcı dogrulanamadı");
		}
		
		
	}

	@Override
	public void remove(Gamer gamer) {

		System.out.println(gamer.getUserName() + "kullanıcı oyıncu silindi  ");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getUserName() + "kullanıcı oyıncu güncellendi  ");
		
	}

	@Override
	public List<Gamer> getAll() {
		return this.gamers;
	}

}
