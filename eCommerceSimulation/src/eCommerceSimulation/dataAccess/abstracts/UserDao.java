package eCommerceSimulation.dataAccess.abstracts;

import java.util.List;

import eCommerceSimulation.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void remove(User user);
    void update(User user);
    boolean getByEmail(String email);
    boolean getByPassword(String password);
    boolean getByEmailAndPassword(String email,String password);
    List<User> getAll();
    
    
	
}
