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
		// parola uzunluk sýnýrý
		if(account.getName().length() <=2 && account.getLastName().length()<=2)
		{
			System.out.println("Ýsim veya Soyisim en az iki karakter içermektedir.");
		}
		if(account.getPassword().length()<=6)
		{
			System.out.println("Parolanýz 6 karakterden daha uzun olmalý!.");
		}
		
		/* E mail kontrol sýnýfý
		for (Account checkemail : accountDao.getall()) {
			if(checkemail.getEmail() == account.getEmail())
			{
				System.out.println("Bu E-mail daha önceden kullanýlmýþ!");
			}
			
		}*/
		
		permissionService.checkEmail();
		permissionService.confirmEmail();
		accountDao.add(account);
	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
