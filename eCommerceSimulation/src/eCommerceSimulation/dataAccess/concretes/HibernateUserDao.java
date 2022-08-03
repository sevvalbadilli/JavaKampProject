package eCommerceSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {

		System.out.println("hibernate ile veri tabanına eklendi " + user.getFirstName());
	}

	@Override
	public void remove(User user) {

		System.out.println("hibernate ile veri tabanından silindi " + user.getFirstName());
	}

	@Override
	public void update(User user) {

		System.out.println("hibernate ile veri tabanına guncellendi " + user.getFirstName());

	}

	@Override
	public List<User> getAll() {

		return users;
	}

	@Override
	public boolean getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail() == email) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean getByPassword(String password) {
		for (User user : users) {
			if (user.getPassword() == password) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean getByEmailAndPassword(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email && user.getPassword() == password) {
				return true;
			}
		}

		return false;
	}

}
