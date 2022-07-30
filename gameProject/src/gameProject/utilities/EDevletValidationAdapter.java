package gameProject.utilities;

import gameProject.entities.Gamer;

public class EDevletValidationAdapter implements GamerValidationService {

	@Override
	public boolean isGamerValid(Gamer gamer) {

		if (gamer.getTckno().length() == 11 & gamer.getFirstName().length()>2 ) {
			
			return true;
		}
		return false;
	}

}
