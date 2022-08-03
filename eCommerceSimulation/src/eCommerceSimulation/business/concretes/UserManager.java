package eCommerceSimulation.business.concretes;


import eCommerceSimulation.business.abstracts.EmailService;
import eCommerceSimulation.business.abstracts.UserCheckService;
import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class UserManager implements UserService {

	
	
	boolean status= false;
	
	private UserDao userDao;
	private UserCheckService userCheckService;
	private EmailService emailService;
	
	
	
	
	
	
	
	public UserManager(UserDao userDao, UserCheckService userCheckService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.emailService = emailService;
	}

	@Override
	public void signIn(String email, String password) {

		if (userCheckService.checkEmailValidation(email)==false && userCheckService.checkPassword(password)== false) {
			System.out.println("girilen bilgiler yanliş");
		}else if (userCheckService.checkEmailValidation(email)==false) {
			System.out.println("yanlış email adresi girdiniz");
		}else if (userCheckService.checkPassword(password)==false) {
			System.out.println("yanlış şifre girdiniz min 7 haneli olmalı");
		}else {
			System.out.println("sisteme giriş başarılı");
		}
		
		
	}

	
	@Override
	public void signUp(User user) {
		
		if (userCheckService.validate(user)== true) {

			if (userDao.getByEmail(user.getEmail()) == false) {
				emailService.sendEmail("Deneme doğrulama mesajıdır. sisteme başarılı bir şekilde giriş yapıldı Doğrulamak için kodlama.io/dogrula adresine gidin.", user.getEmail());
				status= true;
			} else {
				System.out.println("Email daha önce kullanýlmýþ");
				status = false;
				
			}
		} else {
			status= false;
			System.out.println("sisteme başırılı ile kayıt yapılmadı ");

			
		}
		
		
	}

	@Override
	public void userVerify(User user) {

		if (status == true) {
			userDao.add(user);
			System.out
					.println("'" + user.getFirstName() + " " + user.getLastName() + "'" + " Kullanıcı sisteme eklendi");
			status = false;
		} else {
			System.out.println("Böyle bir kullanıcı bulunamadı.");
			status = false;
		}
		
		
	}

}
