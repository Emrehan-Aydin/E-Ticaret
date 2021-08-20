import business.concretes.AccountManager;
import core.concretes.GoogleServiceAdapter;
import dataAccess.concretes.HibernateAccountDao;
import entities.concretes.Account;

public class Main {
	public static void main(String[] args) {
		AccountManager accountManager = new AccountManager(
				new HibernateAccountDao(), new GoogleServiceAdapter());
		Account account = new Account(3,"Onur","GOZ","abcD@gmail.com","1234566");
		accountManager.add(account);

	}

}
