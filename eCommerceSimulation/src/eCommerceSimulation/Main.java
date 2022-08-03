package eCommerceSimulation;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.business.concretes.EmailManager;
import eCommerceSimulation.business.concretes.UserCheckManager;
import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.core.RegexManager;
import eCommerceSimulation.dataAccess.concretes.HibernateUserDao;
import eCommerceSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {



	
		User user1 = new User(1, "Şevval", "Badıllı", "sevvalbadilli@hotmail.com", "badillisevval");
		UserService userService = new UserManager(new HibernateUserDao(),new UserCheckManager(new RegexManager()),new EmailManager());
       
		userService.signUp(user1);
		System.out.println("--------------------------------");
		userService.signIn("aaaa@hotmail.com" , "ssaaaaaaa"); //sisteme giriş başarılı
		System.out.println("--------------------------------");
		userService.signIn("aaaa@hotmail.com", "123");//yanlış şifre girdiniz min 7 haneli olamlı
		System.out.println("--------------------------------");
		userService.signIn("aaaaaaaaaa", "1234567");// yanlış imail adresi format yanlış
		System.out.println("--------------------------------");
		userService.signIn("aaaaaaaaa", "123"); //girilen bilgiler yanlış
		System.out.println("--------------------------------");
		userService.userVerify(user1);
	}

}
