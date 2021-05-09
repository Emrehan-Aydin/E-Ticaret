import business.concretes.AccountManager;
import core.concretes.GoogleServiceAdapter;
import dataAccess.concretes.HibernateAccountDao;
import entities.concretes.Account;

public class Main {

	public static void main(String[] args) {
		AccountManager accountManager = new AccountManager(
				new HibernateAccountDao(), new GoogleServiceAdapter());
		
		
		
		Account account = new Account(1,"Emre","Aydýn","abc@gmail.com","123456");
		accountManager.add(account);
	}

}
