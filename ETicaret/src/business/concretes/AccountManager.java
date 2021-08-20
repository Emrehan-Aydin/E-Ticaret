package business.concretes;

import java.util.List;

import business.abstracts.AccountService;
import core.abstracts.PermissionService;
import dataAccess.abstarcts.AccountDao;
import entities.concretes.Account;

public class AccountManager implements AccountService{
	private AccountDao accountDao;
	private PermissionService permissionService;

	public AccountManager(AccountDao accountDao,PermissionService permissionService) {
		super();
		this.accountDao = accountDao;
		this.permissionService = permissionService;
	}

	@Override
	public void add(Account account) {
		// parola uzunluk s�n�r�
		if(account.getName().length() <=2 && account.getLastName().length()<=2)
		{
			System.out.println("�sim veya Soyisim en az iki karakter i�ermektedir.");
		}
		if(account.getPassword().length()<=6)
		{
			System.out.println("Parolan�z 6 karakterden daha uzun olmal�!.");
		}
		
		/* E mail kontrol s�n�f�
		for (Account checkemail : accountDao.getall()) {
			if(checkemail.getEmail() == account.getEmail())
			{
				System.out.println("Bu E-mail daha �nceden kullan�lm��!");
			}
			
		}*/
		
		permissionService.checkEmail();
		permissionService.confirmEmail();
		accountDao.add(account);
	}

	@Override
	public void delete(Account account) {
		
		
	}

	@Override
	public void update(Account account) {
		
		
	}

	@Override
	public List<Account> getAll() {
		
		return null;
	}

	@Override
	public Account get(int id) {
		
		return null;
	}

}
