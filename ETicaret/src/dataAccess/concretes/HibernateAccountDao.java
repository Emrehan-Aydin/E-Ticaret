package dataAccess.concretes;

import java.util.List;

import dataAccess.abstarcts.AccountDao;
import entities.concretes.Account;

public class HibernateAccountDao implements AccountDao{

	@Override
	public void add(Account account) {
		System.out.println(account.getName()+" DB ye eklendi.");
		
	}

	@Override
	public void delete(Account account) {
		
		
	}

	@Override
	public void update(Account account) {
		
		
	}

	@Override
	public Account get(int id) {
		
		return null;
	}

	@Override
	public List<Account> getall() {
	
		return null;
	}

}
